package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.BabyBornOutsideBristolCityPage;

public class BabyBornOutsideBristolCityPageInteractions {
	
	private static BabyBornOutsideBristolCityPage babyBornOutsideBristolCityPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), BabyBornOutsideBristolCityPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(babyBornOutsideBristolCityPage.title);
		return babyBornOutsideBristolCityPage.title.isDisplayed();
	}
	
	public static String getTitle() {
		return babyBornOutsideBristolCityPage.title.getText();
	}
	
	public static void clickBookAnAppointmentBtn(){
		babyBornOutsideBristolCityPage.bookAnAppointmentBtn.click();
	}
	
}
