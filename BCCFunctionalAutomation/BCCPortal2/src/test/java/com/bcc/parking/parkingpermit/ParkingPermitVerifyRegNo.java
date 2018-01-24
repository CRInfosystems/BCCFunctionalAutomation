package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitVerifyRegNo extends ParkingStorySteps {
	
	public ParkingPermitVerifyRegNo()
	{
		
	}
	
	@Then("System should display the error message")
	public void verifyErrorMsg()
	{

		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORMSG))).getText();
		String expectederrormsg1 = "Vehicle 1: Please enter a valid registration number";

		assertStringEquals(expectederrormsg1 , actualmsg );
	}

}
