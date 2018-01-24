package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitAnitaOrderReview  extends ParkingStorySteps{
    
    public ParkingPermitAnitaOrderReview(){
        
    }
    
    
    
    @Then("system should show the order confirmation page with cost, address and order details")
    public void orderConfirmationPage(){
    	
    	String expectedMsg =driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_TOTALCOSTPERMITDETAILS))).getText();
    	
    	driver.findElement(By.name(propertyBag.getPageProperty(PARKING_VIEWORDERSUMMARY))).click();
    	String actualMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_TOTALCOST))).getText();
    	
    	// converting in to string 
    	
    	String[] expected = expectedMsg.split("£");
    	String[] actual = actualMsg.split("£");
    	
    	actualMsg = actual[1];
    	
    	
    	expectedMsg = expected[1];
    	
    	
    	
    	System.out.println(expectedMsg);
    	System.out.println(actualMsg);
    	
    	
    	assertStringContains(actualMsg.trim(), expectedMsg.trim());
    }
  
}
