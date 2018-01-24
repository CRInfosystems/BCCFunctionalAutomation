package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.ChooseARegisterOfficePage;

public class ChooseARegisterOfficePageInteractions extends CommonPageInteractions{

	private static ChooseARegisterOfficePage chooseARegisterOfficePage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ChooseARegisterOfficePage.class);
	
	public static String getTitle() {
		return chooseARegisterOfficePage.title.getText();
	}

	public static void isValidationErrorDisplayed(){
		BrowserDriver.waitForElement(chooseARegisterOfficePage.validationError, 20);
		chooseARegisterOfficePage.validationError.isDisplayed();
	}	
	
	public static void selectOffice1(){
		//BrowserDriver.waitForElement(chooseARegisterOfficePage.office1, 20);
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #radios1")));
		chooseARegisterOfficePage.office1.click();
	}
	
	public static boolean isOffice1Checked(){
		//BrowserDriver.waitForElement(chooseARegisterOfficePage.office1, 20);
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #radios1")));
		return chooseARegisterOfficePage.office1.isSelected();
	}
	
	public static void selectOffice2(){
		//BrowserDriver.waitForElement(chooseARegisterOfficePage.office2, 20);
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #radios2")));
		chooseARegisterOfficePage.office2.click();
	}
	
	public static boolean isOffice2Checked(){
		//BrowserDriver.waitForElement(chooseARegisterOfficePage.office2, 20);
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #radios2")));
		return chooseARegisterOfficePage.office2.isSelected();
	}
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(chooseARegisterOfficePage.title, 20);
		return chooseARegisterOfficePage.title.isDisplayed();
	}
	
	public static boolean isMapDisplayedCheck(){
		BrowserDriver.waitForElement(chooseARegisterOfficePage.map, 20);
		return chooseARegisterOfficePage.map.isDisplayed();
	}	
}
