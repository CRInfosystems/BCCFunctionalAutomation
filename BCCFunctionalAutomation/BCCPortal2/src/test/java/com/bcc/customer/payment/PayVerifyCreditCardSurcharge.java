package com.bcc.customer.payment;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class PayVerifyCreditCardSurcharge extends ParkingStorySteps{

	
public 	PayVerifyCreditCardSurcharge(){
	
	
}
	
@When("User enter extra securitypassword")
public void extraSecurityPasswd(){
	
	driver.switchTo().frame(driver.findElement(By.id("scp_threeDSecure_iframe")));
	
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("Test_6721");
	driver.findElement(By.id("Continue")).click();
	
}

}
