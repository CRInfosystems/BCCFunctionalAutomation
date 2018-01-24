package com.bcc.customer.payment;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class PayApplySametime extends ParkingStorySteps{
	
	
public PayApplySametime(){
	
}


@Then("User payment successfully processed by capita")
public void paymentSuccessfullyProcessed(){
	
	String expectedmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_THANKSMSG))).getText();
    String actualmsg = "Thanks, that's all ordered";
    assertStringContains(actualmsg, expectedmsg);
}

}


