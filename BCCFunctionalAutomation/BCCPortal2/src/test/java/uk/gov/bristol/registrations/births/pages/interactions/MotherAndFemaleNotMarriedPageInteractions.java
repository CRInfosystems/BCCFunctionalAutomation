package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.MotherAndFemaleNotMarriedPage;

public class MotherAndFemaleNotMarriedPageInteractions extends CommonPageInteractions {
	
	private static MotherAndFemaleNotMarriedPage motherAndFemaleNotMarriedPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MotherAndFemaleNotMarriedPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(motherAndFemaleNotMarriedPage.title);
		return motherAndFemaleNotMarriedPage.title.isDisplayed();
	}
	
	public static boolean isAdvisePanelDisplayed(){
		return motherAndFemaleNotMarriedPage.advisePanel.isDisplayed();
	}

}
