package com.bcc.customer.profile;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.customer.CustomerStorySteps;

public class ChangeIncorrectEmail extends CustomerStorySteps {
	
	public ChangeIncorrectEmail()
	{
		
	}
	
	@Then("system should display the error message for incorrect email address")
	public void verifyprofilepage()
	{
		// enter the details here
		
		
		String actulmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(CHANGEEMAIL_ERRORMSG))).getText();
		String exptmsg = "Please enter a valid email address.";
		assertStringEquals(actulmsg, exptmsg);
	}

}
