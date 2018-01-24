package com.bcc.complaints.makecomplaints;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import com.bcc.complaints.ComplaintsStorySteps;

public class StatutorySignedinMyself extends ComplaintsStorySteps {

	
	public StatutorySignedinMyself()
	{
		
	}
	
	@When("user clicks on advocacy check button")
	public void helptext() throws InterruptedException
	{
		driver.findElement(By.id(propertyBag.getPageProperty(ADVOCACY_HELP))).click();
	}

}
