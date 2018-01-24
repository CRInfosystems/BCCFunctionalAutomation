package com.bcc.general;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.ScenarioType;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.embedder.Embedder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import uk.gov.bristol.common.BrowserDriver;


public abstract class StoryBase extends Embedder {

	private static final String PRINT_SCREEN_ON_ERROR = "PRINT_SCREEN_ON_ERROR";
	private static final String PRINT_SCREEN_LOCATION = "PRINT_SCREEN_LOCATION";
	
	public static final String HOME_PAGE = "HOME_PAGE";
	public static final String PARKING_HOME_PAGE = "PARKING_HOME_PAGE";
	public static final String ROUTING_HOME_PAGE = "ROUTING_HOME_PAGE";
	public static final String COMPLAINTS_NONSTATUTORY_HOME_PAGE = "COMPLAINTS_NONSTATUTORY_HOME_PAGE";
	public static final String COMPLAINTS_STATUTORY_HOME_PAGE = "COMPLAINTS_STATUTORY_HOME_PAGE";
	public static final String FOI_HOME_PAGE = "FOI_HOME_PAGE";
	public static final String FEEDBACK_HOME_PAGE = "FEEDBACK_HOME_PAGE";
	public static final String CT_HOME_PAGE = "CT_HOME_PAGE";
	public static final String COMPLAINTS_FEEDBACK_HOME_PAGE = "COMPLAINTS_FEEDBACK_HOME_PAGE";
	public static final String BCC_SERVICE_HOME_PAGE = "BCC_SERVICE_HOME_PAGE";
	public static final String SIGN_IN_MENU = "HOME.SIGNIN_MENU";
	public static final String SIGN_OUT_MENU = "HOME.SIGNOUT";
	public static final String LOGOUT_ON_EXCEPTION = "LOGOUT_ON_EXCEPTION";
	protected static final String SIGNOUT = "HOME.SIGNOUT";
    protected static final String USER_NAME = "LOGIN.USER_NAME";
    protected static final String PASSWORD = "LOGIN.PASSWORD";
    protected static final String SIGN_IN ="LOGIN.SIGNIN_BUTTON";
    
    
  
    
	protected static final String ROUTING_HOUSING = "ROUTING.HOUSING";
	protected static final String ROUTING_CHILDERENANDYOUNGPEOPLESERVICE = "ROUTING.CHILDERENANDYOUNGPEOPLESERVICE";
	protected static final String HOUSING_COUNCILHOUSING = "HOUSING.COUNCILHOUSING";
	protected static final String HOUSING_REHOUSING = "HOUSING.REHOUSING";
	protected static final String HOUSING_HOUSINGBENEFITS = "HOUSING.HOUSINGBENEFITS";
	protected static final String HOUSING_ACCESSIBLEHOMES = "HOUSING.ACCESSIBLEHOMES";
	protected static final String HOUSING_PRIVATEHOUSING = "HOUSING.PRIVATEHOUSING";
	protected static final String HOUSING_OTHERHOUSING = "HOUSING.OTHERHOUSING";
	protected static final String CHILDERENANDYOUNGPEOPLESERVICE_SOCIALWORKSERVICE = "CHILDERENANDYOUNGPEOPLESERVICE.SOCIALWORKSERVICE";
	protected static final String COMPLAINTS_MAKECOMPLAINT = "COMPLAINTS.MAKECOMPLAINT";
	
	
	protected static final String HOME_COMPLAINTSANDFEEDBACK = "HOME.COMPLAINTSANDFEEDBACK";
	protected static final String HOME_PARKINGPERMITS = "HOME.PARKINGPERMITS";

	protected static final String HOME_PARKINGRENEWALS = "HOME.PARKINGRENEWALS";
	protected static final String HOME_CT_PAGE = "HOME.CT_PAGE";
	
