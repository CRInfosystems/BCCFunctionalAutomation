package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitInvalidPostcode extends ParkingStorySteps  {
	
	public ParkingPermitInvalidPostcode()
	{
		
	}
	
	
	@Then("User should display the error message for the postcode")
	public void verifypostcodeerrormsg()
	{
		
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORMSG))).getText();
		String expectederrormsg1 = "Please enter a valid UK postcode";
        
        assertStringContains(actualmsg, expectederrormsg1 );
	}
	

}
