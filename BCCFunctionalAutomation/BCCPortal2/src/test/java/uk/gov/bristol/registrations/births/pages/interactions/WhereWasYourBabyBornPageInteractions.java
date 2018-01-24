package uk.gov.bristol.registrations.births.pages.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.WhereWasYourBabyBornPage;

public class WhereWasYourBabyBornPageInteractions extends CommonPageInteractions {

	private static WhereWasYourBabyBornPage whereWasYourBabyBornPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), WhereWasYourBabyBornPage.class);
	
	public static String getTitle() {
		return whereWasYourBabyBornPage.title.getText();
	}

	public static boolean isValidationErrorDisplayed(){
		return whereWasYourBabyBornPage.validationError.isDisplayed();
	}
	
	public static void selectLocation1(){
		whereWasYourBabyBornPage.location1.click();
	}
	
	public static boolean isLocation1Checked(){
		return whereWasYourBabyBornPage.location1.isSelected();
	}
	
	public static void selectLocation2(){
		whereWasYourBabyBornPage.location2.click();
	}
	
	public static boolean isLocation2Checked(){
		return whereWasYourBabyBornPage.location2.isSelected();
	}
	
	public static void selectLocation3(){
		whereWasYourBabyBornPage.location3.click();
	}
	
	public static boolean isLocation3Checked(){
		return whereWasYourBabyBornPage.location3.isSelected();
	}
	
	public static void selectLocationOutsideBristol(){
		whereWasYourBabyBornPage.locationOutsideBristol.click();
	}
	
	public static boolean isLocationOutsideBristolChecked(){
		return whereWasYourBabyBornPage.locationOutsideBristol.isSelected();
	}	
	
	public static void selectLocationOutsideEnglandOrWales(){
		whereWasYourBabyBornPage.locationOutsideEnglandOrWales.click();
	}
	
	public static boolean isLocationOutsideEnglandOrWalesChecked(){
		return whereWasYourBabyBornPage.locationOutsideEnglandOrWales.isSelected();
	}
	
	public static void selectLocationInBristol(){
		whereWasYourBabyBornPage.locationInBristol.click();
	}
	
	public static boolean isLocationInBristolChecked(){
		return whereWasYourBabyBornPage.locationInBristol.isSelected();
	}	
	
	
	public static void clickAddressLookupBtn(){
		whereWasYourBabyBornPage.postcodeSubmit.click();
	}
	
	public static String getPostcode(){
		return whereWasYourBabyBornPage.postcodeField.getText();
	}
	
	public static void setPostcode(String postcode){
		whereWasYourBabyBornPage.postcodeField.clear();
		whereWasYourBabyBornPage.postcodeField.sendKeys(postcode);
	}
	
	public static boolean isPostcodeDisplayed(){
		BrowserDriver.waitForElement(whereWasYourBabyBornPage.postcodeField);
		return whereWasYourBabyBornPage.postcodeField.isDisplayed();
	}
	
	public static String getAddressFull(){
		Select select = new Select(whereWasYourBabyBornPage.addressSelect);
		return select.getFirstSelectedOption().getAttribute("value");
	}
	
	public static void setAddressFull(String addressFull){
		Select select = new Select(whereWasYourBabyBornPage.addressSelect);
		select.selectByValue(addressFull);
	}
	
	public static void setAddressFullText(String addressFull){
		Select select = new Select(whereWasYourBabyBornPage.addressSelect);
		select.selectByVisibleText(addressFull);
	}
	
	public static void setValidAddressFull(){
		Select select = new Select(whereWasYourBabyBornPage.addressSelect);
		select.selectByIndex(1);
	}
	
	public static boolean isAddressFullDisplayed(){
		return whereWasYourBabyBornPage.addressSelect.isEnabled();
	}
	
	public static boolean containsAddress(String address){
		Select select = new Select(whereWasYourBabyBornPage.addressSelect);
		List<WebElement> options = select.getOptions();
		
		boolean hasAddress = false;
		
		for(WebElement option:options){
			String value = option.getAttribute("value");
			if(value.equals(address)){
				hasAddress = true;
				break;
			}
		}
		
		return hasAddress;
	}
	
	public static void setDeclarationAddress(String address){
		whereWasYourBabyBornPage.declarationAddress.sendKeys(address);
	}
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(whereWasYourBabyBornPage.title);
		return whereWasYourBabyBornPage.title.isDisplayed();
	}	
	
}
