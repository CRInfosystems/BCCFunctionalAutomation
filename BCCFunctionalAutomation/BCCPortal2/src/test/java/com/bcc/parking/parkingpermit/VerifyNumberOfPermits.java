package com.bcc.parking.parkingpermit;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class VerifyNumberOfPermits extends ParkingStorySteps{
	
	public VerifyNumberOfPermits()
	{
		
	}
	
	
	
	@Then("User gets details of the parking permits entitled to : <expectedmsg>")
	public void parkingDetails(@Named("expectedmsg") String expectedmsg )
	{
			
		
		boolean present;
		String expectedmsg1 = null;
		try {
			 expectedmsg1 = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_PERMITSENTITLEDMSG))).getText();
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		
		Assert.assertTrue("system should user no of permits entitled to ", present);
		
		assertStringContains(expectedmsg1,expectedmsg); 
		
		
	}
	

}
