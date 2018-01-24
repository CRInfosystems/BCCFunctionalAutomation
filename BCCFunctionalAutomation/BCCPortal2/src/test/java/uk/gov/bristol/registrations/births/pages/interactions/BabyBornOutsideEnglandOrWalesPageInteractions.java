package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.BabyBornOutsideBristolCityPage;
import uk.gov.bristol.registrations.births.pages.BabyBornOutsideEnglandOrWalesPage;

public class BabyBornOutsideEnglandOrWalesPageInteractions {
	
	private static BabyBornOutsideEnglandOrWalesPage babyBornOutsideEnglandOrWalesPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), BabyBornOutsideEnglandOrWalesPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(babyBornOutsideEnglandOrWalesPage.title);
		return babyBornOutsideEnglandOrWalesPage.title.isDisplayed();
	}
	
	public static String getTitle() {
		return babyBornOutsideEnglandOrWalesPage.title.getText();
	}	
	
}
