package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.support.PageFactory;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.ParenthoodAgreementPage;

public class ParenthoodAgreementPageInteractions extends CommonPageInteractions{
	
	private static ParenthoodAgreementPage parenthoodAgreementPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ParenthoodAgreementPage.class);
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(parenthoodAgreementPage.title);
		return parenthoodAgreementPage.title.isDisplayed();
	}
	
	public static boolean isParenthoodAgreementRequiredErrorMsgDisplayed(){
		return parenthoodAgreementPage.errorMsg.isDisplayed();
	}
	
	public static boolean isWarningPanelDisplayed(){
		return parenthoodAgreementPage.warningPanel.isDisplayed();
	}
}
