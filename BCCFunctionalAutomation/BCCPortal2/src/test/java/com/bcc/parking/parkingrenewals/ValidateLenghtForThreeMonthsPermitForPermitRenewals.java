package com.bcc.parking.parkingrenewals;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ValidateLenghtForThreeMonthsPermitForPermitRenewals extends ParkingStorySteps{
	
	public ValidateLenghtForThreeMonthsPermitForPermitRenewals()
	{
		
	}
	
	@Then("system should display 1st permit length as 3months")
	public void verifylengthoffirstpermit()
	{
	 String actualval = driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_FIRSTPERMIT_LENGTH))).getText();
	 System.out.println(actualval);
	 String exptval = "3 months";
	 Assert.assertTrue("system should display the length as 3months" , actualval.equalsIgnoreCase(exptval));
	}
	
	@Then("system should display 2nd permit length as 3months")
	public void verifylengthofsecondpermit()
	{
	 String actualval = driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_SECONDPERMIT_LENGTH))).getText();
	 String exptval = "3 months";
	 Assert.assertTrue("system should display the length as 3months" , actualval.equalsIgnoreCase(exptval));
	}
	
	
	@Then("system should display 3rd permit length as 3months")
	public void verifylengthofthirdpermit()
	{
	 String actualval = driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_THIRDPERMIT_LENGTH))).getText();
	 String exptval = "3 months";
	 Assert.assertTrue("system should display the length as 3months" , actualval.equalsIgnoreCase(exptval));
	}

}
