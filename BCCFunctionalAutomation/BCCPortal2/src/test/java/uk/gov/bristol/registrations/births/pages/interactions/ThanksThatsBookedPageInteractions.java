package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.ThanksThatsBookedPage;

public class ThanksThatsBookedPageInteractions extends CommonPageInteractions{
	
	private static ThanksThatsBookedPage thanksThatsBookedPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ThanksThatsBookedPage.class);
	
	public static String getTitle() {
		return thanksThatsBookedPage.title.getText();
	}

	public static String getAppointmentDate() {
		return thanksThatsBookedPage.appointmentDate.getText();
	}
	
	public static String getAppointmentLocation() {
		return thanksThatsBookedPage.appointmentLocation.getText();
	}
	
	public static boolean isEmailAddressDisplayed(){
		return isDisplayed(thanksThatsBookedPage.emailAddress);
	}

	public static String getEmailAddress(){
		return thanksThatsBookedPage.emailAddress.getText();
	}
	
	public static boolean isCornStAddressDisplayed(){
		return isDisplayed(thanksThatsBookedPage.cornStAddress);
	}
	
	public static boolean isSouthmeadAddressDisplayed(){
		return isDisplayed(thanksThatsBookedPage.southmeadAddress);
	}

	public static boolean isDeclarationDisplayed(){
		return isDisplayed(thanksThatsBookedPage.declaration);
	}
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(thanksThatsBookedPage.title, 30);
		return thanksThatsBookedPage.title.isDisplayed();
	} 
}
