package com.bcc.parking.parkingpermit;



import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ThankyouApplication   extends ParkingStorySteps {
	
	public ThankyouApplication()
	{
		
	}
	@Then("System should navigate to thankyou page")
	public void navigateThankyouPage(){
		
	  String expectedMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_THANKSMSG))).getText();  ///html/body/main/div/div[1]/div/div/div/div/div/div/div[1]/div/h1
	  String actualMsg = "Thanks, that's all ordered";
	
	  assertStringContains(actualMsg, expectedMsg);
	
	}
}
