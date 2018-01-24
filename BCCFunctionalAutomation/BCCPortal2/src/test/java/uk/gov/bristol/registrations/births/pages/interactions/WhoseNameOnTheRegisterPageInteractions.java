package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.WhoseNameOnTheRegisterPage;

public class WhoseNameOnTheRegisterPageInteractions extends CommonPageInteractions {
	
	private static WhoseNameOnTheRegisterPage whoseNameOnTheRegister = PageFactory.initElements(BrowserDriver.getCurrentDriver(), WhoseNameOnTheRegisterPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(whoseNameOnTheRegister.title);
		return whoseNameOnTheRegister.title.isDisplayed();
	}

	public static void selectMotherAndFather(){
		whoseNameOnTheRegister.motherAndFatherRadio.click();
	}
	
	public static boolean isMotherAndFatherRadioSelected(){
		return whoseNameOnTheRegister.motherAndFatherRadio.isSelected();
	}
	
	public static void selectJustMother(){
		whoseNameOnTheRegister.justMotherRadio.click();
	}
	
	public static boolean isJustMotherRadioSelected(){
		return whoseNameOnTheRegister.justMotherRadio.isSelected();
	}
	
	public static void selectMotherAndFemale(){
		whoseNameOnTheRegister.motherAndFemaleRadio.click();
	}
	
	public static boolean isMotherAndFemaleRadioSelected(){
		return whoseNameOnTheRegister.motherAndFemaleRadio.isSelected();
	}
	
	public static boolean isErrorMessageDisplayed(){
		return whoseNameOnTheRegister.errorMsg.isDisplayed();
	}
}
