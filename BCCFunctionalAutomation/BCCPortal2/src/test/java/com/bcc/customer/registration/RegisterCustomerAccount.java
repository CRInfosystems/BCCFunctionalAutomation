package com.bcc.customer.registration;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class RegisterCustomerAccount extends AccountRegistration {

	private static final String MESSAGE_XPATH = "REGISTRATION.MESSAGE_XPATH";
	private static final String MESSAGE = "REGISTRATION.MESSAGE";
	
	public RegisterCustomerAccount() {
		
	}

	@Then("system should display confirm your account")
	public void verifySystemMessage(){
		String xpathval = propertyBag.getPageProperty(MESSAGE_XPATH);
		try {
			String actualmsg = driver.findElement(By.xpath(xpathval)).getText();
			String expectedmsg = String.format(propertyBag.getPageProperty(MESSAGE), this.emailAddress) ;
			assertStringEquals(actualmsg, expectedmsg);
		} catch (NoSuchElementException nse) {
			//ToDo
		}
	}
	
}
