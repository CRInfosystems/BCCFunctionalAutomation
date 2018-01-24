package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitCarDetails extends ParkingStorySteps  {
	
	public ParkingPermitCarDetails()
	{
		
	}
	
	@Then("System should navigate to the vehical details page")
	public void nextPage()
	{

		
		
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_VEHICALDETAILS))).getText();

		String expmsg = "Check permit details";
		
		assertStringContains(expmsg ,actualmsg );
	}
	

}
