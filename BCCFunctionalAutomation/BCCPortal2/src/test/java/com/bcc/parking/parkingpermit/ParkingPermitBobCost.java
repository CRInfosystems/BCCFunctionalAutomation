package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ParkingPermitBobCost  extends ParkingStorySteps{
    
    public ParkingPermitBobCost(){
        
    }
    
   
  
    @Then("System should display the error message")
    public void verifyerrormesg()
    {
        String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORMSG))).getText();
        String expectedmsg = "Please enter a valid number for paid permits.";
        
        assertStringContains(actualmsg, expectedmsg );
    }


}
