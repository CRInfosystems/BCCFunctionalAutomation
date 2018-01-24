package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ParenthoodAgreementPage extends CommonPage{

	@FindBy(how = How.CSS, using="#parenthood-agreement-header h2.step-header__subtitle")
	public WebElement title;
	
	@FindBy(how = How.CSS, using=".panel--errors")
	public WebElement errorMsg;

	@FindBy(how = How.CLASS_NAME, using="panel--warning")
	public WebElement warningPanel;
}