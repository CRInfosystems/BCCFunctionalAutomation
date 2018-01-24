package com.bcc.feedback.makefeedback;



import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.feedback.FeedbackStorySteps;

public class FeedbackAnonymouslySignedin extends FeedbackStorySteps {

	public FeedbackAnonymouslySignedin()
	{
		
	}
	
	@When("user checks Leave this feedback anonymously")
	public void feedbackAnonymous()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(FEEDBACK_CHECKNODETAILS))).click();
	}
	
	@Then("system should display anonymous message")
	public void verifyanonymous()
	{
		String actualtext = driver.findElement(By.xpath(propertyBag.getPageProperty(FEEDBACK_ANONYMOUSMSG))).getText();
		String expectedtext = "You won't receive a confirmation or response as this is an anonymous feedback";
		Assert.assertTrue("Anonymous message is displayed", actualtext.equalsIgnoreCase(expectedtext));
	}

}