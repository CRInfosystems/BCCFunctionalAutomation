package com.bcc.parking.parkingrenewals;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class InvalidPermitNumbersForPermitRenewals extends ParkingStorySteps{
	
	public InvalidPermitNumbersForPermitRenewals()
	{
		
	}

	@Then("system should display the error message for the 1st permit")
	public void FirstPermitErrorMsg()
	{
		Boolean val = driver.findElements(By.cssSelector(propertyBag.getPageProperty(RENEWALS_FIRSTPERMIT_ERRORMSG))).size() > 0;
		Assert.assertTrue("System should give the error message for 1st permit", val);
	}
	
	@Then("system should display the error message for the 2nd permit")
	public void SecondPermitErrorMsg()
	{
		Boolean val = driver.findElements(By.cssSelector(propertyBag.getPageProperty(RENEWALS_SECONDPERMIT_ERRORMSG))).size() > 0;
		Assert.assertTrue("System should give the error message for 2nd permit", val);
	}
	
	
	@Then("system should display the error message for the 3rd permit")
	public void ThirdPermitErrorMsg()
	{
		Boolean val = driver.findElements(By.cssSelector(propertyBag.getPageProperty(RENEWALS_THIRDPERMIT_ERRORMSG))).size() > 0;
		Assert.assertTrue("System should give the error message for 3rd permit", val);
	}

}
