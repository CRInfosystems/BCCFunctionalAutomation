package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.AboutYourBabyPage;

public class AboutYourBabyPageInteractions extends CommonPageInteractions {

	private static AboutYourBabyPage aboutYourBabyPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AboutYourBabyPage.class);
	
	public static String getTitle() {
		return aboutYourBabyPage.title.getText();
	}
	
	public static boolean isBabiesQtyErrorMsgDisplayed(){
		return aboutYourBabyPage.babiesQtyErrorMsg.isDisplayed();
	}

	public static String getInvalidDOBErrorMsg(){
		return aboutYourBabyPage.invalidDOBErrorMsg.getText();
	}
	
	public static boolean isInvalidDOBErrorMsgDisplayed(){
		return aboutYourBabyPage.invalidDOBErrorMsg.isDisplayed();
	}
	
	public static boolean isMothersFirstNameErrorMsgDisplayed(){
		return aboutYourBabyPage.mothersFirstNameErrorMsg.isDisplayed();
	}
	
	public static boolean isMothersLastNameErrorMsgDisplayed(){
		return aboutYourBabyPage.mothersLastNameErrorMsg.isDisplayed();
	}
	
	public static boolean isOneBabyRadioSelected(){
		return aboutYourBabyPage.oneBabyRadio.isSelected();
	}

	public static void selectOneBaby(){
		aboutYourBabyPage.oneBabyRadio.click();
	}
	
	public static boolean isTwoOrThreeBabiesRadioSelected(){
		return aboutYourBabyPage.twoOrThreeBabiesRadio.isSelected();
	}

	public static void selectTwoOrThreeBabies(){
		aboutYourBabyPage.twoOrThreeBabiesRadio.click();
	}
	
	public static boolean isFourOrMoreBabiesRadioSelected(){
		return aboutYourBabyPage.fourOrMoreBabiesRadio.isSelected();
	}
	
	public static void selectFourOrMoreBabies(){
		aboutYourBabyPage.fourOrMoreBabiesRadio.click();
	}
	
	public static String getMotherFirstNameErrorMsgText(){
		return aboutYourBabyPage.mothersFirstNameErrorMsg.getText();
	}
	
	public static String getMotherLastNameErrorMsgText(){
		return aboutYourBabyPage.mothersLastNameErrorMsg.getText();
	}

	public static String getDOBDay(){
		Select select = new Select(aboutYourBabyPage.dobDay);
		return select.getFirstSelectedOption().getAttribute("value");
	}
	
	public static void setDOBDay(String day){
		Select select = new Select(aboutYourBabyPage.dobDay);
		select.selectByValue(day);
	}
	
	public static String getDOBMonth(){
		Select select = new Select(aboutYourBabyPage.dobMonth);
		return select.getFirstSelectedOption().getAttribute("value");
	}
	
	public static void setDOBMonth(String month){
		Select select = new Select(aboutYourBabyPage.dobMonth);
		select.selectByValue(month);
	}
	
	public static String getDOBYear(){
		Select select = new Select(aboutYourBabyPage.dobYear);
		return select.getFirstSelectedOption().getAttribute("value");
	}
	
	public static void setDOBYear(String year){
		Select select = new Select(aboutYourBabyPage.dobYear);
		select.selectByValue(year);
	}
	
	public static String getMothersFirstName(){
		return aboutYourBabyPage.mothersFirstName.getText();
	}
	
	public static void setMothersFirstName(String name){
		aboutYourBabyPage.mothersFirstName.clear();
		aboutYourBabyPage.mothersFirstName.sendKeys(name);
	}
	
	public static String getMothersLastName(){
		return aboutYourBabyPage.mothersLastName.getText();
	}
	
	public static void setMothersLastName(String name){
		aboutYourBabyPage.mothersLastName.clear();
		aboutYourBabyPage.mothersLastName.sendKeys(name);
	}
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(aboutYourBabyPage.title);
		return aboutYourBabyPage.title.isDisplayed();
	}	
}
