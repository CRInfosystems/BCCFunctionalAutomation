package com.bcc.parking.parkingrenewals;

import java.util.NoSuchElementException;




import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class InvalidPostcodeForPermitRenewals extends ParkingStorySteps{
	
	public InvalidPostcodeForPermitRenewals()
	{
		
	}
	
	
	@Then("System should display error message in renewals : <errorMessage>")
	public void displayerrormessage(){
		this.errorMessage = errorMessage;
		//String actualmsg  = driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_INVALIDEMAILMSG_POSTCODENOTINSYSTEM))).getText();
		
		// assertStringContains(actualmsg, this.errorMessage); 
		 
		 boolean presentpostcodenotinsystem ;
			try {
				 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_INVALIDEMAILMSG_POSTCODENOTINSYSTEM)));
				 presentpostcodenotinsystem = true;
			   
			} catch (NoSuchElementException e) {
				presentpostcodenotinsystem = false;
			}
			
			
			boolean presentinvalidpostcode ;
			try {
				 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_INVALID_POSTCODE)));
				 presentinvalidpostcode = true;
			   
			} catch (NoSuchElementException e) {
				presentinvalidpostcode = false;
			}
			
			if(presentpostcodenotinsystem)
			{
				
				Assert.assertTrue(this.errorMessage , presentpostcodenotinsystem);
			}
			else
			{
				Assert.assertTrue(this.errorMessage , presentinvalidpostcode);	
			}
		 
	}

}
