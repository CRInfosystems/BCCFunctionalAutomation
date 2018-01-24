package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class VerifyNumberOfPermitsAllocated extends ParkingStorySteps{
	
	public VerifyNumberOfPermitsAllocated()
	{
		
	}
	
	
	
	
	@Then("system should display visitor permits entitled to : <expectedmsg>")
	public void parkingDetails(@Named("expectedmsg") String expectedmsg )
	{
		String actmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_PERMISALLOCATEDMSG))).getText();
		System.out.println(actmsg);
		System.out.println(expectedmsg);
		assertStringContains( expectedmsg , actmsg );
	}
	

}