	protected static final String COMPLAINTS_EQUALITIESMONITOR = "COMPLAINTS.EQUALITIESMONITOR";
	protected static final String COMPLAINTS_SUBMITINFORMATION = "COMPLAINTS.SUBMITINFORMATION";
	protected static final String COMPLAINTS_AGE = "COMPLAINTS.AGE";
	protected static final String COMPLAINTS_GENDER = "COMPLAINTS.GENDER";
	protected static final String COMPLAINTS_TRANSGENDER = "COMPLAINTS.TRANSGENDER";
	protected static final String COMPLAINTS_ETHNICITY = "COMPLAINTS.ETHNICITY";
	protected static final String COMPLAINTS_RELIGIOUSBELIEF = "COMPLAINTS.RELIGIOUSBELIEF";
	protected static final String COMPLAINTS_DISABILITIES = "COMPLAINTS.DISABILITIES";
	protected static final String COMPLAINTS_SEXUALORIENTATION = "COMPLAINTS.SEXUALORIENTATION";
	protected static final String COMPLAINTS_EQAUALITYMONITORTHANKQ = "COMPLAINTS.EQAUALITYMONITORTHANKQ";
	
	protected static final String CT_EQUALITIES = "CT.EQUALITIES";
	  
	public  String equalitycheck;
	
	protected String theirage;
	protected String theirgender;
	protected String theirtransgender;
	protected String theiethnicity;
	protected String theirrelegion;
	protected String theirdisablility;
	protected String theirsexual;
	
    public  static String emailaddress;
    protected String complainttype;
	protected String complaintsubtype;
    
    
	//public static final String SLEEP = "SLEEP";
	public  static final String TIME_OUT_IN_SECONDS = "SLEEP";
	public  static final String LONG_SLEEP = "LONGSLEEP";
	
	private static int timeOutInSeconds = 0;
	
	protected static final PropertyBagBean propertyBag = PropertyBagBean.getInstance();
	
	public static enum ByType {
	    ID, NAME, XPATH
	}
	
	private static String currentStepName ;
	
	private static String currentScenarioName;
	
	//Login details for the user
	public String email;
	
    protected String password;
	
