package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhoseNameOnTheRegisterPage {

	@FindBy(how = How.CSS, using="#who-can-register-header h2.step-header__subtitle")
	public WebElement title;
	
	@FindBy(how = How.CSS, using=".panel--errors li")
	public WebElement errorMsg;
	
	@FindBy(how = How.ID, using="motherAndFather")
	public WebElement motherAndFatherRadio;
	
	@FindBy(how = How.ID, using="justMother")
	public WebElement justMotherRadio;
	
	@FindBy(how = How.ID, using="motherAndFemale")
	public WebElement motherAndFemaleRadio;
}
