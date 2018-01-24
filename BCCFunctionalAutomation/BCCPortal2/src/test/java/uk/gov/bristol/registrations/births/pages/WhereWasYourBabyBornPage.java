package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhereWasYourBabyBornPage {
	
	@FindBy(how = How.CSS, using="#where-was-your-baby-born-header h2.step-header__subtitle")
	public WebElement title;

	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .panel--errors li")
	public WebElement validationError;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #location0")
	public WebElement location1;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #location1")
	public WebElement location2;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #location2")
	public WebElement location3;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #location-outside-bristol")
	public WebElement locationOutsideBristol;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #declarationAddress")
	public WebElement declarationAddress;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #location-outside-england-or-wales")
	public WebElement locationOutsideEnglandOrWales;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #location-in-bristol")
	public WebElement locationInBristol;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #postCode")
	public WebElement postcodeField;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ button[name='_eventId_lookupAddress']")
	public WebElement postcodeSubmit;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #addressFull")
	public WebElement addressSelect;
}
