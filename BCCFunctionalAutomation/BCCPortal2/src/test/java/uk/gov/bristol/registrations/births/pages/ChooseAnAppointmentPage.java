package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChooseAnAppointmentPage {
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .step-header__subtitle")
	public WebElement title;

	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .panel--errors li")
	public WebElement validationError;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .appointment-picker h2")
	public WebElement officeTitle;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .appointment-card--available")
	public WebElement firstAvailableDay;
	
	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .panel--affirm.panel--date")
	public WebElement selectedAppointment;
}
