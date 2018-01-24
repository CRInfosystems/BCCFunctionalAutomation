package com.bcc.customer.profile;

import java.util.List;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
* Created Date : 07/02/2014
* Description  : This class Verify customer is not having any default contact details
* Story id      : 1534 - Change Phone Number
*/


public class NewCustomerPhoneDetails extends CustomerStorySteps {
	
	public NewCustomerPhoneDetails() {
	}
	
	
	
	@Then("verify contact details for the new customer")
	public void contactDetails()
	{
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(CONTACTDETAILS))).findElements(By.className(propertyBag.getPageProperty(CONTACTDETAILS_ROWS))); 
		
		int count = listFieldSet.size();
		System.out.println(count);
		for(int i = 0; i< count ; i++)
		{	
			
			switch(i)
			{
				
			   case 0 : 
				     ActualLandlinetelephone = listFieldSet.get(i).getText();
				     assertStringContains(ActualLandlinetelephone,"Landline telephone:");
				      break;
			   case 1 :
				    ActualMobile =  listFieldSet.get(i).getText();
				    assertStringContains(ActualMobile,"Mobile:");
				    break;
					
			}
		}
		
		
				
		
	}
}
	
	





