package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AboutYourBabyPage {

	@FindBy(how = How.CSS, using="#about-your-baby-header h2.step-header__subtitle")
	public WebElement title;
	
	@FindBy(how = How.ID, using="babiesQty.errors")
	public WebElement babiesQtyErrorMsg;
	
	@FindBy(how = How.ID, using="dobDay.errors")
	public WebElement invalidDOBErrorMsg;
	
	@FindBy(how = How.ID, using="mothersFirstName.errors")
	public WebElement mothersFirstNameErrorMsg;
	
	@FindBy(how = How.ID, using="mothersLastName.errors")
	public WebElement mothersLastNameErrorMsg;
	
	@FindBy(how = How.ID, using="oneBaby")
	public WebElement oneBabyRadio;
	
	@FindBy(how = How.ID, using="twoOrThreeBabies")
	public WebElement twoOrThreeBabiesRadio;
	
	@FindBy(how = How.ID, using="fourOrMoreBabies")
	public WebElement fourOrMoreBabiesRadio;
	
	@FindBy(how = How.ID, using="dob_day")
	public WebElement dobDay;
	
	@FindBy(how = How.ID, using="dob_month")
	public WebElement dobMonth;
	
	@FindBy(how = How.ID, using="dob_year")
	public WebElement dobYear;
	
	@FindBy(how = How.ID, using="mothersFirstName")
	public WebElement mothersFirstName;
	
	@FindBy(how = How.ID, using="mothersLastName")
	public WebElement mothersLastName;

}
