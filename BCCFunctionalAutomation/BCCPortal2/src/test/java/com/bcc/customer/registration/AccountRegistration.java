package com.bcc.customer.registration;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.bcc.customer.CustomerStorySteps;

public abstract class AccountRegistration extends CustomerStorySteps {
	
	private static final String TITLE = "REGISTRATION.TITLE"; 
	private static final String FIRST_NAME = "REGISTRATION.FIRST_NAME";
	private static final String LAST_NAME = "REGISTRATION.LAST_NAME";
	private static final String POSTCODE = "REGISTRATION.POSTCODE";
	private static final String LOOKUP_ADDRESS = "REGISTRATION.LOOKUP_ADDRESS";
	private static final String ADDRESS_UPRN = "REGISTRATION.ADDRESS_UPRN";
	private static final String EMAIL_ADDRESS = "REGISTRATION.EMAIL_ADDRESS";
	private static final String PASSWORD = "REGISTRATION.PASSWORD";
	private static final String PASSWORD_CONFIRM = "REGISTRATION.PASSWORD_CONFIRM";
	private static final String REGISTER = "REGISTRATION.REGISTER";
	
	protected String title;
	protected String firstName;
	protected String lastName;
	protected String postCode;
	protected String lookupAddress;
	protected String emailAddress;
	protected String password;
	
	/* Enter Customer Details */
	@When("user enters title '$title'")
	@Alias("user enters title <title>")
	public void enterTitle(@Named("title") String title) {
		this.title = title;
		driver.findElement(By.id(propertyBag.getPageProperty(TITLE))).sendKeys(this.title);
	}

	@When("user enters firstname '$firstname'")
	@Alias("user enters firstname <firstname>")
	public void enterFirstName(@Named("firstname") String firstName) {
		this.firstName = firstName;
		driver.findElement(By.id(propertyBag.getPageProperty(FIRST_NAME))).sendKeys(this.firstName);
	}

	@When("user enters lastname '$lastname'")
	@Alias("user enters lastname <lastname>")
	public void enterLastName(@Named("lastname") String lastName) {
		this.lastName = lastName;
		driver.findElement(By.id(propertyBag.getPageProperty(LAST_NAME))).sendKeys(this.lastName);
	}

	@When("user enters postcode '$postcode'")
	@Alias("user enters postcode <postcode>")
	public void enterPostcode(@Named("postcode") String postCode) {
		this.postCode = postCode;
		driver.findElement(By.id(propertyBag.getPageProperty(POSTCODE))).sendKeys(this.postCode);
	}

	@When("user clicks on find address button")
	public void clickFindAddress() {
		driver.findElement(By.name(propertyBag.getPageProperty(LOOKUP_ADDRESS))).click();
	}

	/* selects the first address from the drop down */
	@When("user selects address '$addresslookup' from the dropdown list")
	@Alias("user selects address <addresslookup> from the dropdown list")
	public void selectAddress(@Named("addresslookup") String address) {
		this.lookupAddress = address;
		Select dropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(ADDRESS_UPRN))));
		int index;
		try {
			index = Integer.parseInt(this.lookupAddress);
		} catch (NumberFormatException nfe) {
			index = 1;	//default to the
		}
		dropdown.selectByIndex(index);
	}

	@When("user enters email '$email'")
	@Alias("user enters email <email>")
	public void enterEmailid(@Named("email") String email) {
		this.emailAddress = email;
		driver.findElement(By.id(propertyBag.getPageProperty(EMAIL_ADDRESS))).sendKeys(this.emailAddress);
	}

	@When("user enters twice password '$password'")
	@Alias("user enters twice password <password>")
	public void enterPassword(@Named("password") String password) {
		this.password = password;
		driver.findElement(By.id(propertyBag.getPageProperty(PASSWORD))).sendKeys(this.password);
		driver.findElement(By.id(propertyBag.getPageProperty(PASSWORD_CONFIRM)))
				.sendKeys(this.password);
	}

	@When("user clicks on create account button")
	public void clickCreateAccount() {
		driver.findElement(By.name(propertyBag.getPageProperty(REGISTER))).click();
	}
	
}
