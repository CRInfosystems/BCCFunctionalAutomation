package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.MotherAndFatherMarriageStatusPage;

public class MotherAndFatherMarriageStatusPageInteractions extends CommonPageInteractions{
	
	private static MotherAndFatherMarriageStatusPage motherAndFatherMarriageStatusPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MotherAndFatherMarriageStatusPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(motherAndFatherMarriageStatusPage.title);
		return motherAndFatherMarriageStatusPage.title.isDisplayed();
	}


	
}
