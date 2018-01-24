package com.bcc.parking.parkingrenewals;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ThreepermitsExpire extends ParkingStorySteps{
	
	public ThreepermitsExpire()
	{
		
	}
	
@Then("system should display the link apply for new permit for the 1st permit")		
public void checkLinkone()
{
	boolean present ;
	try {
		 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_APPLYFORNEWPERMIT_1)));
	     present = true;
	   
	} catch (NoSuchElementException e) {
	   present = false;
	}
	
	Assert.assertTrue("apply for new permit for 1st Permit", present);
}

@Then("system should display the link apply for new permit for the 2nd permit")		
public void checkLinkotwo()
{
	boolean present ;
	try {
		 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_APPLYFORNEWPERMIT_2)));
	     present = true;
	   
	} catch (NoSuchElementException e) {
	   present = false;
	}
	
	Assert.assertTrue("apply for new permit for 2nd Permit", present);
}
@Then("system should display the link apply for new permit for the 3rd permit")		
public void checkLinkothree()
{
	boolean present ;
	try {
		 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_APPLYFORNEWPERMIT_3)));
	     present = true;
	   
	} catch (NoSuchElementException e) {
	   present = false;
	}
	
	Assert.assertTrue("apply for new permit for 3rd Permit", present);
}


}
