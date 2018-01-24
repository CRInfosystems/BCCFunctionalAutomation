package com.bcc.feedback.makefeedback;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.feedback.FeedbackStorySteps;

public class FeedbackViaEmailSignedin extends FeedbackStorySteps {

	public FeedbackViaEmailSignedin()
	{
		
	}
	
	@Then("check the sign in email is displayed in the feedback page")
	public void checkSigninEmail()
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(FEEDBACK_SIGNINEMAIL))).getText();
		String expectedMsg = emailaddress;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}
	
	@Then("check the sign in email is displayed in the preview page")
	public void checkPreviewEmail()
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(FEEDBACK_CONFIRMEMAIL))).getText();
		String expectedMsg = emailaddress;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}

}
