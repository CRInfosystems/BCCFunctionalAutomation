package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ThanksThatsBookedPage {
	
	@FindBy(how = How.ID, using="thanks-thats-booked-header")
	public WebElement title;
	
	@FindBy(how = How.ID, using="appointment-date")
	public WebElement appointmentDate;
	
	@FindBy(how = How.ID, using="appointment-location")
	public WebElement appointmentLocation;
	
	@FindBy(how = How.CSS, using="#email-sent-msg strong")
	public WebElement emailAddress;
	
	@FindBy(how = How.ID, using="corn-st-address")
	public WebElement cornStAddress;
	
	@FindBy(how = How.ID, using="southmead-address")
	public WebElement southmeadAddress;
	
	@FindBy(how = How.ID, using="declaration-container")
	public WebElement declaration;
	
	
}
