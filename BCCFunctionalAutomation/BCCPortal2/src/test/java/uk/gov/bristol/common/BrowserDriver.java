package uk.gov.bristol.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bcc.general.PropertyBagBean;

/**
 * The Class BrowserDriver.
 * @author Chris Newton
 */
public class BrowserDriver {

	/** The Constant BROWSER_TYPE. */
	private static final String BROWSER_TYPE = "BROWSER_TYPE";
	
	/** The Constant propertyBag. */
	private static final PropertyBagBean propertyBag = PropertyBagBean.getInstance();
	
	/** The driver. */
	private static WebDriver driver;
	
	/** The server path. */
	private static String SERVER_PATH = getServerPath();
	
	/**
	 * The Enum Browser.
	 */
	enum Browser {    
    	/** The firefox. */
    	FIREFOX, 
    	/** The ie. */
    	IE, 
 		/** The chrome. */
 		CHROME
	}
		
	
	/**
	 * Gets the current driver.
	 *
	 * @return the current driver
	 */
	public synchronized static WebDriver getCurrentDriver() {

		if (driver == null) {
			
			try {
				
				if (propertyBag.getConfigProperty(BROWSER_TYPE).equalsIgnoreCase(Browser.FIREFOX.name())) {
					driver = new FirefoxDriver();
				}else if (propertyBag.getConfigProperty(BROWSER_TYPE).equalsIgnoreCase(Browser.IE.name())) {
					driver = new InternetExplorerDriver();
				}else if (propertyBag.getConfigProperty(BROWSER_TYPE).equalsIgnoreCase(Browser.CHROME.name())) {
					driver = new ChromeDriver();
				}

			} finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}
		}
		
		return driver;
	}

	/**
	 * The Class BrowserCleanup.
	 */
	private static class BrowserCleanup implements Runnable {
		
		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		public void run() {
			close();
		}
	}

	/**
	 * Load page.
	 *
	 * @param path the path
	 */
	public static void loadPage(String path) {
		getCurrentDriver().get(SERVER_PATH + path);
	}
	
	/**
	 * Wait for element.
	 *
	 * @param elementToWaitFor the element to wait for
	 * @return the web element
	 */
	public static WebElement waitForElement(WebElement elementToWaitFor) {
		return waitForElement(elementToWaitFor, null);
	}

	/**
	 * Wait for element.
	 *
	 * @param elementToWaitFor the element to wait for
	 * @param waitTimeInSeconds the wait time in seconds
	 * @return the web element
	 */
	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
		
		if (waitTimeInSeconds == null) {
			waitTimeInSeconds = 10;
		}

		WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
		return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}
	
	/**
	 * Close.
	 */
	public static void close() {
		try {
			getCurrentDriver().quit();
			driver = null;
		} catch (UnreachableBrowserException e) {
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private static String getServerPath(){
		String serverPath = System.getProperty("server.path");
		
		if(serverPath == null || serverPath.isEmpty()){
			serverPath = propertyBag.getConfigProperty("server.path");
		}
		
		return serverPath;
	}
}