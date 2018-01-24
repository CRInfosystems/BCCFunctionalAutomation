package com.bcc.parking.parkingpermit;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class VerifyErrorMsgInVechicalDetailsPage extends ParkingStorySteps  {
	
	public VerifyErrorMsgInVechicalDetailsPage()
	{
		
	}
	
	@Then("check the error messages in the vehcial details page")
	public void checkerrormsgs()
	{
			
		
		boolean present;
		try {
			driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_REGNO_ERRORMSG)));
			driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_V5C_ERRORMSG)));
			driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_FIRSTNAME_ERRORMSG)));
			driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_LASTNAME_ERRORMSG)));
			driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_DOB_ERRORMSG)));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		
		Assert.assertTrue("error messages for reg no , v5c , firstname last name , dat of brith should get displayed", present);
	}

}
