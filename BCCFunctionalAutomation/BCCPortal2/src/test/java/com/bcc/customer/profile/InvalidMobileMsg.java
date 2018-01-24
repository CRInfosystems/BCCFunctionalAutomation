package com.bcc.customer.profile;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 07/02/2014
 * Description  : This class Verify if the customer enter the invalid Mobile Number appropriate error message is getting displayed
 * Story id      : 1534 - Change Phone Number
 */


public class InvalidMobileMsg extends CustomerStorySteps {
	
	
	
	public InvalidMobileMsg() {
	}
	
	@When("user enter invalid Mobile : <ExpectedMobile> and clicks on Save Phones")
	public void changeLandline(@Named("ExpectedMobile") String ExpectedMobile)
	{
		this.ExpectedMobile = ExpectedMobile;
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(LANDLINE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).sendKeys(this.ExpectedMobile);
		driver.findElement(By.name(propertyBag.getPageProperty(SAVEPHONE))).click();
	}
	
	
	@Then("system should display error message invalid mobile number")
	public void verifyErrormsgPhoneno()
	{
		// validing the error message
		// validing the error message
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(ERRORMESSAGE))).getText();
		String expectedmsg = "Please enter a valid mobile number.";
		assertStringEquals(expectedmsg ,actualmsg );
	}

}
