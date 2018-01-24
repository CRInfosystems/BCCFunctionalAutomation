package com.bcc.complaints.makecomplaints;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.complaints.ComplaintsStorySteps;

public class StatutorySignedinAnonymous extends ComplaintsStorySteps {

	
	public StatutorySignedinAnonymous()
	{
		
	}
	
	@Then("system should display anonymous message")
	public void anonymousMsg() throws InterruptedException
	{
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(STATUTORY_ANONYMOUSMSG))).getText();
		String expectedMsg = "anonymous";
		Assert.assertTrue("Email should get displayed", actualmsg.contains(expectedMsg));
	}

}
