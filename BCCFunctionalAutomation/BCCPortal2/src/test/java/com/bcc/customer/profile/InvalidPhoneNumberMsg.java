package com.bcc.customer.profile;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import com.bcc.customer.CustomerStorySteps;


/* Created By   : Naga Jyostna
 * Created Date : 07/02/2014
 * Description  : This class Verify if the customer enter invalid phone number appropriate error message is getting displayed
 * Story id      : 1534 - Change Phone Number
 */


public class InvalidPhoneNumberMsg extends CustomerStorySteps {
	
	
	
	public InvalidPhoneNumberMsg() {
	}
	
	@When("user enter landline : <ExpectedLandline> and clicks on Save Phones")
	public void changeLandline(@Named("ExpectedLandline") String ExpectedLandline)
	{
		this.ExpectedLandline = ExpectedLandline;
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(LANDLINE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(LANDLINE))).sendKeys(this.ExpectedLandline);
		driver.findElement(By.name(propertyBag.getPageProperty(SAVEPHONE))).click();
	}
	
	
	@Then("system should display error message invalid phone number")
	public void verifyErrormsgPhoneno()
	{
		// validing the error message
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(ERRORMESSAGE))).getText();
		String expectedmsg = "Please enter a valid landline number.";
		assertStringEquals(expectedmsg ,actualmsg );
		
	}

}
