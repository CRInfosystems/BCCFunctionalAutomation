package com.bcc.foi.makefoirequest;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import com.bcc.foi.FoiStorySteps;

public class LoggoutMakeFoiRequestPostalAddress extends FoiStorySteps {
	
	public LoggoutMakeFoiRequestPostalAddress()
	{
		
	}
	
	@When("user select checkbox i dont have email id : <idonthaveemail>")
	public void selectIdonthaveEmailid(@Named("idonthaveemail") String idonthaveemail)
	{
		this.idonthaveemail = idonthaveemail;
		if(this.idonthaveemail.equalsIgnoreCase("yes"))
				driver.findElement(By.id(propertyBag.getPageProperty(FOI_IdonthaveCheckBox))).click();
	}
	
	@When("user enters AddressLine1 : <addressLine1>")
	public void enterAddressline1(@Named("addressLine1") String addressLine1)
	{
		this.addressLine1 = addressLine1;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Address1))).sendKeys(this.addressLine1);
	}
	
	@When("user enters AddressLine2 : <addressLine2>")
	public void enterAddressline2(@Named("addressLine2") String addressLine2)
	{
		this.addressLine2 = addressLine2;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Address2))).sendKeys(this.addressLine2);
	}
	
	
	@When("user enters AddressLine3 : <addressLine3>")
	public void enterAddressline3(@Named("addressLine3") String addressLine3)
	{
		this.addressLine3 = addressLine3;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Address3))).sendKeys(this.addressLine3);
	}
	
	
	@When("user enters AddressLine4 : <addressLine4>")
	public void enterAddressline4(@Named("addressLine4") String addressLine4)
	{
		this.addressLine4 = addressLine4;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Address4))).sendKeys(this.addressLine4);
	}
	
	@When("user enters PostCode : <postCode>")
	public void enterPostCode(@Named("postCode") String postCode)
	{
		this.postCode = postCode;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_PostCode))).sendKeys(this.postCode);
	}
	
	
	@When("user enters Country: <country> , <OtherCountry>")
	public void enterCountry(@Named("country") String country , @Named("OtherCountry") String OtherCountry) throws InterruptedException
	{
		this.country = country;
		this.OtherCountry = OtherCountry;
		driver.findElement(By.id(propertyBag.getPageProperty(FOI_Country))).sendKeys(this.country);
		
		
		if(this.country.equalsIgnoreCase("other"))
		{
			
			//Thread.sleep(3000);
			driver.findElement(By.id(propertyBag.getPageProperty(FOI_PostCode))).click();
			driver.findElement(By.id(propertyBag.getPageProperty(FOI_OtherCountry))).sendKeys(this.OtherCountry);
		}
	}

}
