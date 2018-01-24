package com.bcc.complaints.makecomplaints;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.complaints.ComplaintsStorySteps;

public class ComplaintsSomeoneViaBothemailsSignedin extends ComplaintsStorySteps {

	
	public ComplaintsSomeoneViaBothemailsSignedin()
	{
		
	}
	
	@Then("check the self email is displayed in the preview page")
	public void checkSelfEmail()
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_COMFIRMSELFEMAIL))).getText();
		String expectedMsg = emailaddress;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}
	
	@Then("check the other email is displayed in the preview page")
	public void checkOtherEmail()
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_COMFIRMOTHEREMAIL))).getText();
		String expectedMsg = otheremail;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}
}
