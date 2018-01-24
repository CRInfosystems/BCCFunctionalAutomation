package com.bcc.customer.profile;

import java.util.List;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
* Created Date : 07/02/2014
* Description  : This class Verify customer can able to update his mobile details
* Story id      : 1534 - Change Phone Number
*/

public class UpdateMobileDetails extends CustomerStorySteps {
	
	public UpdateMobileDetails() {
	}
	
	@Then("users old contact details")
	public void verifyOldContact()
	{
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(CONTACTDETAILS))).findElements(By.className(propertyBag.getPageProperty(CONTACTDETAILS_ROWS))); 
		
		int count = listFieldSet.size();
		System.out.println(count);
		for(int i = 0; i< count ; i++)
		{	
			
			switch(i)
			{
				
			   case 0 : 
				      oldlandlinenumber = listFieldSet.get(i).getText();
				     			     
					 break;
			   case 1 :
				      oldMobilenumber =  listFieldSet.get(i).getText();
				   
				     break;
					
			}
		}
	}
	
	
	@When("user enter Mobile : <ExpectedMobile> and clicks on Save Phones")
	public void changeLandline(@Named("ExpectedMobile") String ExpectedMobile)
	{
		this.ExpectedMobile = ExpectedMobile;
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(LANDLINE))).clear();
		System.out.println(this.ExpectedMobile);
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).sendKeys(this.ExpectedMobile);
		driver.findElement(By.name(propertyBag.getPageProperty(SAVEPHONE))).click();
	}
	
	@Then("system should display New Mobile details and Old LandLine details")
	public void newLandlineDetails()
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
				     assertStringContains(ActualLandlinetelephone, oldlandlinenumber );
				   		   
				     
					 break;
			   case 1 :
				    ActualMobile =  listFieldSet.get(i).getText();
				   		    
				    assertStringContains( ActualMobile, ExpectedMobile );
				    break;
					
			}
		}
		
	}
	


}
