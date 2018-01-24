package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.CommonPage;

public class CommonPageInteractions {

	private static CommonPage commonPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CommonPage.class);
	
	public static void clickNextBtn(){
		commonPage.nextBtn.click();
	}
	
	public static void clickChangeLink(){
		commonPage.changeLink.click();
	}

	public static void selectYes(){
		commonPage.yesRadio.click();
	}
	
	public static boolean isYesRadioSelected(){
		return commonPage.yesRadio.isSelected();
	}

	public static boolean isNextButtonDisplayed(){
		return commonPage.nextBtn.isDisplayed();
	}
	
	public static void selectNo(){
		commonPage.noRadio.click();
	}
	
	public static boolean isNoRadioSelected(){
		return commonPage.noRadio.isSelected();
	}
	
	public static boolean isErrorMsgDisplayed(){
		return commonPage.errorMsg.isDisplayed();
	}
	
	protected static boolean isDisplayed(WebElement element){
		boolean isDisplayed = false;
		
		try{
			isDisplayed = element.isDisplayed();
		}catch(NoSuchElementException nsee){
		}
		
		return isDisplayed;
	}
}
