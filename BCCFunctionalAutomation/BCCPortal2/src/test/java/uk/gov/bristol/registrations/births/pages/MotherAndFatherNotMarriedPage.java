package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MotherAndFatherNotMarriedPage extends CommonPage {
	
	@FindBy(how = How.CSS, using="#fathers-on-register-header h2.step-header__subtitle")
	public WebElement title;
	
	@FindBy(how = How.CLASS_NAME, using="panel--warning")
	public WebElement advisePanel;
	
}
