package com.bcc.parking.parkingpermit;



import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitStpaulsPostcode   extends ParkingStorySteps {
	
	public ParkingPermitStpaulsPostcode()
	{
		
	}
	
	 @Then("System should display invalid UK address errormessage")
		public void displayUKinvalidAddress(){
			
			String actualmsg  = driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_INVALIDADDRESSERRORMSG))).getText();
			String expectedmsg = "Please enter a valid UK postcode";
	        assertStringContains(actualmsg, expectedmsg);  		
		}
		
	
	
	

}