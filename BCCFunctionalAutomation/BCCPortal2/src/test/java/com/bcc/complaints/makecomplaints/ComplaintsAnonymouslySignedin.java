package com.bcc.complaints.makecomplaints;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.complaints.ComplaintsStorySteps;

public class ComplaintsAnonymouslySignedin extends ComplaintsStorySteps {
	
	public ComplaintsAnonymouslySignedin()
	{
		
	}
	
	@Then("system should navigate to the thank you page - anonymous")
	public void verifyThankPageanonymous()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_ANONYMOUS_REFNO))).size() > 0;
		System.out.println(val);
		Assert.assertTrue("system should navigate to the thank you page", val);
	}

	@Then("system should display the message you will not receive a confirmation as you choose to remain anonymous")
	public void verifyCheckAnamouslyMsg()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_ANONYMOUS_MSG))).size() > 0;
		Assert.assertTrue("System should display the message you will not receive a confirmation as you choose to remain anonymous", val);
		
	}
}
