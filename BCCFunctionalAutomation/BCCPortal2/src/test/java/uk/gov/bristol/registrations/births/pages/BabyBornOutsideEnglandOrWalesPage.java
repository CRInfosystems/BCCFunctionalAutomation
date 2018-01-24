package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BabyBornOutsideEnglandOrWalesPage {

	@FindBy(how = How.CSS, using="#who-can-register-header h2.step-header__subtitle")
	public WebElement title;
	
}
