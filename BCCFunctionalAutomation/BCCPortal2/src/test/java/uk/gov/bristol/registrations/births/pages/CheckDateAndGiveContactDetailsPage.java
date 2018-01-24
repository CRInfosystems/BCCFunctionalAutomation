package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckDateAndGiveContactDetailsPage {
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .step-header__subtitle")
	public WebElement title;

	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .panel--errors li")
	public WebElement validationError;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .panel--affirm.panel--date")
	public WebElement selectedAppointment;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #first_name")
	public WebElement firstName;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #last_name")
	public WebElement lastName;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #email")
	public WebElement email;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ #mobile")
	public WebElement mobile;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .form__actions a")
	public WebElement privacyLink;
}
