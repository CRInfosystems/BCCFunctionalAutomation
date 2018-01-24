package com.bcc.parking.parkingrenewals;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ValidateEmail extends ParkingStorySteps{
	
	public ValidateEmail()
	{
		
	}
	
	@Then("system should give the error message for invalid email")
	public void invalidEmail()
	{
		boolean present ;
		try {
			 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_INVALIDEMAILMSG)));
		     present = true;
		   
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		Assert.assertTrue("should should give the error message if the user has given the invalid email", present);
	}
	
}