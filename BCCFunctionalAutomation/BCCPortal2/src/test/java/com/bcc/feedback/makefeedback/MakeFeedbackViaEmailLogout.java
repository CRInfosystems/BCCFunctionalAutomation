package com.bcc.feedback.makefeedback;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.feedback.FeedbackStorySteps;

public class MakeFeedbackViaEmailLogout extends FeedbackStorySteps {

	public MakeFeedbackViaEmailLogout()
	{
		
	}
	
	@Then("check the email is displayed in the preview page")
	public void checkEmail()
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(FEEDBACK_CONFIRMEMAIL))).getText();
		String expectedMsg = email;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}

}
