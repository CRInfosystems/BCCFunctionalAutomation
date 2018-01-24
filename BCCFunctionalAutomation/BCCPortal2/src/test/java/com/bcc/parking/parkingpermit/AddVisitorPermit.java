package com.bcc.parking.parkingpermit;

import java.util.NoSuchElementException;






import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class AddVisitorPermit   extends ParkingStorySteps {
	
	public AddVisitorPermit()
	{
		
	}
	
	
	
	
	
	@Then("Click on Finish and pay button")
	public void clickpandpay()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(PARKING_FINISHANDPAY))).click();
	}
	
	
	
	

}
