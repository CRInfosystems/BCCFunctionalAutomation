package com.bcc.customer.registration;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class RegisteredEmail extends AccountRegistration {
	
	private static final String ERROR_MSG_XPATH = "REGISTRATION.ERROR_MSG_XPATH";
	private static final String ERROR_MSG = "REGISTRATION.ERROR_MSG";
	
	public RegisteredEmail() {
		
	}

	@Then("system should display please enter a valid email address")
	public void verifySystemMessage() {
		String xpathval = propertyBag.getPageProperty(ERROR_MSG_XPATH);
		try {
			String actualmsg = driver.findElement(By.xpath(xpathval)).getText();
			String expectedmsg = propertyBag.getPageProperty(ERROR_MSG);
			assertStringEquals(actualmsg, expectedmsg);
		} catch (NoSuchElementException nse) {
			//ToDo
		}
	}

}
