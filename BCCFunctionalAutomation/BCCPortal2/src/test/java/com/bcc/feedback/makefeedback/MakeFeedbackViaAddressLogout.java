package com.bcc.feedback.makefeedback;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.feedback.FeedbackStorySteps;

public class MakeFeedbackViaAddressLogout extends FeedbackStorySteps {
	
	public MakeFeedbackViaAddressLogout()
	{
		
	}
	
	@Then("check the address is displayed in the preview page")
	public void checkAddress()
	{
		String actualAddress = driver.findElement(By.xpath(propertyBag.getPageProperty(FEEDBACK_CONFIRMADDRESS))).getText();
		String expectedMsg = housename;
		System.out.println(actualAddress);
		System.out.println(expectedMsg);
		Assert.assertTrue("Address should get displayed", actualAddress.contains(expectedMsg));
	}

}
