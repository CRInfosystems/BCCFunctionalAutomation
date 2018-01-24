package uk.gov.bristol.registrations.births.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterABabyPage {

	@FindBy(how = How.CSS, using=".portlet-body h1")
	public WebElement title;

	@FindBy(how = How.CSS, using="a.cta--next")
	public WebElement bookNowBtn;
}
