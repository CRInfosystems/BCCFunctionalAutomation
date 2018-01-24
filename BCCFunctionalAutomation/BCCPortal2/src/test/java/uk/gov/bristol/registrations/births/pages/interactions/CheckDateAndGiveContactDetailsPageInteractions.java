package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.CheckDateAndGiveContactDetailsPage;

public class CheckDateAndGiveContactDetailsPageInteractions {

	private static CheckDateAndGiveContactDetailsPage checkDateAndGiveContactDetailsPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CheckDateAndGiveContactDetailsPage.class);
	
	public static String getTitle() {
		return checkDateAndGiveContactDetailsPage.title.getText();
	}

	public static void isValidationErrorDisplayed(){
		BrowserDriver.waitForElement(checkDateAndGiveContactDetailsPage.validationError);
		checkDateAndGiveContactDetailsPage.validationError.isDisplayed();
	}	
	
	public static void clickNextBtn(){
		CommonPageInteractions.clickNextBtn();
	}
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(checkDateAndGiveContactDetailsPage.title);
		return checkDateAndGiveContactDetailsPage.title.isDisplayed();
	}	
	
	
	public static String getDisplayedAppointmentDayDate(){
		
		WebElement displayedAppointment = checkDateAndGiveContactDetailsPage.selectedAppointment.findElement(By.cssSelector(".panel__copy"));
		String daydate = displayedAppointment.getText().trim();
		System.out.println("Daydate: "+daydate);
		
		daydate = daydate.split("\\r?\\n")[0].trim();
		
		return daydate;
	}
	
	public static String getDisplayedAppointmentOffice(){
		
		WebElement displayedAppointment = checkDateAndGiveContactDetailsPage.selectedAppointment.findElement(By.cssSelector(".panel__copy"));
		String office = displayedAppointment.getText().trim();
		office = office.split("\\r?\\n")[1].trim();
		
		return office;
	}
	
	public static String getFirstName(){
		return checkDateAndGiveContactDetailsPage.firstName.getText();
	}
	
	public static void setFirstName(String firstName){
		checkDateAndGiveContactDetailsPage.firstName.clear();
		checkDateAndGiveContactDetailsPage.firstName.sendKeys(firstName);
	}
	
	public static String getLastName(){
		return checkDateAndGiveContactDetailsPage.lastName.getText();
	}
	
	public static void setLastName(String lastName){
		checkDateAndGiveContactDetailsPage.lastName.clear();
		checkDateAndGiveContactDetailsPage.lastName.sendKeys(lastName);
	}	
	
	public static String getEmail(){
		return checkDateAndGiveContactDetailsPage.email.getText();
	}
	
	public static void setEmail(String email){
		checkDateAndGiveContactDetailsPage.email.clear();
		checkDateAndGiveContactDetailsPage.email.sendKeys(email);
	}	
	
	public static String getMobile(){
		return checkDateAndGiveContactDetailsPage.mobile.getText();
	}
	
	public static void setMobile(String mobile){
		checkDateAndGiveContactDetailsPage.mobile.clear();
		checkDateAndGiveContactDetailsPage.mobile.sendKeys(mobile);
	}
	
	public static void clickChangeAppointmentLink(){
		WebElement changeAppointmentLink = checkDateAndGiveContactDetailsPage.selectedAppointment.findElement(By.cssSelector("a"));
		changeAppointmentLink.click();
	}
	
	public static void clickPrivacyLink(){
		checkDateAndGiveContactDetailsPage.privacyLink.click();
	}
	
	public static Boolean isPrivacyLinkDisplayed(){
		return checkDateAndGiveContactDetailsPage.privacyLink.isDisplayed();
	}
	
	public static String getPrivacyLinkHref(){
		return checkDateAndGiveContactDetailsPage.privacyLink.getAttribute("href");
	}
	
	public static String getPrivacyLinkTarget(){
		return checkDateAndGiveContactDetailsPage.privacyLink.getAttribute("target");
	}	

}
