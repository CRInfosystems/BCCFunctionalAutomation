package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitElectricCarCost extends ParkingStorySteps{
	
	
public ParkingPermitElectricCarCost(){
	
}
	

@Then("system navigates to the permit details page with with tax band returned as electric")
public void taxBandReturnedElectric(){
	
	String actualMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_UNCLASSIFIED))).getText();
	actualMsg = actualMsg.replaceAll("\\s+","");
	String expectedMsg = "Tax band  electric";
	expectedMsg = expectedMsg.replaceAll("\\s+","");
	System.out.println(actualMsg);
	System.out.println(expectedMsg);
	
	assertStringContains(actualMsg, expectedMsg);


}
}