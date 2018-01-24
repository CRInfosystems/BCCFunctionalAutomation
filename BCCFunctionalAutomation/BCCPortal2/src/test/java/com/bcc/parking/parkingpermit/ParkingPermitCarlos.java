package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitCarlos extends ParkingStorySteps{

public ParkingPermitCarlos(){
	
	
}

@Then("system should successfully navigates to order confirmation page")
public void systemShouldSuccessfullyOrderPage(){
	
	String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CHECKORDERPAGE))).getText();
	String expectedmsg = "Check order";
	assertStringContains(actualmsg, expectedmsg);
	
}

}