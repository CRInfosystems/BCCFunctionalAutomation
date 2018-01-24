package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitExperianErrorMessage extends ParkingStorySteps{

public ParkingPermitExperianErrorMessage(){
	
}


@Then("experian error message should be displayed")
public void experianErrorMsg(){
	
	String expectedMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_EXPERIANERRORMSG))).getText();
	
	String actualMsg =  "Name or date of birth doesn't match our check with Experian";
	
	expectedMsg =  expectedMsg.trim();
	actualMsg = actualMsg.trim();
	
	System.out.println(expectedMsg);
	System.out.println(actualMsg);
	
	
	assertStringContains(expectedMsg , actualMsg);
}

}