	protected static WebDriver driver;
	static {
		try {
			driver = BrowserDriver.getCurrentDriver();
			
			if (driver != null) {
				maximise();
				driver.manage().timeouts().implicitlyWait(getTimeOutInSeconds(), TimeUnit.SECONDS);
				/*DesiredCapabilities capability = DesiredCapabilities.firefox();
				capability.setCapability("jenkins.nodeName","(master)");
				driver = new RemoteWebDriver(new URL("http://l-dssbld-app1.bcc.lan:4444/wd/hub"), capability);*/
			}
			
			
			//Delete the screenshots created by the last run
			File folder = new File(propertyBag.getConfigProperty(PRINT_SCREEN_LOCATION));
			File[] files = folder.listFiles();
		    if(files!=null) { 
		        for(File f: files) {
		            f.delete();
		         }
		    }
			
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}


	/*@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration().useStoryLoader(
				new LoadFromClasspath(this.getClass().getClassLoader()))
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.HTML, Format.CONSOLE )
								.withRelativeDirectory("jbehave-report"));
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(), this)
				.createCandidateSteps();
	}*/
	
	public static int getTimeOutInSeconds(){
		if (timeOutInSeconds == 0) {
			try {
				timeOutInSeconds = Integer.parseInt(propertyBag.getConfigProperty(TIME_OUT_IN_SECONDS));
			} catch (NumberFormatException nfe) {
				timeOutInSeconds = 10;
			}
		}
		return timeOutInSeconds;
	}
	
	//ToDo: Consider removing this method as we have turned on implicit Waiting
	public void pause() throws InterruptedException {
		//Thread.sleep(4000);
	}
	
	public WebElement findElementById(String elementId, String type) {
		
		Wait<WebDriver> wait = new WebDriverWait(driver, getTimeOutInSeconds());
		WebElement element = null;
		if (type.equalsIgnoreCase(ByType.ID.name())) {
			//element= wait.until(visibilityOfElementLocated(By.id("some_id")));		
			element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
		} else if (type.equalsIgnoreCase(ByType.NAME.name())) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(elementId)));
		} else if (type.equalsIgnoreCase(ByType.XPATH.name())) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
		} else {
			throw new NoSuchElementException("Element not found");
		}
		return element;
		//WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
	}
	
	public String captureScreen() {

	    if ("Y".equals(propertyBag.getConfigProperty(PRINT_SCREEN_ON_ERROR))){
            String path;
            try {
                File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                String fileExtension = source.getName().substring((source.getName().lastIndexOf(".")));
                
                
                path = getPrintScreenPath() + currentScenarioName+"_"+currentStepName + fileExtension;
                FileUtils.copyFile(source, new File(path)); 
            }
            catch(IOException e) {
                path = "Failed to capture screenshot: " + e.getMessage();
            }
            return path;
	    }
	    return null;

    }
	
	/*public ExpectedCondition<WebElement> visibilityOfElementLocated(final By locator) {
		return new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement toReturn = driver.findElement(locator);
				if (toReturn.isDisplayed()) {
					return toReturn;
				}
				return null;
		    }
		};
	}*/
	
	public static void assertStringEquals(String actualMsg, String expectedMsg) {
		if (actualMsg != null && expectedMsg != null) {
			boolean stringcompare = actualMsg.equalsIgnoreCase(expectedMsg);
			if(stringcompare){
				actualMsg = expectedMsg;
			}
		}
		Assert.assertEquals(expectedMsg ,actualMsg);
	}
	
	public static void assertStringContains(String actualMsg, String expectedMsg) 
	{
		if (actualMsg != null && expectedMsg != null) {
			if(actualMsg.contains(expectedMsg))
			{
				expectedMsg = actualMsg;
			}
		}
		Assert.assertEquals(expectedMsg, actualMsg);
	
	}
	
	public static void maximise() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenResolution = new Dimension((int) toolkit.getScreenSize().getWidth() - 80, (int) toolkit.getScreenSize().getHeight() - 40);

        driver.manage().window().setSize(screenResolution);

    }
	
	
	/**
	 * methods below added to enable screenshot capture after a failed scenario
	 */
	
	@AfterScenario(uponOutcome=AfterScenario.Outcome.FAILURE, uponType=ScenarioType.EXAMPLE)
    public void afterFailedScenarioExample() {
        captureScreen();
    }
	
	@AfterScenario(uponOutcome=AfterScenario.Outcome.FAILURE, uponType=ScenarioType.NORMAL)
    public void afterFailedScenario() {
        captureScreen();
    }


    /**
     * @return the currentStepName
     */
    public static String getCurrentStepName() {
        return currentStepName;
    }

    /**
     * @param currentStepName the currentStepName to set
     */
    public static void setCurrentStepName(String currentStepName) {
        StoryBase.currentStepName = currentStepName;
    }

    /**
     * @return the currentScenarioName
     */
    public static String getCurrentScenarioName() {
        return currentScenarioName;
    }

    /**
     * @param currentScenarioName the currentScenarioName to set
     */
    public static void setCurrentScenarioName(String currentScenarioName) {
        StoryBase.currentScenarioName = currentScenarioName;
    }
    
    
    //below are all the re-usable steps across all stories
    
    public void openHomePage() throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(HOME_PAGE));
        pause();
    }
    
    
    public void openParkingHomePage()throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(PARKING_HOME_PAGE));
        pause();
    }
    
    public void openRoutingHomePage()throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(ROUTING_HOME_PAGE));
        pause();
    }    
    
    public void openComplaintsNonStatutoryHomePage()throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(COMPLAINTS_NONSTATUTORY_HOME_PAGE));
        pause();
    }
    
    public void openComplaintsStatutoryHomePage()throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(COMPLAINTS_STATUTORY_HOME_PAGE));
        pause();
    }
    
    public void openFoiHomePage()throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(FOI_HOME_PAGE));
        pause();
    }
    
    public void openFeedbackHomePage()throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(FEEDBACK_HOME_PAGE));
        pause();
    }
    

    public void openCTHomePage()throws InterruptedException {
    	//The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(CT_HOME_PAGE));
    }
    
    public void openStatutoryFeedbackHomePage() throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(FEEDBACK_HOME_PAGE));
        pause();
    }
    
    public void openHomeComplaintsFeedback() throws InterruptedException {
        //The previous story may have failed and left us in a logged in state. 
        //Sign out
        signOutIfSignedIn();
        
        driver.get(propertyBag.getConfigProperty(BCC_SERVICE_HOME_PAGE));
        pause();
    }
    
    public void signOutIfSignedIn() {

        try{
            driver.findElement(By.id(propertyBag.getPageProperty(SIGNOUT))).click();       
        }catch (NoSuchElementException e){
            driver.get(propertyBag.getConfigProperty(LOGOUT_ON_EXCEPTION));
        }
    }
    
    public void clickSignOut() {
        driver.findElement(By.id(propertyBag.getPageProperty(SIGNOUT))).click();
    }
    
    public void signInPage() throws InterruptedException {
        try {
            driver.findElement(By.id(propertyBag.getPageProperty(SIGN_IN_MENU))).click();
            pause();
        } catch (NoSuchElementException nse) {
            //call sign-out in case signin link is not found
            signout();
            //try sign-in again
            driver.findElement(By.id(propertyBag.getPageProperty(SIGN_IN_MENU))).click();
            pause();
        }
    }
    

    
    public void userName(String userName) {
    	emailaddress = userName;
    	System.out.println(emailaddress);
    	System.out.println(userName);
        driver.findElement(By.id(propertyBag.getPageProperty(USER_NAME)))
                .sendKeys(userName);
        
    }
    
    public void enterPassword(String password) {
        driver.findElement(By.id(propertyBag.getPageProperty(PASSWORD))).sendKeys(password);
    }
    
    public void clickSignIn() throws InterruptedException {
        driver.findElement(By.name(propertyBag.getPageProperty(SIGN_IN))).click();
        pause();
            }
    
    
   
    
    @Given("user opens bcc home page")
    public void launchHomePage() throws InterruptedException, IOException {

        openHomePage();
        pause();
        
    }
    
    
    @Given("user opens bcc parking home page")
    public void lauchParkingHomePage()throws InterruptedException, IOException {

        openParkingHomePage();
        pause();
        
    }
    
    @Given("user opens bcc foi home page")
    public void lauchfoiHomePage()throws InterruptedException, IOException {

    	openFoiHomePage();
        pause();
        
    }
    
    @Given("user opens routing home page")
    public void launchroutingHomePage()throws InterruptedException, IOException {

    	openRoutingHomePage();
        pause();
        
    }
    
    @Given("user opens bcc complaints non statutory home page")
    public void lauchcomplaintsHomePage()throws InterruptedException, IOException {

    	openComplaintsNonStatutoryHomePage();
        pause();
        
    }
    
    
    @Given("user opens bcc complaints statutory home page")
    public void lauchStatcomplaintsHomePage()throws InterruptedException, IOException {

    	openComplaintsStatutoryHomePage();
        pause();
        
    }
    
    @Given("user opens bcc feedback home page")
    public void launchFeedbackHomePage()throws InterruptedException, IOException {

    	openFeedbackHomePage();
        pause();
        
    }
    
    @When("user navigates to concessionary travel page")
    public void launchCtPage()
    {
    	driver.findElement(By.xpath(propertyBag.getPageProperty(HOME_CT_PAGE))).click();	
    }

    @Given("user opens bcc statutory feedback home page")
    public void launchStatutoryFeedbackHomePage()throws InterruptedException, IOException {

    	openStatutoryFeedbackHomePage();
        pause();
    }
    
    @Given("user opens BCC Service Home Page")
    public void HomeComplaintsFeedback() throws InterruptedException
    {
    	openHomeComplaintsFeedback();
        pause();
    }
    
    @When("user cliks on Make a complaint or give feedback")
    public void clickMakeComplaintorfeedback()
    {
    	driver.findElement(By.xpath(propertyBag.getPageProperty(HOME_COMPLAINTSANDFEEDBACK))).click();	
    }
    
    @When("user clicks on Get Resident or visitor permits")
    public void voidclickResident()
    {
    	//HOME_PARKINGPERMITS
    	driver.findElement(By.xpath(propertyBag.getPageProperty(HOME_PARKINGPERMITS))).click();	
    }
    
    
    @When("user clicks on renew a resident parking permit")
    public void voidclickrenewResidentPremit()
    {
    	//HOME_PARKINGPERMITS
    	driver.findElement(By.xpath(propertyBag.getPageProperty(HOME_PARKINGRENEWALS))).click();	
    }
    
    @Then("user clicks on sign out button")
    public void signout() throws InterruptedException {
        clickSignOut();
        
    }
    
    @When("user clicks sign in button")
    public void clickSignin() throws InterruptedException
    {
        signInPage();
        pause();
    }
    
    @When("user enters username <email>")
    public void userEntersUsername(@Named("email") String email) {
        this.email = email;
        userName(this.email); 
    }

    @When("user enters password <password>")
    public void userEntersPassword(@Named("password") String password) {
        this.password = password;
        enterPassword(this.password);
    }

    @When("user clicks Sign in")
    public void userClicksSignIn() throws InterruptedException {
        clickSignIn();
        
    }	
    
    
    // need to merge once the complaints and feedback is done
    
	@When("user navigates via main routing page :<complainttype>")
	public void mainRouting(@Named("complainttype") String complainttype)
	{
		this.complainttype = complainttype;
		System.out.println(this.complainttype);
		int complainttypemode = 0 ;
		if(this.complainttype.equalsIgnoreCase("Housing"))
			complainttypemode = 1;
		if(this.complainttype.equalsIgnoreCase("childerenandyoungservice"))
			complainttypemode = 8;
			
		switch (complainttypemode)
		{
			case 1:
				driver.findElement(By.xpath(propertyBag.getPageProperty(ROUTING_HOUSING))).click();
				break;
			case 8 :
				driver.findElement(By.xpath(propertyBag.getPageProperty(ROUTING_CHILDERENANDYOUNGPEOPLESERVICE))).click();
				break;
				
		}
	}
	
	@When("user navigates via to sub routing page :<complaintsubtype>")
	public void housingRouting(@Named("complaintsubtype") String complaintsubtype)
	{
		this.complaintsubtype = complaintsubtype;
		
		int complainttypemode = 0 ;
		if(this.complaintsubtype.equalsIgnoreCase("Council housing management and caretaking"))
					complainttypemode = 1;
		else if(this.complaintsubtype.equalsIgnoreCase("Rehousing"))
					complainttypemode = 2;
		else if(this.complaintsubtype.equalsIgnoreCase("Housing benefits and rent"))
					complainttypemode = 3;
		else if(this.complaintsubtype.equalsIgnoreCase("Accessible homes"))
					complainttypemode = 4;
		else if(this.complaintsubtype.equalsIgnoreCase("Private housing"))
					complainttypemode = 5;
		else if(this.complaintsubtype.equalsIgnoreCase("Other housing complaints"))
					complainttypemode = 6;
		else if (this.complaintsubtype.equalsIgnoreCase("socialworkservice"))
			      complainttypemode = 7;
			
		System.out.println(complainttypemode);
		
		switch (complainttypemode)
		{
			case 1:
				driver.findElement(By.xpath(propertyBag.getPageProperty(HOUSING_COUNCILHOUSING))).click();
				break;
				
			case 2:
				driver.findElement(By.xpath(propertyBag.getPageProperty(HOUSING_REHOUSING))).click();
				break;
				
			case 3:
				driver.findElement(By.xpath(propertyBag.getPageProperty(HOUSING_HOUSINGBENEFITS))).click();
				break;
				
			case 4:
				driver.findElement(By.xpath(propertyBag.getPageProperty(HOUSING_ACCESSIBLEHOMES))).click();
				break;
				
			case 5:
				driver.findElement(By.xpath(propertyBag.getPageProperty(HOUSING_PRIVATEHOUSING))).click();
				break;
				
			case 6:
				driver.findElement(By.xpath(propertyBag.getPageProperty(HOUSING_OTHERHOUSING))).click();
				break;
				
			case 7:
				driver.findElement(By.xpath(propertyBag.getPageProperty(CHILDERENANDYOUNGPEOPLESERVICE_SOCIALWORKSERVICE))).click();
				break;
		}
		
	}
	
	// Equalities monitor
	
	@When("user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>")
	public void clickEqualityMonitor(@Named("equalitycheck") String equalitycheck , @Named("theirage") String thierage , @Named("theirgender") String theirgender , @Named("theirtransgender") String theirtransgender , @Named("theiethnicity") String theiethnicity ,@Named("theirrelegion") String theirrelegion ,@Named("theirdisablility") String theirdisablility , @Named("theirsexual") String theirsexual)
	{
		this.equalitycheck = equalitycheck;
		if(this.equalitycheck.equalsIgnoreCase("Y"))
		{
		   driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_EQUALITIESMONITOR))).click();
		
		   this.theirage = theirage;
		   System.out.println(this.theirage);
			   
			   
		   ///age radio button
		   List <WebElement> oRadioAge =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_AGE)));
			
			
			for(WebElement radiobutton : oRadioAge )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theirage))
				{
					radiobutton.click();
					break;
				}
			}
			
		   // gender
			this.theirgender = theirgender;
			System.out.print(this.theirgender);
			
	           List <WebElement> oRadioGender =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_GENDER)));
			
				
			for(WebElement radiobutton : oRadioGender )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theirgender))
				{
					radiobutton.click();
					break;
				}
			}
				
			//transgender
			this.theirtransgender = theirtransgender;
	           List <WebElement> oRadioTransgender =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_TRANSGENDER)));
			
				
			for(WebElement radiobutton : oRadioTransgender )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theirtransgender))
				{
					radiobutton.click();
					break;
				}
			}
		
				
			//Ethnicity
			this.theiethnicity = theiethnicity;
	           List <WebElement> oRadioEthnicity =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_ETHNICITY)));
				
				
			for(WebElement radiobutton : oRadioEthnicity )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theiethnicity))
				{
					radiobutton.click();
					break;
				}
			}
				
			//Religion/Belief
			this.theirrelegion = theirrelegion;
	           List <WebElement> oRadioReligion =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_RELIGIOUSBELIEF)));
				
				
			for(WebElement radiobutton : oRadioReligion )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theirrelegion))
				{
					radiobutton.click();
					break;
				}
			}
				
			//Disability
			this.theirdisablility = theirdisablility;
	           List <WebElement> oRadioDisability =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_DISABILITIES)));
				
				
			for(WebElement radiobutton : oRadioDisability )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theirdisablility))
				{
					radiobutton.click();
					break;
				}
			}
				
			//Sexual Orientation
			this.theirsexual = theirsexual;
	           List <WebElement> oRadioSexual =   driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_SEXUALORIENTATION)));
				
				
			for(WebElement radiobutton : oRadioSexual )
			{
				if(radiobutton.getAttribute("value").equalsIgnoreCase(this.theirsexual))
				{
					radiobutton.click();
					break;
				}
			}
				
			driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_SUBMITINFORMATION))).click();
			
			Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_EQAUALITYMONITORTHANKQ))).size() > 0;
			System.out.println(val);
			Assert.assertTrue("system should navigate to the thank you page of Equality Monitor", val);
			
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private static String getPrintScreenPath(){
		String printScreenPath = System.getProperty("print.screen.path");
		
		if(printScreenPath == null || printScreenPath.isEmpty()){
			printScreenPath = propertyBag.getConfigProperty(PRINT_SCREEN_LOCATION);
		}
		
		return printScreenPath;
	}

}
