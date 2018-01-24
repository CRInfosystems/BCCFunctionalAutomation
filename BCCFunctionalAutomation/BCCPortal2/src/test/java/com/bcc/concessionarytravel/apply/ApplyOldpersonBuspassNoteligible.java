package com.bcc.concessionarytravel.apply;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.concessionarytravel.ConcessionaryTravelStorySteps;

public class ApplyOldpersonBuspassNoteligible extends ConcessionaryTravelStorySteps {
	
	public ApplyOldpersonBuspassNoteligible()
	{
		
	}
	
	@Then("system should display user not eligible message")
	public void userNoteligible()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(CT_DOBNOTELIGIBLE))).size() > 0;
		Assert.assertTrue("Display not eligible information message", val);
	}
}
