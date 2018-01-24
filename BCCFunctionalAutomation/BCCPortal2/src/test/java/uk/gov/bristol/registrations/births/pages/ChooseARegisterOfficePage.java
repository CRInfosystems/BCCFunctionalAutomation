package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChooseARegisterOfficePage {
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .step-header__subtitle")
	public WebElement title;

	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .panel--errors li")
	public WebElement validationError;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #radios1")
	public WebElement office1;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #radios2")
	public WebElement office2;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ div.gm-style")
	public WebElement map;
}
