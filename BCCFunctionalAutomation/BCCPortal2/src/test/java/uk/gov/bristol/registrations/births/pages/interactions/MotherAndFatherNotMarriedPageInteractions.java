package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.MotherAndFatherNotMarriedPage;

public class MotherAndFatherNotMarriedPageInteractions extends CommonPageInteractions {
	
	private static MotherAndFatherNotMarriedPage motherAndFatherNotMarriedPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MotherAndFatherNotMarriedPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(motherAndFatherNotMarriedPage.title);
		return motherAndFatherNotMarriedPage.title.isDisplayed();
	}
	
	public static boolean isAdvisePanelDisplayed(){
		return motherAndFatherNotMarriedPage.advisePanel.isDisplayed();
	}

}
