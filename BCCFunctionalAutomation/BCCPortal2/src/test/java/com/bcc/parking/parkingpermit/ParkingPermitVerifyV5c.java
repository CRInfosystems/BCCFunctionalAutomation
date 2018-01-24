package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitVerifyV5c extends ParkingStorySteps{
	
	public ParkingPermitVerifyV5c()
	{
		
	}
	
	@Then("System should display the error message")
	public void verifyErrorMsg()
	{

	    String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORMSG))).getText();
		String expectederrormsg = "Vehicle 1: Please enter a valid V5C Document Reference Number";
		assertStringEquals(actualmsg, expectederrormsg );
	}

}
