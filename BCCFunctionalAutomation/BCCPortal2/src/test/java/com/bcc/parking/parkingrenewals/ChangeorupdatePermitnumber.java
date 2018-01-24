package com.bcc.parking.parkingrenewals;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ChangeorupdatePermitnumber extends ParkingStorySteps{
	
	public ChangeorupdatePermitnumber()
	{
		
	}
	
	@When("user click on change permit numbers link")
	public void clickonchangepermitnumber()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_CHANGEORUPDATEPERMITNUMBERS))).click();
	}
	
	@Then("system should navigate to permits details page")
	public void permitdetailspage()
	{
		boolean present ;
		try {
			 driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_FIRSTPERMITNUMBER)));
		     present = true;
		   
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		Assert.assertTrue("should navigate to permits details page", present);
	}
}
