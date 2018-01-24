package com.bcc.foi.makefoirequest;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.foi.FoiStorySteps;

public class EditDetailsOfMakeFoiRequest extends FoiStorySteps{
	
	public EditDetailsOfMakeFoiRequest()
	{
		
	}
	
	
	@When("user click on edit these details link")
	public void clickEdittheseLinks()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_EditTheseDetails))).click();	
	}
	
	@When("user updated your request details : <updateyourrequest>")
	public void updateyourRequestDetails(@Named("updateyourrequest") String updateyourrequest)
	{
		this.updateyourrequest = updateyourrequest ;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Enquiry))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Enquiry))).sendKeys(this.updateyourrequest);
	}
	
	@Then("system display the updated your request details")
	public void verfiyUpdatedDetails()
	{
		String strval = driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_PreviewpageRequest))).getText();
		
		String strexpectedval = updateyourrequest;
		
		System.out.println(strval);
		System.out.println(strexpectedval);
		
		Assert.assertTrue("Updated Request Details should get displayed ", strexpectedval.equalsIgnoreCase(strval));
	}

}
