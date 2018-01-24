package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MotherAndFemaleNotMarriedPage extends CommonPage{

	@FindBy(how = How.CSS, using="#mother-female-not-married-header h2.step-header__subtitle")
	public WebElement title;
	
	@FindBy(how = How.CLASS_NAME, using="panel--warning")
	public WebElement advisePanel;
	
	@FindBy(how = How.CSS, using=".panel--errors li")
	public WebElement errorMsg;

}