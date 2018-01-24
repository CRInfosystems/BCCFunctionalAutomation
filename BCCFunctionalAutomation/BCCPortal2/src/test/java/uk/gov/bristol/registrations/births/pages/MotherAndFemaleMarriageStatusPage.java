package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MotherAndFemaleMarriageStatusPage extends CommonPage{

	@FindBy(how = How.CSS, using="#mother-female-status-header h2.step-header__subtitle")
	public WebElement title;
	
	@FindBy(how = How.CSS, using=".panel--errors li")
	public WebElement errorMsg;

}