package com.bcc.complaints;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class ComplaintsStorySteps extends ComplaintsStoryBase  {
	
	
	@When("user enters your complaints details : <complaints>")
	public void enterComplaintsDetails(@Named("complaints") String complaints)
	{
		this.complaints = complaints;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_YOURCOMPLAINTS))).sendKeys(this.complaints);
	}
	
	@When("user enters your action details : <request>")
	public void enterYourActions(@Named("request") String request)
	{
		this.request = request;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_DISIREDACTIONS))).sendKeys(this.request);
	}
	
	@When("user clicks on preview your complaints button")
	public void clickPreviewButton() throws InterruptedException
	{
		int timeout = Integer.parseInt(propertyBag.getConfigProperty(TIME_OUT_IN_SECONDS));
		  
	    // Thread.sleep(timeout);
	     driver.manage().timeouts().pageLoadTimeout(timeout , TimeUnit.SECONDS);	
		driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_PREVIEWYOURCOMPLAINTS))).click();
	}
	
	@Then("system should navigate to the preview your complaints page")
	public void checkpreviewpage()
	{
		Boolean val = driver.findElements(By.name(propertyBag.getPageProperty(COMPLAINTS_SUBMITYOURREQUEST))).size() > 0;
		Assert.assertTrue("User should navigate to the preivew your complaints page", val);
	}
	
	
	@When("user clicks on submit your request button")
	public void clicksubmityourrequest()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_SUBMITYOURREQUEST))).click();
	}
	
	@Then("system should navigate to the thank you page")
	public void verifyThankPage()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_THANKYOU_MSG))).size() > 0;
		System.out.println(val);
		Assert.assertTrue("system should navigate to the thank you page", val);
	}
	
	@When("user clicks on link make complaints anonymously")
	public void selectAnonymously()
	{
		
        int timeout = Integer.parseInt(propertyBag.getConfigProperty(LONG_SLEEP));
		
	    //Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(timeout , TimeUnit.SECONDS);
		
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_MAKECOMPLAINTANONYMOUSLY))).click();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_SOMEELSEBEHALF))).click();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_MAKECOMPLAINTANONYMOUSLY))).click();
		//driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_BUTTONCHOICE))).click();
	}
	
	@When("user selected the complaint type as Myself")
	public void selectMyself() throws InterruptedException
	{
		int timeout = Integer.parseInt(propertyBag.getConfigProperty(LONG_SLEEP));
		
	    //Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(timeout , TimeUnit.SECONDS);
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_MAKECOMPLAINTTOMYSELF))).click();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_SOMEELSEBEHALF))).click();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_MAKECOMPLAINTTOMYSELF))).click();
		
	}
	
	@When("user selected the complaint type for some one else behalf")
	public void selectSomeElseBehalf()
	{
       
		int timeout = Integer.parseInt(propertyBag.getConfigProperty(LONG_SLEEP));
		
	    //Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(timeout , TimeUnit.SECONDS);
		
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_SOMEELSEBEHALF))).click();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_MAKECOMPLAINTTOMYSELF))).click();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_SOMEELSEBEHALF))).click();
		//driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_BUTTONCHOICE))).click();
	}
	
	@When("user select the title : <title>")
	public void selectTitle(@Named("title") String title)
	{
		this.title = title;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_TITLE))).sendKeys(this.title);
	}
	
	@When("user enter the first name : <firstname>")
	public void enterFirstName(@Named("firstname") String firstname)
	{
		this.firstname = firstname;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_FIRSTNAME))).sendKeys(this.firstname);
	}
	
	@When("user enter the last name : <lastname>")
	public void enterLastName(@Named("lastname") String lastname)
	{
		this.lastname = lastname;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_LASTNAME))).sendKeys(this.lastname);
	}
	
	
	@When("user enter the email : <email>")
	public void enterEmail(@Named("email") String email)
	{
		this.email = email;
		driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_EMAIL))).sendKeys(this.email);
	}
	
	@Then("system should display the reference number")
	public void checkRefNo()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_REFERENCENO))).size() > 0;
		String refno = driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_REFERENCENO))).getText();
		System.out.println(refno);
		Assert.assertTrue("System should display the message you will not receive a confirmation as you choose to remain anonymous", val);
	}
	
	
	@When("user checks i dont have email check box : <noemail>")
	public void selectNoEmail(@Named("noemail") String noemail)
	{
		this.noemail = noemail;
		if(this.noemail.equalsIgnoreCase("y"))
			driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_CHECKBOXDONTHAVEEMAIL))).click();
	}
	
		
	@When("user enters house name : <housename>")
	public void enterHouseName(@Named("housename") String housename)
	{
		this.housename = housename;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_HOUSENAME))).sendKeys(this.housename);
	}
	
	@When("user enters address line1 : <addressline1>")
	public void enterAddressLine1(@Named("addressline1") String addressline1)
	{
		this.addressline1 = addressline1;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLANITS_ADDRESSLINE1))).sendKeys(this.addressline1);
	}
	
	@When("user enters address line2 : <addressline2>")
	public void enterAddressLine2(@Named("addressline2") String addressline2)
	{
		this.addressline2 = addressline2;
		System.out.println(addressline2);
		System.out.println(this.addressline2);
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_ADDRESSLINE2))).sendKeys(this.addressline2);
	}
	
	
	@When("user enters postal town : <postaltown>")
	public void enterPostaltown(@Named("postaltown") String postaltown)
	{
		this.postaltown = postaltown;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_POSTALTOWN2))).sendKeys(this.postaltown);
	}
	
	
	@When("user enters post code : <postcode>")
	public void enterPostalcode(@Named("postcode") String postcode)
	{
		this.postcode = postcode;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_POSTCODE))).sendKeys(this.postcode);
	}
	
	@When("user selects country : <country> , <other>")
	public void enterCountry(@Named("country") String country , @Named("other") String other)
	{
		this.country = country;
		if(this.country.equalsIgnoreCase("United Kingdom"))
			this.country = "United Kingdom";
		else
			this.country = "other";
		
		System.out.println(this.country);
		
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_COUNTRY))).sendKeys(this.country);
		
		// clicking on the box to display the hidden other field
		
		
		if(this.country.equalsIgnoreCase("other"))
		{
			driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_POSTCODE))).click();
			driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERS))).sendKeys("INDIA");
		}
	}
	
	@When("user enters phone no : <phoneno>")
	public void enterPhoneNo(@Named("phoneno") String phoneno)
	{
      
		int timeout = Integer.parseInt(propertyBag.getConfigProperty(LONG_SLEEP));
		
	    //Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(timeout , TimeUnit.SECONDS);
		
		
		this.phoneno = phoneno;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_PHONE))).clear();
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_PHONE))).sendKeys(this.phoneno);
	}
	
	@Then("check the address is displayed in the preview page")
	public void checkAddress()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_CONFIRMADDRESS))).size() > 0;
		Assert.assertTrue("system should display the comfirm address in the preivew page", val);
	}
	
	@When("user select others title:<othertitle>")
	public void selectotherTitle(@Named("othertitle") String othertitle)
	{
		this.othertitle = othertitle;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERTITLE))).sendKeys(this.othertitle);
	}
	
	@When("user enter the others first name : <otherfirstname>")
	public void enterOtherFirstName(@Named("otherfirstname") String otherfirstname)
	{
		this.otherfirstname = otherfirstname;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHER_FIRSTNAME))).sendKeys(this.otherfirstname);
	}
	
	@When("user enter the others last name : <otherlastname>")
	public void enterOtherLastName(@Named("otherlastname") String otherlastname)
	{
		this.otherlastname = otherlastname;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHER_LASTNAME))).sendKeys(this.otherlastname);
	}
	
	
	@When("user enter the others email : <otheremail>")
	public void enterotherEmail(@Named("otheremail") String otheremail)
	{
		this.otheremail = otheremail;
		driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_OTHER_EMAIL))).sendKeys(this.otheremail);
	}
	
	@When("user enters other phone no : <otherphoneno>")
	public void enterotherPhoneNo(@Named("otherphoneno") String otherphoneno)
	{
		this.otherphoneno = otherphoneno;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERPHONE))).sendKeys(this.otherphoneno);
	}
	
	@When("user select the check box send me copy of respond : <Sendmecopy>")
	public void sendResponds(@Named("Sendmecopy") String Sendmecopy)
	{
		this.Sendmecopy = Sendmecopy;
		if(this.Sendmecopy.equalsIgnoreCase("Y"))
			driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_MYDETAILSFIELDS))).click();
	}
	
	@When("user enter others house name : <otherhousename>")
	public void selectotherhousename(@Named("otherhousename") String otherhousename)
	{
		this.otherhousename = otherhousename;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERHOUSENAME))).sendKeys(this.otherhousename);
	
	}
	
	
	
	@When("user enters others address line1 : <otheraddressline1>")
	public void enterOtherAddressLine1(@Named("otheraddressline1") String otheraddressline1)
	{
		this.otheraddressline1 = otheraddressline1;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERADDRESSLINE1))).sendKeys(this.otheraddressline1);
	}
	
	@When("user enters others address line2 : <otheraddressline2>")
	public void enterOtherAddressLine2(@Named("otheraddressline2") String otheraddressline2)
	{
		this.otheraddressline2 = otheraddressline2;
		System.out.println(otheraddressline2);
		System.out.println(this.otheraddressline2);
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERADDRESSLINE2))).sendKeys(this.otheraddressline2);
	}
	
	
	@When("user enters others postal town : <otherpostaltown>")
	public void enterOtherPostaltown(@Named("otherpostaltown") String otherpostaltown)
	{
		this.otherpostaltown = otherpostaltown;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERPOSTTOWN))).sendKeys(this.otherpostaltown);
	}
	
	
	@When("user enters others post code : <otherpostcode>")
	public void enterOtherPostalcode(@Named("otherpostcode") String otherpostcode)
	{
		this.otherpostcode = otherpostcode;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERPOSTCODE))).sendKeys(this.otherpostcode);
	}
	
	@When("user selects others country : <othercountry> , <otheroutofuk>")
	public void enterOtherCountry(@Named("othercountry") String othercountry , @Named("otheroutofuk") String otheroutofuk)
	{
		this.othercountry = othercountry;
		if(this.othercountry.equalsIgnoreCase("United Kingdom"))
			this.othercountry = "United Kingdom";
		else
			this.othercountry = "other";
		
		System.out.println(this.othercountry);
		
		driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_OTHERCOUNTRY))).sendKeys(this.othercountry);
		
		// clicking on the box to display the hidden other field
		
		
		if(this.othercountry.equalsIgnoreCase("other"))
		{
			driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERPOSTCODE))).click();
			driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERWHICHCOUNTRY))).sendKeys("INDIA");
		}
	}
	
	
	
	@When("user checks they dont have email check box : <theydonethaveemail>")
	public void theyDonthaveemail(@Named("theydonethaveemail") String theydonethaveemail)
	{
		this.theydonethaveemail = theydonethaveemail;
		driver.findElement(By.name(propertyBag.getPageProperty(COMPLAINTS_OTHERSDONTHAVEEMAIL))).click();
	}
	
	@Then("system should display the message you will not receive a confirmation as you choose to remain anonymous")
	public void verifyCheckAnamouslyMsg()
	{
		Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(COMPLAINTS_ANONYMOUS_MSG))).size() > 0;
		Assert.assertTrue("System should display the message you will not receive a confirmation as you choose to remain anonymous", val);
		
	}
	
	
	@Then("check the email is displayed in the preview page")
	public void checkEmail()
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_COMFIRMEMAIL))).getText();
		String expectedMsg = emailaddress;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}
	
	@When("user enter the others date of Birth : <otherdateofbirth>")
	public void addDateofBirth(@Named("otherdateofbirth") String otherdateofbirth)
	{
		this.otherdateofbirth = otherdateofbirth;
		driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_OTHERDATEOFBIRTH))).sendKeys(this.otherdateofbirth);
	}
	
	
	
	@When("user selects the relationship : <relationship>")
	public void selectReplationShip(@Named("relationship") String relationship)
	{
		this.relationship = relationship;
		WebElement relationshipDropDown =(driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_REPLATIONSHIP))));
		new Select(relationshipDropDown).selectByVisibleText(this.relationship);
	}
	
	@When("user selects the add their address : <addtheiraddress>")
	public void addTheirAddress(@Named("addtheiraddress") String addtheiraddress)
	{
		this.addtheiraddress = addtheiraddress;
		if((this.addtheiraddress).equalsIgnoreCase("y")	)
				driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_THEIRADDRESSCHECKBOX))).click();
	}
	

	
	@When("user clicks on make a complaint button")
	public void clickComplaintButton()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_MAKECOMPLAINT))).click();
	}
	
	@Then("system should display login email - myself")
	public void myselfLoginEmail() throws InterruptedException
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_MYSELFEMAIL))).getText();
		String expectedMsg = emailaddress;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}
	
	@Then("system should display login email - proxy")
	public void proxyLoginEmail() throws InterruptedException
	{
		String actualEmail = driver.findElement(By.xpath(propertyBag.getPageProperty(COMPLAINTS_PROXYSELFEMAIL))).getText();
		String expectedMsg = emailaddress;
		System.out.println(actualEmail);
		System.out.println(expectedMsg);
		Assert.assertTrue("Email should get displayed", actualEmail.equalsIgnoreCase(expectedMsg));
	}
	
}