package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.MotherAndFemaleMarriageStatusPage;

public class MotherAndFemaleMarriageStatusPageInteractions extends CommonPageInteractions {
	
	private static MotherAndFemaleMarriageStatusPage motherAndFemalePage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MotherAndFemaleMarriageStatusPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(motherAndFemalePage.title);
		return motherAndFemalePage.title.isDisplayed();
	}
	
	public static boolean isErrorMsgDisplayed(){
		return motherAndFemalePage.errorMsg.isDisplayed();
	}

}
