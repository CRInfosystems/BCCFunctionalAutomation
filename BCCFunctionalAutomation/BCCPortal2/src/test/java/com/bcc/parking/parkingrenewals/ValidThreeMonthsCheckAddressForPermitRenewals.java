package com.bcc.parking.parkingrenewals;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class ValidThreeMonthsCheckAddressForPermitRenewals extends ParkingStorySteps{
	
	public ValidThreeMonthsCheckAddressForPermitRenewals()
	{
		
	}
	
  @Then("system should display the same address selected in the permit details page")
  public void checkAddress()
  {
	  String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_CHECKADDRESS))).getText();
	  
	  System.out.println(actualmsg);
	  
	  String exptmsg = selectedValue;
	  
	  System.out.println(exptmsg);
	  
	  Assert.assertTrue("should display the same address ,  selected in permit details page" , actualmsg.equalsIgnoreCase(exptmsg));
  }

}
