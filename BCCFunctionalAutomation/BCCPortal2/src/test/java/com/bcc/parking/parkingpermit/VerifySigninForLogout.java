package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class VerifySigninForLogout extends ParkingStorySteps {
	
	public VerifySigninForLogout()
	{
		
	}
	
	@Then("blue box of sign in button should display")
	public void checkbluebox()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(PARKING_SIGNINBLUEBOX))).size() > 0;
		Assert.assertTrue("For logged out user should have the blue sign in box", val);
			
	}
	
	@When("user clicks on sign in button of the blue box")
	public void clickSignin()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_BLUEBOX_SIGNIN))).click();
	}
	
	@Then("system should navigate to the sign in page")
	public void verifySignin()
	{
		Boolean val = driver.findElements(By.id(propertyBag.getPageProperty(USER_NAME))).size() > 0; 			
		Assert.assertTrue("system should navigate to sign in page", val);
	}
	
	@Then("system should navigate to the parking transaction leading page")
	public void signTransactionleading()
	{
		Boolean val = driver.findElements(By.partialLinkText(propertyBag.getPageProperty(PARKING_GETPARKINGPERMITS))).size() > 0; 			
		Assert.assertTrue("system should navigate to parking transaction leading page", val);
	}
	
	@Then("blue box of sign in button should not display")
	public void checkNobluebox()
	{
		Boolean isPresent = driver.findElements(By.xpath(propertyBag.getPageProperty(PARKING_SIGNINBLUEBOX))).size() > 0;
		Assert.assertFalse("For logged in user sign in button not display", isPresent);
	}
	

}
