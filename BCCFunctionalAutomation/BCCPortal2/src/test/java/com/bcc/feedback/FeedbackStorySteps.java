package com.bcc.feedback;

import java.util.List;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FeedbackStorySteps extends FeedbackStoryBase {
	
	@When("user enters your feedback : <feedback>")
	public void enterFeedback(@Named("feedback") String feedback)
	{
		this.feedback = feedback;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_YOURFEEDBACK))).sendKeys(this.feedback);
	}

	@When("user enters your action : <action>")
	public void enterAction(@Named("action") String action)
	{
		this.action = action;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_YOURACTION))).sendKeys(this.action);
	}
	
	@When("user selects the title : <title>")
	public void selectTitle(@Named("title") String title)
	{
		this.title = title;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_YOURTITLE))).sendKeys(this.title);
	}
	
	@When("user enters first name : <firstname>")
	public void enterFirstname(@Named("firstname") String firstname)
	{
		this.firstname = firstname;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_FIRSTNAME))).sendKeys(this.firstname);
	}
	
	@When("user enters last name : <lastname>")
	public void enterLastname(@Named("lastname") String lastname)
	{
		this.lastname = lastname;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_LASTNAME))).sendKeys(this.lastname);
	}
	
	@When("user enters email : <email>")
	public void enterEmail(@Named("email") String email)
	{
		this.email = email;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_EMAIL))).sendKeys(this.email);
	}
	
	@When("user enters phone number : <phonenumber>")
	public void enterPhoneNumber(@Named("phonenumber") String phonenumber)
	{
		this.phonenumber = phonenumber;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_PHONENUMBER))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_PHONENUMBER))).sendKeys(this.phonenumber);
	}
		
	@When("user checks i dont have email check box : <noemail>")
	public void selectNoEmail(@Named("noemail") String noemail)
	{
		this.noemail = noemail;
		if(this.noemail.equalsIgnoreCase("yes"))
			driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_NOEMAIL))).click();
	}
	
	@When("user enters house name : <housename>")
	public void enterHouseName(@Named("housename") String housename)
	{
		this.housename = housename;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_HOUSENAME))).sendKeys(this.housename);
	}
	
	@When("user enters address line1 : <addressline1>")
	public void enterAddressLine1(@Named("addressline1") String addressline1)
	{
		this.addressline1 = addressline1;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_ADDRESSLINE1))).sendKeys(this.addressline1);
	}
	
	@When("user enters address line2 : <addressline2>")
	public void enterAddressLine2(@Named("addressline2") String addressline2)
	{
		this.addressline2 = addressline2;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_ADDRESSLINE2))).sendKeys(this.addressline2);
	}
	
	@When("user enters postal town : <postaltown>")
	public void enterPostalTown(@Named("postaltown") String postaltown)
	{
		this.postaltown = postaltown;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_POSTALTOWN))).sendKeys(this.postaltown);
	}
	
	@When("user enters post code : <postcode>")
	public void enterPostcode(@Named("postcode") String postcode)
	{
		this.postcode = postcode;
		driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_POSTCODE))).sendKeys(this.postcode);
	}
	
	@When("user selects country : <country> , <other>")
	public void enterCountry(@Named("country") String country , @Named("other") String other)
	{
		this.country = country;
		this.other = other;
		if(this.country.equalsIgnoreCase("United Kingdom"))
			this.country = "United Kingdom";
		else
			this.country = "other";
		
		System.out.println(this.country);
		
		//driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_COUNTRY))).sendKeys(this.country);
		
		// clicking on the box to display the hidden other field
			
		
		if(this.country.equalsIgnoreCase("other"))
		{
			//driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_POSTCODE))).click();
			//driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_OTHER))).sendKeys(this.country);
           //st <WebElement> oListCountry =   driver.findElements(By.name(propertyBag.getPageProperty(FEEDBACK_COUNTRY)));
			
           Select odropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_COUNTRY))));
           int selectOption  = odropdown.getOptions().size();
           odropdown.selectByIndex(selectOption - 1);
           
		   driver.findElement(By.id(propertyBag.getPageProperty(FEEDBACK_OTHER))).sendKeys(this.other);
		}
	}
	
	@When("user clicks on preview your feedback button")
	public void clickPreviewButton()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(FEEDBACK_PREVIEWFEEDBACK))).click();
	}
	
	@Then("system should navigate to preview your feedback page")
	public void checkpreviewpage()
	{
		Boolean val = driver.findElements(By.name(propertyBag.getPageProperty(FEEDBACK_SUBMITFEEDBACK))).size() > 0;
		Assert.assertTrue("system should navigate to preview your feedback page", val);
	}
	
	@When("user clicks on submit your feedback button")
	public void clicksubmityourfeedback()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(FEEDBACK_SUBMITFEEDBACK))).click();
	}
	
	@Then("system should navigate to thank you page")
	public void verifyThankPage()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(FEEDBACK_THANKYOUPAGE))).size() > 0;
		System.out.println(val);
		Assert.assertTrue("system should navigate to thank you page", val);
	}
	
	@When("user clicks on feedback button")
	public void clickFeedback()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(FEEDBACK_BUTTON))).click();
	}
	
	
	

		
	}
