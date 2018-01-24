package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import com.bcc.general.PropertyBagBean;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.RegisterABabyPage;

public class RegisterABabyPageInteractions {
	
	
	private static RegisterABabyPage registerABabyPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), RegisterABabyPage.class);
	
	public static void loadPage() {
		String birthRegistrationsHomePage = System.getProperty("birth.registrations.home.page");
		
		if(birthRegistrationsHomePage == null || birthRegistrationsHomePage.isEmpty()){
			birthRegistrationsHomePage = PropertyBagBean.getInstance().getConfigProperty("birth.registrations.home.page");
		}
		
		BrowserDriver.loadPage(birthRegistrationsHomePage);
	}
	
	public static String getTitle() {
		return registerABabyPage.title.getText();
	}
	
	public static void clickBookNowBtn(){
		registerABabyPage.bookNowBtn.click();
	}

	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(registerABabyPage.title);
		return registerABabyPage.title.isDisplayed();
	}
}
