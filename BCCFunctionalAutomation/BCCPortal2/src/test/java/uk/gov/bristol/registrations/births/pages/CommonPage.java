package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

	@FindBy(how = How.CSS, using="#p_p_id_bccbirths_WAR_bccregistrationsportlet_ .cta--next")
	public WebElement nextBtn;
	
	@FindBy(how = How.CSS, using=".change-prompt a")
	public WebElement changeLink;
	
	@FindBy(how = How.ID, using="yes-radio")
	public WebElement yesRadio;
	
	@FindBy(how = How.ID, using="no-radio")
	public WebElement noRadio;
	
	@FindBy(how = How.CSS, using=".panel--errors")
	public WebElement errorMsg;
	
}
