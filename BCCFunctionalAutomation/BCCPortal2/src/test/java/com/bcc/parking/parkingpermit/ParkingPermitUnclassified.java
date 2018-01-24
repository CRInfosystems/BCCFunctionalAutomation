package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitUnclassified extends ParkingStorySteps{

	
public ParkingPermitUnclassified(){
	
}


@Then("system navigates to the permit details page with with tax band returned as unclassified")
public void taxBandReturnedUnclassfied(){
	
	String actualMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_UNCLASSIFIED))).getText();
	
	actualMsg = actualMsg.replaceAll("\\s+","");
	String expectedMsg = "Tax band  : no tax band";
	expectedMsg = expectedMsg.replaceAll("\\s+","");
	                      
	assertStringContains(actualMsg, expectedMsg);
	
}
	
}
