package com.bcc.customer.payment;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import com.bcc.parking.ParkingStorySteps;

public class PayConfirmationSuccess extends ParkingStorySteps {
	
	public PayConfirmationSuccess()
	{
	}	
	
	
	@When("User Click on Confirm and Pay button after making note of total cost")
	public void confirmPayButtonTotalCost(){
		String cpdp = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_TOTALCOST))).getText();
		//String cpdp1[] = cpdp.split(" ");
		//System.out.println(cpdp1[1]);
		driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_BUYPERMITS))).click();
		String capita = driver.findElement(By.id(propertyBag.getPageProperty(PAY_PAYMENTAMOUNT))).getText();
		assertStringContains(cpdp, capita);
		
	}
   

	
    	
    
}