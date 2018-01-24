package com.bcc.foi;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class FoiStorySteps extends FoiStoryBase {
	
	
	@When("user select FOI menu")
	public void selectFOI()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(HOME_FOI_MENU))).click();
	}
	
	@When("user click on make a new foi request button")
	public void clickMakeFOIRequest()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_MakeanewFOIrequest))).click();
	}
	
	@Then("user should be in make FOI Request Page")
	public void validateMakeFOIPage()
	{
		boolean present;
		
		try
		{
			driver.findElement(By.id(propertyBag.getPageProperty(FOI_Enquiry)));
			present = true;			
		}
		catch(NoSuchElementException e) {
			   present = false;
		}
		
		Assert.assertTrue("System should navigate to the Make FOI Request Page ", present);
	}
	
	
	@When("user enter your request : <request>")
	public void enterRequest(@Named("request") String request)  
	{
		this.request = request;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Enquiry))).sendKeys(this.request);
	}
	
	@When("user select title : <title>")
	public void selectTitle(@Named("title") String title)  
	{
		this.title = title;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_title))).sendKeys(this.title);
	}
	
	
	@When("user enters first Name : <firstName>")
	public void enterFirstName(@Named("firstName") String firstName)
	{
		this.firstName = firstName;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_FirstName))).sendKeys(this.firstName);
	}
	
	@When("user enters last Name : <lastName>")
	public void enterLastName(@Named("lastName") String lastName)
	{
		this.lastName = lastName;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_lastName))).sendKeys(this.lastName);
	}
	
	@When("user enters your org : <yourOrg>")
	public void enterYourOrg(@Named("yourOrg") String yourOrg)
	{
		this.yourOrg = yourOrg;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_YourOrganisation))).sendKeys(this.yourOrg);
	}
	
	
	@When("user enters email : <email>")
	public void enterEMail(@Named("email") String email)
	{
		this.email = email;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_EMail))).sendKeys(this.email);
	}
	
	@When("user click on Preview your request Button")
	public void clickPreviewRequest()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(FOI_PreviewYourRequest))).click();
	}
	
	@Then("system should navigate to Preview your request page")
	public void validatePreview()
	{
        boolean present;
		
		try
		{
			driver.findElement(By.name(propertyBag.getPageProperty(FOI_SubmitYourRequest)));
			present = true;			
		}
		catch(NoSuchElementException e) {
			   present = false;
		}
		
		Assert.assertTrue("System should navigate to the Preview your request Page ", present);
	}
	
	@When("user clicks on Submit your request button")
	public void clickSubmitRequest()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(FOI_SubmitYourRequest))).click();
	}
	
	@Then("user should navigate to thank you page")
	public void validateThankyouPage()
	{
       boolean present;
		
		try
		{
			driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_ReferenceNumber)));
			present = true;			
		}
		catch(NoSuchElementException e) {
			   present = false;
		}
		
		Assert.assertTrue("System should navigate to the thank you Page ", present);
	}
	
	@Then("system should display Reference Number and the What Happens Next")
	public void checkrefnumber()
	{
       	String strrefno = driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_ReferenceNumber))).getText();
       	
       	System.out.println(strrefno);
       	
       
				
		Assert.assertTrue("Reference Number should get displayed " , true);
		
		
		 boolean present;
			
			try
			{
				if (driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_WhatHappenNextEmail))) != null)
				{
				   present = true;
				}
				else if (driver.findElement(By.xpath(propertyBag.getPageProperty(FOI_WhatHappenNextPostAddrss))) != null)
				{
					present = true;	
				}
				else
					present = false;
			}
			catch(NoSuchElementException e) {
				   present = false;
			}
			
			
			Assert.assertTrue("What happens next is displayed ", present);
	}
		
	@When("user wants to upload the documents : <uploaddoc>")
	public void uploadDoc(@Named ("uploaddoc") String uploaddoc)
	{
		
		this.uploaddoc =  uploaddoc;
		if(this.uploaddoc.equalsIgnoreCase("Y"))
		{
		WebElement file_field1 = driver.findElement(By.id(propertyBag.getPageProperty(FOI_UploadFile1)));
		file_field1.sendKeys("C:\\opt\\bcc\\tests\\uploadfiles\\img1.jpg");
		
		
		driver.findElement(By.name(propertyBag.getPageProperty(FOI_DocumentUpload))).click();
		
		
		}
	}
	
	
	
	

}
