package com.bcc.parking.parkingpermit;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class AddVisitorPermitErrorMsg   extends ParkingStorySteps {
	
	public AddVisitorPermitErrorMsg()
	{
		
	}
	
	/*@When("Users selects Free bundle : <freebundle>")
	public void selectbundle(@Named("freebundle") String freebundle )
	{
		this.freebundle = freebundle;
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FREEVISITORPERMITS))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FREEVISITORPERMITS))).sendKeys(this.freebundle);
		
	}
	
	@When("Users enter paid permits : <paidpermits>")
	public void enterpaidpermit(@Named("paidpermits") String paidpermits)
	{
		this.paidpermits = paidpermits;
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_PAIDPERMITS))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_PAIDPERMITS))).sendKeys(this.paidpermits);
	}*/
	
	@Then("Click on Finish and pay button")
	public void clickpandpay() throws InterruptedException
	{
		driver.findElement(By.name(propertyBag.getPageProperty(PARKING_FINISHANDPAY))).click();
	
		
	}
	
	@Then("System should display the error message")
	public void verifyerrormesg()
	{
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORMSG))).getText();

		String expectedmsg = "You tried to order more paid permits than you have left. Please change the number";

		
		assertStringContains(actualmsg, expectedmsg );
	}
	

}
