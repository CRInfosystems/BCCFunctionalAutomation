package com.bcc.parking;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public  abstract class ParkingStorySteps extends ParkingStoryBase{
	
	
	@When("User clicks on the parking menu")
	public void clickPakingMenu()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_MENU))).click();
		
	}
	
	@When("User clicks on Get parking permits button")
	public void clickparkingpermits()
	{
		driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_GETPARKINGPERMITS))).click();
	}
	
	@When("User clicks on Get visitor permits link")
    public void clickvisitorpermits()
    {
        driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_GETVISITORPERMITS))).click();
    }

	@When("Users Clicks Next Button")
	public void clickNextButton()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CONTINUENEXTSTEP))).click();
		
	}
	
	@When("User Enter Post code : <postcode>")
	public void enterPostCode(@Named("postcode") String postcode)
	{
		this.postcode = postcode;
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_POSTCODE))).sendKeys(this.postcode);
	}
	
	@When("User clicks on Find Address button")
	public void clickFindAddress()
	{
		driver.findElement(By.name(propertyBag.getPageProperty(PARKING_FINDADDRESS))).click();		
	}
	

	
	@When("User enters the registration number : <regno>")
	public void enterCarDetails(@Named("regno") String regno )
	{
		this.regno = regno;
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTRATIONNO))).sendKeys(this.regno);
		
	}
	
	@When("User enters the V5c Number : <v5c>")
	public void enterV5c(@Named("v5c") String v5c)
	{
		this.v5c = v5c;
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_V5C))).sendKeys(this.v5c);
	}
	
	@When("User enter the registered Keeper : <regkeeper>")
	public void enterregKeeper(@Named("regkeeper") String regkeeper)
	{
		this.regkeeper = regkeeper;
		driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTERKEEPER))).sendKeys(this.regkeeper);
		
	}
	
	@When("User clicks add vehicle")
	public void userClicksAddVehicle()
	{
		driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_ADDVEHICLE))).click();
	}
	
	@When("User clicks add additional vehicle")
	public void addAdditionalVehicle(){
		
		driver.findElement(By.name(propertyBag.getPageProperty(PARKING_ADDADDITIONALVEHICLE))).click();
	}
	{
		
		
	}
	
	 @When("User enters the registration number : <regno2>")
	    public void enterCarDetails2(@Named("regno2") String regno2 )
	    {
	        this.regno = regno2;
	        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTRATIONNO2))).sendKeys(this.regno);
	        
	    }
	    
	    @When("User enters the V5c Number : <v5c2>")
	    public void enterV5c2(@Named("v5c2") String v5c2)
	    {
	        this.v5c = v5c2;
	        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_V5C2))).sendKeys(this.v5c);
	    }
	    
	    @When("User enter the registered Keeper : <regkeeper2>")
	    public void enterregKeeper2(@Named("regkeeper2") String regkeeper2)
	    {
	        this.regkeeper = regkeeper2;
	        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTERKEEPER2))).sendKeys(this.regkeeper);
	        
	    }
	    
	    @When("User enters the registration number : <regno3>")
	    public void enterCarDetails3(@Named("regno3") String regno3 )
	    {
	        this.regno = regno3;
	        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTRATIONNO3))).sendKeys(this.regno);
	        
	    }
	    
	    @When("User enters the V5c Number : <v5c3>")
	    public void enterV5c3(@Named("v5c3") String v5c3)
	    {
	        this.v5c = v5c3;
	        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_V5C3))).sendKeys(this.v5c);
	    }
	    
	    @When("User enter the registered Keeper : <regkeeper3>")
	    public void enterregKeeper3(@Named("regkeeper3") String regkeeper3)
	    {
	        this.regkeeper = regkeeper3;
	        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTERKEEPER3))).sendKeys(this.regkeeper);
	        
	    }
	    
	    @When("User enters the registration number : <regno4>")
        public void enterCarDetails4(@Named("regno4") String regno4 )
        {
            this.regno = regno4;
            driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTRATIONNO4))).sendKeys(this.regno);
            
        }
        
        @When("User enters the V5c Number : <v5c4>")
        public void enterV5c4(@Named("v5c4") String v5c4)
        {
            this.v5c = v5c4;
            driver.findElement(By.id(propertyBag.getPageProperty(PARKING_V5C4))).sendKeys(this.v5c);
        }
        
        @When("User enter the registered Keeper : <regkeeper4>")
        public void enterregKeeper4(@Named("regkeeper5") String regkeeper4)
        {
            this.regkeeper = regkeeper4;
            driver.findElement(By.id(propertyBag.getPageProperty(PARKING_REGISTERKEEPER4))).sendKeys(this.regkeeper);
            
        }
	
	
        @When("User enter <firstname>")
        public void enterFirstName(@Named("firstname") String firstname){
        	
        	this.firstname=firstname;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FIRSTNAME))).sendKeys(this.firstname);
        	}
        
        @When("User enter <lastname>")
        public void enterLastName(@Named("lastname") String lastname ){
        	
        	this.lastname = lastname;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_LASTNAME))).sendKeys(this.lastname);
        }
        
        @When("User enter <dateofbirth>")
        public void enterDateOfBirth(@Named("dateofbirth") String dateofbirth){
        	
        	this.dateofbirth= dateofbirth;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_DATEOFBIRTH))).sendKeys(this.dateofbirth);
        }
        
        @When("User enter <firstname2>")
        public void enterFirstName2(@Named("firstname2") String firstname2){
        	
        	this.firstname2=firstname2;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FIRSTNAME2))).sendKeys(this.firstname2);
        	}
        
        @When("User enter <lastname2>")
        public void enterLastName2(@Named("lastname2") String lastname2 ){
        	
        	this.lastname2 = lastname2;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_LASTNAME2))).sendKeys(this.lastname2);
        }
        
        @When("User enter <dateofbirth2>")
        public void enterDateOfBirth2(@Named("dateofbirth2") String dateofbirth2){
        	
        	this.dateofbirth2= dateofbirth2;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_DATEOFBIRTH2))).sendKeys(this.dateofbirth2);
        }
        
        @When("User enter <firstname3>")
        public void enterFirstName3(@Named("firstname3") String firstname3){
        	
        	this.firstname3=firstname3;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FIRSTNAME3))).sendKeys(this.firstname3);
        	}
        
        @When("User enter <lastname3>")
        public void enterLastName3(@Named("lastname3") String lastname3 ){
        	
        	this.lastname3 = lastname3;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_LASTNAME3))).sendKeys(this.lastname3);
        }
        
        @When("User enter <dateofbirth3>")
        public void enterDateOfBirth3(@Named("dateofbirth3") String dateofbirth3){
        	
        	this.dateofbirth3= dateofbirth3;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_DATEOFBIRTH3))).sendKeys(this.dateofbirth3);
        }
        
        @When("User enter <firstname4>")
        public void enterFirstName4(@Named("firstname4") String firstname4){
        	
        	this.firstname4=firstname4;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FIRSTNAME4))).sendKeys(this.firstname4);
        	}
        
        @When("User enter <lastname4>")
        public void enterLastName4(@Named("lastname4") String lastname4 ){
        	
        	this.lastname4 = lastname4;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_LASTNAME4))).sendKeys(this.lastname4);
        }
        
        @When("User enter <dateofbirth4>")
        public void enterDateOfBirth4(@Named("dateofbirth4") String dateofbirth4){
        	
        	this.dateofbirth4= dateofbirth4;
        	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_DATEOFBIRTH4))).sendKeys(this.dateofbirth4);
        } 
        
	@When("User Click on Next Button")
	public void ClickNextCarDetails()
	{
		//driver.findElement(By.name(propertyBag.getPageProperty(PARKING_CONTINUENEXTSTEP))).click();
         
		driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_NEXTBUTTONVEHICLE))).click();
		
	}
	
	@Then("System should display <errorMessage>")
	public void thenSystemShouldDisplayErrorMessage(@Named("errorMessage") String errorMessage)
	{
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORMSG))).getText();
		
		assertStringContains(actualmsg, errorMessage );
		
		
	}
	
	@Then("Verify the error messages")
	public void verifyErrorMsg()
	{
		//PARKING_CARDETAILSERRORMSGS
		
		String errormsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CARDETAILSERRORMSGS))).getText();
		System.out.println(errormsg);
		String expectederrormsg1 = "Please enter a valid registration number";
		String expectederrormsg2 = "Please enter a valid V5C Document Reference Number";
		assertStringContains(errormsg,expectederrormsg1); 
		assertStringContains(errormsg,expectederrormsg2);
	}
	
	@Then("System should display error message :<errorMessage>")
	public void systemShouldDisplayErrorMessage(@Named("errorMessage") String errorMessage)
	{
		String errormsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CARDETAILSERRORMSGS))).getText();
		assertStringContains(errormsg,errorMessage); 
		
	}
	
	@Then("System should display order number :<orderNumber>")
    public void systemShouldDisplayOrderNumber(@Named("orderNumber") String orderNumber)
    {
        String orderNo = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ORDERNUMBER))).getText();
        assertStringContains(orderNo,orderNumber); 
    }
	
	
	@Then("System should display error page message :<errorMessage>")
    public void systemShouldDisplayErrorPageMessage(@Named("errorMessage") String errorMessage)
    {
        String errormsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ERRORPAGEMSG))).getText();
        assertStringContains(errormsg,errorMessage); 
        
    }
	
	
	
	@When("User selects address :<lookupaddress>")
	public void selectAddressandclickNext(@Named("lookupaddress") String lookupaddress)
	{
		this.lookupaddress = lookupaddress;
		Select dropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(PARKING_SELECTADDRESS))));
		int index;
		try {
			index = Integer.parseInt(this.lookupaddress);
		} catch (NumberFormatException nfe) {
			index = 1;	//default to the
		}
		dropdown.selectByIndex(index);
		
		
		
		
				
	}
	
	
	@When ("User selects parking type Offstreet : <offstreet> and private : <priavteparking>")
	public void selectParkingType(@Named("offstreet") String offstreet , @Named("priavteparking") String priavteparking )
	{
		this.offstreet = offstreet;
		if((this.offstreet).equalsIgnoreCase("yes"))
		{
			driver.findElement(By.id(propertyBag.getPageProperty(PARKING_OFFSTREETCHECKBOX))).click();
		}
		
		this.priavteparking = priavteparking;
		if((this.priavteparking).equalsIgnoreCase("yes"))
		{
			driver.findElement(By.id(propertyBag.getPageProperty(PARKING_PRIVATECHECKBOX))).click();
		}
	}
	
	
	
	
	// your details page
	@When("User enter his details Title : <title> , FirstName : <firstname> , LastName : <lastname> , Email : <email> , Password : <password> and click on conform and pay button")
	public void yourdetails(@Named("title") String title , @Named("firstname") String firstname , @Named("lastname") String lastname , @Named("email") String email , @Named("password") String password )
	{
		this.title = title;
				Select dropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(REGISTRATION_TITLE))));
		dropdown.selectByVisibleText(this.title);
		this.firstname = firstname;
		driver.findElement(By.id(propertyBag.getPageProperty(REGISTRATION_FIRST_NAME))).sendKeys(this.firstname);
		this.lastname = lastname;
		driver.findElement(By.id(propertyBag.getPageProperty(REGISTRATION_LAST_NAME))).sendKeys(this.lastname);
		this.email = email;
		driver.findElement(By.id(propertyBag.getPageProperty(REGISTRATION_EMAIL_ADDRESS))).sendKeys(this.email);
		this.password = password;
		driver.findElement(By.id(propertyBag.getPageProperty(REGISTRATION_PASSWORD))).sendKeys(this.password);
		driver.findElement(By.id(propertyBag.getPageProperty(REGISTRATION_PASSWORD_CONFIRM))).sendKeys(this.password);
		driver.findElement(By.name(propertyBag.getPageProperty(PARKING_CONFIRMANDPAY))).click();
		
	}
	
	@When("User Click Next button in permits details page")
	public void nextpermitdetails()
	{
		driver.findElement(By.className(propertyBag.getPageProperty(PARKING_NEXTPERMITDETAILS))).click();
	}
	
	
	@When("User Click Next button")
	public void nextbutton()
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CONTINUENEXTSTEP))).click();
	}
	
	@When("User Click Next Visitor button")
    public void nextvisitorbutton()
    {
        driver.findElement(By.name(propertyBag.getPageProperty(PARKING_CONTINUEVISITORNEXTSTEP))).click();
    }
	
	
	@Then("System should navigate to the thank you page")
	public void thankyou()
	{
		
		boolean present ;
		try {
			 present = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_THANKYOUPAGE))).isDisplayed();
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		Assert.assertTrue("user should naviagte to the Thank you page", present);
	}
		
	@Then("System should navigate to the next page")
    public void orderdetailspage()
    {
        boolean present ;
        try {
             present = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CHECKORDERPAGE))).isDisplayed();
        } catch (NoSuchElementException e) {
           present = false;
        }
        
        Assert.assertTrue("user should naviagte to the Thank you page", present);
    }
	
	
	@When("User Click Add Visitor permits button in permits details page")
	public void addvisitorpermit()
	{
		//PARKING_ADDVISITORPERMITS
		driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_ADDVISITORPERMITS))).click();
	}
	
	@Then("System should navigate to the visitor permits page")
	public void visitorpermits()
	{
		boolean present ;
		try {
			 driver.findElement(By.id(propertyBag.getPageProperty(PARKING_FREEVISITORPERMITS)));
		     present = true;
		   
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		Assert.assertTrue("user should naviagte Add visitor permits page", present);
	}
	
	@When("Users selects Free bundle : <freebundle>")
    public void selectbundle(@Named("freebundle") String freebundle )
    {
        this.freebundle = freebundle;
        
        
        driver.findElement(By.name(propertyBag.getPageProperty(PARKING_FREEVISITORPERMITS))).clear();
        driver.findElement(By.name(propertyBag.getPageProperty(PARKING_FREEVISITORPERMITS))).sendKeys(this.freebundle);
          
        
    }
	

	@When("Users enter paid permits : <paidpermits>")
    public void enterpaidpermit(@Named("paidpermits") String paidpermits)
    {
        this.paidpermits = paidpermits;
        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_PAIDPERMITS))).clear();
        driver.findElement(By.id(propertyBag.getPageProperty(PARKING_PAIDPERMITS))).sendKeys(this.paidpermits);
    }

	
	@When("User click on confirm and pay button")
    public void confirmAndPay()
    {
        //PARKING_ADDVISITORPERMITS
        driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_BUYPERMITS))).click();
    }
	
	
	@When("User click on confirm and pay button on renewals")
    public void confirmAndPayrenewals()
    {
        //PARKING_ADDVISITORPERMITS
        driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_CONFIRMANDPAYBUTTON))).click();
    }
	
	
	@When("User click on confirm and pay button on visitors")
    public void confirmAndPayButton()
    {
        //PARKING_ADDVISITORPERMITS
        driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_BUYPERMITSBUTTON))).click();
    }
	

    @When("User enter card number : <cardnumber>")
    public void enterCardNUmber(@Named("cardnumber") String cardnumber){
    this.cardnumber=  cardnumber;
    
    driver.findElement(By.id(propertyBag.getPageProperty(PAY_CARDNUMBER))).sendKeys(this.cardnumber);
    }
   
    @When("user re-enter <cardnumber1>")
	public void reEnterCardNumber1(@Named("cardnumber1") String cardnumber1){
		this.cardnumber1 =  cardnumber1;
		
		  driver.findElement(By.id(propertyBag.getPageProperty(PAY_CARDNUMBER))).clear(); 
		  driver.findElement(By.id(propertyBag.getPageProperty(PAY_CARDNUMBER))).sendKeys(this.cardnumber1);
		
		
	}
    
    
    @When("User enter <month> of expiry")
    public void enterMOnth(@Named("month") String month){
    this.month = month;
    driver.findElement(By.id(propertyBag.getPageProperty(PAY_MONTH))).sendKeys(this.month);
    	
    }
    
    @When("User enter <year> of expiry")
    public void enteryear(@Named("year") String year){
    this.year = year;
    driver.findElement(By.id(propertyBag.getPageProperty(PAY_YEAR))).sendKeys(this.year);
    	
    }
   
    @When("User enter security <code>")
    public void enterCode(@Named("code") String code){
    	
    	this.code = code;
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_SECURITYCODE))).sendKeys(this.code);
    	
    	
    }
   
    @When("User click Continue in Capita portal")
    public void clickContinueInCapita(){
    	
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_CONTNUE))).click();
    }
 
    
    @When("User Enter <cardholdername>")
    public void enterCardHolderName(@Named("cardholdername")String cardholdername){
    	this.cardholdername=cardholdername;
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_CARDHOLDERNAME))).sendKeys(this.cardholdername);
    	}
	
    @When("User click Next in Capita confirmation page")
    public void clickNextCapita(){
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_NEXTCAPITA))).click();
    }	
    
    @When("User click on cancel payment")
    public void cancelPayment(){
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_CANCELBUTTONCAPITA))).click();
    }	
	
    @When("User clicks on  Make payment in capita your payment page")
    public void makePaymentCapita(){
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_MAKEPAYMENT))).click();
    }
   

    
   @When("User enter securitypassword in capita: <securitypassword>")
   public void enterSecurityPassword(@Named("securitypassword") String securitypassword){
   this.securitypassword = securitypassword;
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//*[@tabindex='1']")).sendKeys("123");
   
   // form name 
   
   driver.findElement(By.xpath("//form[@name='passwordform']/*[@name='password']")).sendKeys("123");
	
	//*[contains(@id, 'password')]
   }


    @When("User click on continue button in capita security page")
    public void continueButtonCapitaSecurity(){
    	
    	driver.findElement(By.name(propertyBag.getPageProperty(PAY_CONTINUESECURITYPAGE))).click();
    	
    }
	
    @When("User click back button in Capita portal")
    public void backButtonCapita(){
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_BACKBUTTONCAPITA))).click();
    }
    
    @When("User Click on view order summary button")
    public void viewOrderSummaryButton(){
    	driver.findElement(By.name(propertyBag.getPageProperty(PARKING_VIEWORDERSUMMARY))).click();
    	
    }
    
    @When("User enter security <code2>")
    public void enterSecurityCode2(@Named("code2") String code2){
    	this.code2 = code2;
    	
    	driver.findElement(By.id(propertyBag.getPageProperty(PAY_SECURITYCODE))).sendKeys(this.code2);
    }
    
    @Then("User payment successfully processed by capita")
	public void paymentSuccessfullyProcessed(){
		
		String expectedmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_THANKSMSG))).getText();
	    String actualmsg = "Thanks, that's all ordered";
	    assertStringContains(actualmsg, expectedmsg);
	    
	    String orderNum = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_ORDERNUMBER))).getText();
	    System.out.println("Order number generated is -----> " + orderNum );
	    
	    
    }
    
    @Then("User payment process is declined")
    public void PymentPrcessIsDcelined(){

    	String actualMsg = driver.findElement(By.id(propertyBag.getPageProperty(PAY_DECLINEMSG))).getText();
    	
    	String expectedMsg = "Card declined";
    	assertStringContains(actualMsg, expectedMsg);
    	
    }

    @Then("verify extra surcharge is applied for the credit card")
    public void extraSurchargeApplied(){
    	
    	String cost = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_COST))).getText();
    	String cost1[] = cost.split("£");
    	float i  = Float.parseFloat(cost1[1]);
    	
    	String surcharge = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_SURCHARGE))).getText();
    	String surcharge1[] = surcharge.split("£");
    	float j = Float.parseFloat(surcharge1[1]);
    	
    	Float k= i+j;
    	String n = String.valueOf("£" + k);
    	String totalCost = driver.findElement(By.className(propertyBag.getPageProperty(PAY_TOTALAMOUNT))).getText();
    	
    	assertStringContains(n, totalCost);
    	
    		
    	
    }
   
    @Then("system should display <cost> of single vehicle permit")
    public void systemShouldDisplayCost(@Named("cost") String permitCost)
    {
        String cost = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_PERMITCOST))).getText();
         assertStringContains(cost,permitCost); 
    }
    
    @Then("system should display <cost> of two vehicle permits")
    public void shouldDisplayTwoVehiclePermits(@Named("cost") String permitCost){
    	
    	String cost = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_PERMITCOST))).getText();
        assertStringContains(cost,permitCost); 
    	
    }
    
    @Then("system should display <cost> of three vehicle permits")
    public void shouldDisplayThreeVehiclePermits(@Named("cost") String permitCost){
    	
    	String cost = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_PERMITCOST))).getText();
    	assertStringContains(cost,permitCost); 
    	
    }
    
    @When("User clicks on Get parking permits button on multizone page")
    public void parkingPermitsButtonMultizone(){
    	
    	driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_GETPARKINGPERMITS1))).click();
    }
    
    @When("User Clicks on Clifton Village link")
    public void cliftonVillageLink(){
    	
    	driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_CLIFTONLINK))).click();
    	
    }
    
    @When("user clicks in resident permit header")
    public void clickonheader()
    {
    	
    }
    
    @When("User selects 3month duration")
    public void monthDuration(){
    	
    	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_THREEMONTH))).click();
    	
    }
    
    @When("User selects 3month duration of second permit")
    public void secondPermitThreeMonth(){
    	
    	driver.findElement(By.id(propertyBag.getPageProperty(PARKING_THREEMONTHSCEONDPERMIT))).click();
    }
    
    // common for parking permits and renew functions
    
    @Then("System should display error message : <errorMessage>")
	public void displayerrormessage(){
		this.errorMessage = errorMessage;
		String actualmsg  = driver.findElement(By.partialLinkText(propertyBag.getPageProperty(PARKING_INVALIDADDRESSERRORMSG))).getText();
		
		 assertStringContains(actualmsg, this.errorMessage);  		
	}
    
   
    
     
   
	@Then("System should display out of zone error message")
	public void displayOutOfZoneError(){
		
		String actualMsg= driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_OUTOFZONEERRORMSG ))).getText(); 
		String expectedMsg = "Please check you have entered the correct address.";
		assertStringContains(actualMsg, expectedMsg);
	}
    
    /// Renewals reusable steps
    @When("user clicks on Renew parking permits button")
    public void clickrenewparkingpermit()
    {
    	System.out.println("-->cliking on the renew parking permits");
    	driver.findElement(By.partialLinkText(propertyBag.getPageProperty(RENEWALS_RENEWPARKINGPERMIT))).click();
    	
    	//remove it after the application fow is fixed 
    	
    	//driver.get(propertyBag.getConfigProperty(RENEWALS_PAGE));
    }
    
    @When("user enters 1st permit number : <firstpermitnumber>")
    public void enterFirstpermitnumber(@Named ("firstpermitnumber") String firstpermitnumber)
    {
    	this.firstpermitnumber = firstpermitnumber;
    	driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_FIRSTPERMITNUMBER))).sendKeys(this.firstpermitnumber);
    }
    
    @When("user enters 2nd permit number : <secondpermitnumber>")
    public void enterSecondpermitnumber(@Named ("secondpermitnumber") String secondpermitnumber)
    {
    	this.secondpermitnumber = secondpermitnumber;
    	driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_SECONDPERMITNUMBER))).sendKeys(this.secondpermitnumber);
    }
    
    @When("user enter 3rd permit number : <thirdpermitnumber>")
    public void enterThirdpermitnumber(@Named ("thirdpermitnumber") String thirdpermitnumber)
    {
    	this.thirdpermitnumber = thirdpermitnumber;
    	driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_THIRDPERMITNUMBER))).sendKeys(this.thirdpermitnumber);
    }
    
    @When("user clicks on next button of renewals")
    public void clickNextRenewals()
    {
    	Select archiveList =  new Select(driver.findElement(By.id(propertyBag.getPageProperty(PARKING_SELECTADDRESS))));
    	selectedValue  = archiveList.getFirstSelectedOption().getText();
    	driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_NEXT))).click();
       
    }
    
    @When("user clicks on next button of renewals in the permits details page")
    public void clickNextbuttonRenewals()
    {
    	driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_NEXT))).click();
       
    }
    
    
    @Then("system should navigate to the check order page")
    public void verifycheckorderpage()
    {
    	Boolean val = driver.findElements(By.xpath(propertyBag.getPageProperty(RENEWALS_CHECKORDERTITLE))).size() > 0;
		Assert.assertTrue("System should navigate to the check order page" , val);
    }
    
    @When("user enters email address")
    public void enteremail(@Named ("emailaddress") String emailaddress)
    {
    	this.emailaddress = emailaddress;
    	driver.findElement(By.id(propertyBag.getPageProperty(RENEWALS_EMAIL))).clear();
    	driver.findElement(By.id(propertyBag.getPageProperty(RENEWALS_EMAIL))).sendKeys(this.emailaddress);
    }
    
    
    @Then("the payment process should be abandoned")
    public void paymentProcessAbandoned(){
    String expectedMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_ABANDONMESSAGE))).getText();
    String actualMsg = "We couldn't take your payment, so we cannot order your permits just now.";
    assertStringContains(actualMsg, expectedMsg );
   
    //Assert.assertEquals(actualMsg, expectedMsg);
    //   System.out.println("*******" +  expectedMsg + "*********");	
    }
    
    @Then("capita payment process should fail displaying: <capitaerrormessage>")
    public void capitaPaymentProcess(@Named("capitaerrormessage") String capitaerrormessage ){
    	this.capitaerrormessage = capitaerrormessage;
    	
    	String actualmsg = driver.findElement(By.id("scp_cardPage_cardNumber_error")).getText();
    	assertStringContains(actualmsg, this.capitaerrormessage);
    }
    
    @Then("User payment process should be cancelled")
    public void paymentProcessShouldCancelled(){
    	
    	
    	String actualMsg = driver.findElement(By.xpath(propertyBag.getPageProperty(PAY_ABANDONMESSAGE))).getText();
    	String expectedMsg ="We couldn't take your payment, so we cannot order your permits just now.";
    	assertStringContains(actualMsg, expectedMsg);
    }
    
    

	@Then("capita gateway should display error message")
	public void capitaGatewayDiplayErrorMsg(){
		
	String actualmsg = driver.findElement(By.id(propertyBag.getPageProperty(PAY_CAPITAERRORMSG))).getText();	
	String expectedmsg = "Card number not correct";
	assertStringContains(actualmsg, expectedmsg);
	
	}
	
	
	@When("User Click on view order summary button in renewals page")
    public void viewOrderSummaryButtoninrenewalspage(){
    	driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_VIEWORDERSUMMARY))).click();
    	
    }
	
	
	@Then("system should display the link for apply for new permits")		
	public void checkLinkfour()
	{
		boolean present ;
		try {
			 driver.findElement(By.xpath(propertyBag.getPageProperty(RENEWALS_APPLYFORNEWPERMIT_4)));
		     present = true;
		   
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		Assert.assertTrue("apply for new permits", present);
	}
	
	
	@When("user enters date of birth for the first vehicals")
	public void keeper1DOB(@Named ("keeper1_DOB") String keeper1_DOB)
	{
		this.keeper1_DOB = keeper1_DOB;
		driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_KEEPER_DOB_0))).sendKeys(this.keeper1_DOB);
	}
   
	
	@When("user enters date of birth for the second vehicals")
	public void keeper2DOB(@Named ("keeper2_DOB") String keeper2_DOB)
	{
		this.keeper2_DOB = keeper2_DOB;
		driver.findElement(By.name(propertyBag.getPageProperty(RENEWALS_KEEPER_DOB_1))).sendKeys(this.keeper2_DOB);
	}
	   
    
}
