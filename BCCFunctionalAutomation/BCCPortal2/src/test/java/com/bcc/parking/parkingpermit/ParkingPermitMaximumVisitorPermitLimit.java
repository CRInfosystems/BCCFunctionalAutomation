package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitMaximumVisitorPermitLimit extends ParkingStorySteps{


public ParkingPermitMaximumVisitorPermitLimit(){
	
}


@Then("system should display maximum limit error message")
public void maximumLimitErrorMsg(){
	

String expectedfreeMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_FREEVISITORERRORMSG))).getText();
String expectedpaiddMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_PAIDVISITORERRORMSG))).getText();
String actualfreeMsg = "You tried to order more free permits than you have left. Please change the number.";
String actualPaidMsg = "You tried to order more paid permits than you have left. Please change the number.";
 
assertStringContains(actualfreeMsg, expectedfreeMsg);
assertStringContains(actualPaidMsg, expectedpaiddMsg);
}

}
