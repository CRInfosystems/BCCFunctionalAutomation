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
* Description  : This class Verify customer can able to update his contact details
* Story id      : 1534 - Change Phone Number
*/

public class UpdateContactDetailsCustomer extends CustomerStorySteps {
	
	public UpdateContactDetailsCustomer() {
	}
	
	
	
	
	@When("user enter landline : <ExpectedLandline> , mobile : <ExpectedMobile>  and clicks on Save Phones")
	public void ContactDetailsSavePhone(@Named("ExpectedLandline") String ExpectedLandline , @Named("ExpectedMobile") String ExpectedMobile)
	{
		this.ExpectedLandline = ExpectedLandline;
		this.ExpectedMobile = ExpectedMobile;
		driver.findElement(By.id(propertyBag.getPageProperty(LANDLINE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(LANDLINE))).sendKeys(this.ExpectedLandline);
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(MOBILE))).sendKeys(this.ExpectedMobile);
		driver.findElement(By.name(propertyBag.getPageProperty(SAVEPHONE))).click();
	}
	
	
	
	
	@Then("system should display customer new contact details")
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
				     assertStringContains(ActualLandlinetelephone, ExpectedLandline);
				   		   
				     
					 break;
			   case 1 :
				    ActualMobile =  listFieldSet.get(i).getText();
				    assertStringContains(ActualMobile, ExpectedMobile);
				     break;
					
			}
		}
		
		
				
		
	}
	
	
	

}
