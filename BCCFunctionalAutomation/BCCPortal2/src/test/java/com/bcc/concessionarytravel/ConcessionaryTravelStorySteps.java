package com.bcc.concessionarytravel;

import java.util.List;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ConcessionaryTravelStorySteps extends ConcessionaryTravelStoryBase {
	
	@When("user clicks Apply for an older person's bus pass")
	public void clickOldpersonBuspass()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(APPLY_OLDBUSPASS))).click();
	}
	
	@When("user submits DOB : <date> <month> <year>")
	public void submitDob(@Named("date") String date , @Named("month") String month , @Named("year") String year)
	{
		this.date = date;
		this.month = month;
		this.year = year;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_DOBDAY))).sendKeys(this.date);
		driver.findElement(By.id(propertyBag.getPageProperty(CT_DOBMONTH))).sendKeys(this.month);
		driver.findElement(By.id(propertyBag.getPageProperty(CT_DOBYEAR))).sendKeys(this.year);
		
		driver.findElement(By.name(propertyBag.getPageProperty(CT_DOBSUBMIT))).click();
	}
	
	@When("user enters post code and clicks on find address")
	public void postcodeLookupCt(@Named("postcode") String postcode)
	{
		this.postcode = postcode;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_POSTCODE))).sendKeys(this.postcode);
				
		driver.findElement(By.name(propertyBag.getPageProperty(CT_FINDADDRESS))).click();
	}
	
	@When("user selects address : <lookupaddress>")
	public void selectAddressCt(@Named("lookupaddress") String lookupaddress)
	{
		this.lookupaddress = lookupaddress;
		Select dropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(CT_LOOKUPADDRESS))));
		int index;
		try {
			index = Integer.parseInt(this.lookupaddress);
		} catch (NumberFormatException nfe) {
			index = 1;	//default to the
		}
		dropdown.selectByIndex(index);			
	}
	
	@When("user selects title : <title>")
	public void selectTitleCt(@Named("title") String title)
	{
		this.title = title;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_TITLE))).sendKeys(this.title);
	}
	
	@When("user enters first name : <firstname>")
	public void enterFirstNameCt(@Named("firstname") String firstname)
	{
		this.firstname = firstname;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_FIRSTNAME))).sendKeys(this.firstname);
	}
	
	@When("user enters last name : <lastname>")
	public void enterLastNameCt(@Named("lastname") String lastname)
	{
		this.lastname = lastname;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_LASTNAME))).sendKeys(this.lastname);
	}
	
	@When("user selects gender : <gender>")
	public void selectGenderCt(@Named("gender") String gender)
	{
		this.gender = gender;
		if(this.gender == "Male")
		{
			driver.findElement(By.id(propertyBag.getPageProperty(CT_GENDERMALE))).click();
		}
		else if(this.gender == "Female")
		{
			driver.findElement(By.id(propertyBag.getPageProperty(CT_GENDERFEMALE))).click();
		}
		else
		{
			driver.findElement(By.id(propertyBag.getPageProperty(CT_GENDERNOTTOSAY))).click();
		}
	}	
	
	@When("user enters email : <email>")
	public void EmailCt(@Named("email") String email)
	{
		this.email = email;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_EMAIL))).sendKeys(this.email);
	}
	
	@When("user enters phone number : <phonenumber>")
	public void enterPhoneNoCt(@Named("phonenumber") String phonenumber)
	{
		this.phonenumber = phonenumber;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_PHONENUMBER))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(CT_PHONENUMBER))).sendKeys(this.phonenumber);
	}
	
	@When("user clicks next on main form")
	public void clickNextMainForm()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(CT_NEXTONFORM))).click();
	}
	
	@When("user uploads photo : <uploadphoto>")
	public void uploadPhoto(@Named ("photopath") String photopath)
	{
		this.photopath =  photopath;
		driver.findElement(By.id(propertyBag.getPageProperty(CT_BROWSEPHOTO))).sendKeys(this.photopath);
		driver.findElement(By.name(propertyBag.getPageProperty(CT_UPLOADPHOTO))).click();
	}
	
	@When("user clicks next on photo upload page")
	public void clickNextPhotoUploadPage()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(CT_NEXTONPHOTOUPLOAD))).click();
	}
	
	@Then("system should navigate to preview page")
	public void ctPreviewPage()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(CT_PREVIEWMESSAGE))).size() > 0;
		Assert.assertTrue("User should navigate to preivew page", val);
	}
	
	@When("user clicks agree and confirm order")
	public void confirmOrder()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(CT_CONFIRMORDER))).click();
	}
	
	@Then("system should navigate to thank you page")
	public void ctThankyouPage()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(CT_THANKYOUMSG))).size() > 0;
		Assert.assertTrue("User should navigate to thank you page", val);
	}
	
	@When("user starts equalities monitoring")
	public void startEqualities()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(CT_STARTEQUALITIES))).click();
	}
	

	
	
	
}
