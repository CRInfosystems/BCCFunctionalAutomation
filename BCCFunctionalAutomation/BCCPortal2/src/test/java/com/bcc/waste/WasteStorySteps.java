package com.bcc.waste;

import java.util.List;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WasteStorySteps extends WasteStoryBase {
	
	//The following 2 methods do not form part of the re-usable code components, as they reference
    //the sign in link that is embedded in the waste page, as opposed to signing in via the homepage 
	public void userSignIn(String email, String password) throws InterruptedException {
		driver.findElement(By.partialLinkText(propertyBag.getPageProperty(SIGNLINK))).click();
		// wait

		pause();

		driver.findElement(By.id(propertyBag.getPageProperty(USER_NAME))).sendKeys(
				email);
		driver.findElement(By.id(propertyBag.getPageProperty(PASSWORD))).sendKeys(
				password);
		driver.findElement(By.name(propertyBag.getPageProperty(SIGN_IN))).click();

		// wait to navigate to the page
		pause();
	}
	
	@When("user clicks on sign in link and enter user name : <email> and password : <password>")
	public void signin(@Named("email") String email , @Named("password") String password) throws InterruptedException {
		this.email = email;
		this.password = password;
		userSignIn(this.email, this.password);
		pause();
		
	}

	@When("user clicks on waste tab")
	public void clickwaste() throws InterruptedException {
		pause();
		driver.findElement(By.xpath(propertyBag.getPageProperty(WASTE_MENU))).click();
	}

	@When("user enter postcode details : <postcode>")
	public void enterPostCode(@Named("postcode") String postcode) {
		this.postcode = postcode;
		driver.findElement(By.name(propertyBag.getPageProperty(POSTCODE))).sendKeys(
				postcode);
	}

	@When("use clicks on lookup address button")
	public void clickLookupAddress() {
		driver.findElement(By.name(propertyBag.getPageProperty(LOOKUPADDRESS))).click();
	}

	@When("user select address : <lookupAddress> from the drop down")
	public void selectAddress(@Named("lookupAddress") String lookupAddress) {
		this.lookupAddress = lookupAddress;
		Select dropdown = new Select(driver.findElement(By
				.name(propertyBag.getPageProperty(SELECTADDRESS))));
		int index;
		try {
			index = Integer.parseInt(lookupAddress);
		} catch (NumberFormatException nfe) {
			index = Integer.parseInt(lookupAddress);
		}
		dropdown.selectByIndex(index);
	}

	@When("user click on next button")
	public void clickNext() {
		driver.findElement(By.name(propertyBag.getPageProperty(NEXT))).click();
	}

	@When("user click on Order New/Replacement Bin button")
	public void clickNewBin() {
		driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN))).click();
	}

	
	@When("user clicks on order now button")
	public void orderNow() throws InterruptedException {
		driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNOW))).click();
		// wait
		pause();

		driver.findElement(By.xpath(propertyBag.getPageProperty(NEXTCHOOSEYOURBIN)))
				.click();
		// wait
		pause();

	}
	
	
	@Then("user should able to enter delivery instructions : <deliverylocation>")
	public void enterDeliveryInstruction(@Named("deliverylocation") String deliverylocation) {
		
		this.deliverylocation = deliverylocation;

		boolean present = false;
		try {
			driver.findElement(By.id(propertyBag.getPageProperty(DETAILSDELIVERYLOCATION)));
			present = true;
		} catch (NoSuchElementException e) {
			present = false;
		}
		if (present) {

			driver.findElement(By.id(propertyBag.getPageProperty(DETAILSDELIVERYLOCATION)))
					.sendKeys(this.deliverylocation);
		}

		Assert.assertTrue(
				"user should able to enter the delivery location details",
				present);
		driver.findElement(By.id(propertyBag.getPageProperty(CONFIRMOFFSTREET))).click();

	}

	@When("user clicks on order")
	public void clickOrderBin() throws InterruptedException {

		driver.findElement(By.name(propertyBag.getPageProperty(ORDERITEMSBUTTON))).click();

		pause();

	}

	@Then("user should able to able navigate to order summary page")
	public void OrderSummarypage() {
		String actualmsg = driver.findElement(
				By.xpath(propertyBag.getPageProperty(ORDERSUMMARY))).getText();
		String expectedmsg = "Check and confirm your order";
		
		assertStringEquals(actualmsg, expectedmsg);
	}

	@When("user enter email id : <email> and clicks on place order")
	public void clickPlaceOrder(@Named("email") String email) throws InterruptedException {
		this.email = email;
		System.out.println(this.email);
		driver.findElement(By.id(propertyBag.getPageProperty(EMAIL))).sendKeys(this.email);
		driver.findElement(By.className(propertyBag.getPageProperty(PLACEORDER))).click();
		pause();
	}

	@Then("user should able to view a summary of their order before final confirmation and delivery address")
	public void verifyFInalConfirmPage() throws InterruptedException {
		// verify delivery address
		pause();
		String actualaddress = driver.findElement(By.xpath(propertyBag.getPageProperty(DELIVERYADDRESS))).getText();
		System.out.println(actualaddress);
		assertStringContains(actualaddress, expectedaddress);

		// verify your order
		boolean present;
		try {
			driver.findElement(By.className(propertyBag.getPageProperty(YOURORDERTABLE)));
			present = true;
		} catch (NoSuchElementException e) {
			present = false;
		}

		Assert.assertTrue("user should able view his order summary", present);

	}
	
	@When("clicks on place order")
	public void clickPlaceOrderloggedin() {
		driver.findElement(By.className(propertyBag.getPageProperty(PLACEORDER))).click();
	}
	
	public String getAddress(String ordertype) {
			
		if(ordertype.equalsIgnoreCase("loggedout"))
		  return ADDRESS;
		else
		  return ADDRESS_LOGGEDIN;
		
		
	}
	
	@When("user selects food caddy containers and quantity : <quantityofallbins> and type of order :<ordertype>")
	public void selectFoodCandyBins(@Named("quantityofallbins") String quantityofallbins ,@Named("ordertype") String ordertype ) throws InterruptedException {

		// get the number of fields sets in the table
		
		this.quantityofallbins = quantityofallbins;
		this.ordertype = ordertype;

		
		expectedaddress = driver.findElement(By.xpath(propertyBag.getPageProperty(getAddress(this.ordertype)))).getText();
		System.out.println(expectedaddress);

		List<WebElement> listFieldSet = driver.findElement(
				By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(
				By.tagName("fieldset"));
		int count = listFieldSet.size();
		// System.out.println(count);
		for (int i = 1; i <= count; i++) {

			pause();
			String nameofthebox = driver.findElement(
					By.xpath(String.format(propertyBag.getPageProperty(GET_BIN_NAME), i)))
					.getText();

			if (nameofthebox.equalsIgnoreCase(propertyBag.getPageProperty(BROWNFOODWASTEBIN_NAME))) {

				driver.findElement(
						By.xpath(String.format(
								propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i)))
						.click();
				Select dropdownReason = new Select(driver.findElement(By
						.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REASON))));
				dropdownReason.selectByValue("Damaged");

				Select dropdownQty = new Select(driver.findElement(By
						.id(propertyBag.getPageProperty(BROWNFOODWASTEBINQTY))));
				dropdownQty.selectByValue(this.quantityofallbins);

				driver.findElement(
						By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REMOVEOLD)))
						.click();

				break; // this breaks the for loop once the brown food waste
						// candy is selected

			}

		} // end of for loop

	}
	
	
	
	@When("user selects the bin and qunatity of bins : <quantityofallbins> and selects the check box remove old bin for each bin")
	public void selectBinsandselectcheckbox(@Named("quantityofallbins") String quantityofallbins) throws InterruptedException
	{
		
		// get the number of fields sets in the table
		
		this.quantityofallbins = quantityofallbins;
		
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
		//System.out.println(count);
		for(int i =1; i<= count ; i++)
		{		
			
			pause();
			
			//String test = "//*[@id='form-order-new-bin']/div/div[2]/fieldset[%s]/div/div[1]/a/span";
		    driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    
		  
		    boolean present = false;
		    boolean presentremovebin = false;
		    Select dropdownReason = null;
			Select dropdownQty = null;
			
		    switch(i)
		    {
		    case 1:
		    	
		       	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELIEBIN_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELIEBIN_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		// verify check box is present or not for removing old bin
		    		
		    		
		    		try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELEDBIN_REMOVEOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELEDBIN_REMOVEOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black Wheele Bin", presentremovebin);
		    		}
		    				    		    
		    	}
		    	break;
		    	
		    case 2:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLEBOXQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		
		    		
		    		// verify check box is present or not for removing old bins
		    		
		    		try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REMOVEOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REMOVEOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black recycling box", presentremovebin);
		    		} 
		    		    
		    	}
		    	
		    	break;
		    	
		    	
		    case 3:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDYQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		
		    		// verify check box is present or not for removing old bins
		    		
		    		
		    		 try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REMOVEOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REMOVEOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black recycling box", presentremovebin);
		    		}  
		    		    
		    	}
		    	
		    	break;
		    	
		    	
		    case 4:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBINQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		
		    		
		    		// verify user can select check box for remove old bin
		    		
		    		try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REMOVEOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REMOVEOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black recycling box", presentremovebin);
		    		}   
		    		    
		    	}
		    	
		    	break;
		    	
		    case 5:
		    	

		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOX_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOX_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOXQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		
		    		
		    		
		    		// verify user can select check box for remove old bin
		    		
		    		
		    		
		    	try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(GREENRECYCLINGBOX_REMOVEDOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(GREENRECYCLINGBOX_REMOVEDOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black recycling box", presentremovebin);
		    		}  
		    		    
		    	}
		    	
		    	break;
		    	
		    case 6:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNET_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNET_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNETQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		
		    		
		    		// verify user can select check box for remove old bin
		    		
		    		try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNET_REMOVEOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNET_REMOVEOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black recycling box", presentremovebin);
		    		} 
		    		    
		    	}
		    	
		    	break;
		    	
		    case 7:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLID_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLID_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLIDQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		
		    		
		    		
		    		// verify user can select check box for remove old bin
		    		
		    		try {
		    			driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLID_REMOVEOLD)));
		    			presentremovebin = true;
			    	} catch (NoSuchElementException e) {
			    		presentremovebin = false;
			    	}
		    		if(presentremovebin)
		    		{
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLID_REMOVEOLD))).click();
		    		Assert.assertTrue("User should able to select the remove old bin check box for Black recycling box", presentremovebin);
		    		} 
		    		    
		    	}
		    	
		    	
		    	break;
		    	
		    	
		    	
		    	
		    }
		      	
		   
		    
		}
		
		
		// SELECT THE CHECKBOX
		
		driver.findElement(By.id(propertyBag.getPageProperty(CONFIRMOFFSTREET))).click();
		
		// CLICK ON ORDER ITEMS BUTTON
		driver.findElement(By.name(propertyBag.getPageProperty(ORDERITEMSBUTTON))).click();
		
		// wait
		pause();
		
	}
	
	
	@Then("verify user cant select more than four bin for each type")
	public void VerifyQuantity() throws InterruptedException
	{
		
	
		
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
			
		Select dropdown = null;
		
		for(int i =2; i<= count ; i++)
		{		
			driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
			
		    // wait
		    
			pause();
		    
		    
		    boolean present = false;
		    int no_qty = 0;
		    switch( i)
		    {
		    case 2 : 
		    	
		    	
		    	try {
		    		dropdown =new Select (driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLEBOXQTY))));
		    		
		    	   present = true;
		    	  
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	
		    	if(present)
		    	{
		    		 List<WebElement> l = dropdown.getOptions();
		    		 no_qty  = l.size();
	    		   	Assert.assertTrue("BLACKRECYCLEBOXQTY is more than 4 :" +(no_qty-1), (no_qty-1) < 5);
		    	}
		    	
		    	break;
		    case 3 :
		    	
		    	no_qty = 0;    	 
		    	try {
		    		dropdown =new Select (driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDYQTY))));
		    		
		    	   present = true;
		    	  
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	
		    	// write assertion here
		    	if(present)
		    	{
		    		 List<WebElement> l = dropdown.getOptions();
		    		 no_qty = l.size();
		    		Assert.assertTrue("BROWNFOODWASTECADDYQTY is more than 4 : " + (no_qty-1) , (no_qty-1) < 5);
		    	}
		    	break;
		    	
		    case 4:
		    	
		    	no_qty = 0;
		    	
		    	try {
		    		dropdown =new Select (driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBINQTY))));
		    		
		    	   present = true;
		    	  
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	
		    	// write assertion here
		    	if(present)
		    	{
		    		 List<WebElement> l = dropdown.getOptions();
		    		 no_qty = l.size();
		    		Assert.assertTrue("BROWNFOODWASTEBINQTY is more than 4 :" + (no_qty-1), (no_qty-1) < 5);
		    	}
		    	
		    	break;
		    case 5 :
		    	
		    	no_qty = 0;
		    	
		    	try {
		    		dropdown =new Select (driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOXQTY))));
		    		
		    	   present = true;
		    	  
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	
		    	// write assertion here
		    	if(present)
		    	{
		    		 List<WebElement> l = dropdown.getOptions();
		    		 no_qty = l.size();
		    		Assert.assertTrue("GREENCYCLEBOXQTY is more than 4 :" + (no_qty-1), (no_qty-1) < 5);
		    	}
		    	break;
		    	
		    case 6:
		    	
		    	no_qty = 0;
		    	
		    	try {
		    		dropdown =new Select (driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNETQTY))));
		    		
		    	   present = true;
		    	  
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	
		    	// write assertion here
		    	if(present)
		    	{
		    		 List<WebElement> l = dropdown.getOptions();
		    		 no_qty = l.size();
		    		Assert.assertTrue("GREENBOXNETQTY is more than 4 :" + (no_qty-1), (no_qty -1) < 5);
		    	}
		    	
		    	break;
		    	
		    case 7:
		    	
		    	no_qty = 0;
		    	
		    	try {
		    		dropdown =new Select (driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLIDQTY))));
		    		
		    	   present = true;
		    	  
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	
		    	// write assertion here
		    	if(present)
		    	{
		    		 List<WebElement> l = dropdown.getOptions();
		    		 no_qty = l.size();
		    		Assert.assertTrue("BLACKBOXLIDQTY is more than 4 :" +(no_qty -1), (no_qty -1) < 5);
		    	}
		    	
		    	
		    	
		    	
		    	
		    }
		}
		
		
	}
	
	
	
	@When("user selects the bins with quantity  : <quantityofallbins>")
	public void selectBins(@Named("quantityofallbins") String quantityofallbins) throws InterruptedException
	{
		
		this.quantityofallbins = quantityofallbins;
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
		
		
		for(int i =1; i<= count ; i++)
		{		
			
			pause();
			driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    
		     // wait
			pause();
			
		    boolean present = false;
		    Select dropdownReason = null;
			Select dropdownQty = null;
		    switch(i)
		    {
		    case 1:
		    	
		       	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELIEBIN_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELIEBIN_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		    
		    	}
		    	break;
		    	
		    case 2:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLEBOXQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		    
		    	}
		    	
		    	break;
		    	
		    	
		    case 3:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDYQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		    
		    	}
		    	
		    	break;
		    	
		    	
		    case 4:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBIN_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTEBINQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		    
		    	}
		    	
		    	break;
		    	
		    case 5:
		    	

		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOX_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOX_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOXQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		    
		    	}
		    	
		    	break;
		    	
		    case 6:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNET_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNET_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENBOXNETQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		    
		    	}
		    	
		    	break;
		    	
		    case 7:
		    	
		    	try {
		    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLID_REASON)));
		    	   present = true;
		    	} catch (NoSuchElementException e) {
		    	   present = false;
		    	}
		    	if(present)
		    	{
		    		dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLID_REASON))));
		    		dropdownReason.selectByValue("Damaged");
		    		
		    		dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKBOXLIDQTY))));
		    		dropdownQty.selectByValue(this.quantityofallbins);
		    		    
		    	}
		    	
		    	
		    	break;
		    	
		    	
		    	
		    	
		    }
		      	
		   
		    
		}
		
		
		// SELECT THE CHECKBOX
		
		driver.findElement(By.id(propertyBag.getPageProperty(CONFIRMOFFSTREET))).click();
		
		// CLICK ON ORDER ITEMS BUTTON
		driver.findElement(By.name(propertyBag.getPageProperty(ORDERITEMSBUTTON))).click();
		
		// wait
		pause();
		
	}   
	
	
	
	@When("user selects new black bin with size :<blackbinsize> and provide reason as damaged and order type : <ordertype>")
	public void  selectBlackBins(@Named("blackbinsize") String blackbinsize ,@Named("ordertype") String ordertype ) throws InterruptedException
	{
		
		// get the number of fields sets in the table
		this.blackbinsize = blackbinsize;
		this.ordertype = ordertype;
		expectedaddress = driver.findElement(By.xpath(propertyBag.getPageProperty(getAddress(ordertype)))).getText();
		System.out.println(expectedaddress);
		
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
		System.out.println(count);
		for(int i = 1; i<= count ; i++)
		{		
			
			pause();
			String nameofthebox = driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(GET_BIN_NAME), i))).getText();
		    System.out.println(nameofthebox);													
		    
		    // added two recycling boxes
		    if(nameofthebox.equalsIgnoreCase(propertyBag.getPageProperty(BLACKWHEELEBIN_NAME)))
		    {
		    	
		    	driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    	Select dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELIEBIN_REASON))));
	    		dropdownReason.selectByValue("Damaged");
	    		
	    		Select dropdownsize = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELIBIN_SIZE))));
	    		dropdownsize.selectByValue(this.blackbinsize);
	    		
	    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKWHEELEDBIN_REMOVEOLD))).click();
	    		
	    		
	    		break;
	    		
		    	
		    }
		    	      	
		   
		    
		}  // end of for loop
		
		
	}
	
	
	
	@When("user selects food caddy containers with quantity : <quantityofallbins> and ordertype : <ordertype>")
	public void  selectfoodcanddyBins(@Named("quantityofallbins") String quantityofallbins ,@Named("ordertype") String ordertype) throws InterruptedException
	{
		
				
		this.quantityofallbins = quantityofallbins;
		this.ordertype = ordertype;
		expectedaddress = driver.findElement(By.xpath(propertyBag.getPageProperty(getAddress(ordertype)))).getText();
		System.out.println(expectedaddress);
		
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
		
		for(int i =1; i<= count ; i++)
		{		
			
			pause();
			String nameofthebox = driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(GET_BIN_NAME), i))).getText();
		    
		    if(nameofthebox.equalsIgnoreCase(propertyBag.getPageProperty(BROWNFOODWASTECADDY_NAME)))
		    {
		    	
		    	 driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    	Select dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REASON))));
	    		dropdownReason.selectByValue("Damaged");
	    		
	    		Select dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDYQTY))));
	    		dropdownQty.selectByValue(this.quantityofallbins);
	    		
	    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REMOVEOLD))).click();
	    		
	    		break;  // this breaks the for loop once the brown food waste candy is selected 
		    	
		    }
		    	
		  
		      	
		   
		    
		}  // end of for loop
		
		
	}
	
	
	@When("user selects new recycling boxes with quantity : <quantityofallbins> and ordertype : <ordertype>")
	public void  selectrecyclyingBins(@Named("quantityofallbins") String quantityofallbins ,@Named("ordertype") String ordertype) throws InterruptedException
	{
		
		// get the number of fields sets in the table
		this.quantityofallbins = quantityofallbins;
		this.ordertype = ordertype;
		
		expectedaddress = driver.findElement(By.xpath(propertyBag.getPageProperty(getAddress(ordertype)))).getText();
		System.out.println(expectedaddress);
		
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
		int countboxes = 0;
		//System.out.println(count);
		for(int i =1; i<= count ; i++)
		{		
			
			pause();
			String nameofthebox = driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(GET_BIN_NAME), i))).getText();
		    
		    
		    // added two recycling boxes
		    if(nameofthebox.equalsIgnoreCase(propertyBag.getPageProperty(BLACKRECYCLINGBOX_NAME)))
		    {
		    	
		    	driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    	Select dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REASON))));
	    		dropdownReason.selectByValue("Damaged");
	    		
	    		Select dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLEBOXQTY))));
	    		dropdownQty.selectByValue(this.quantityofallbins);
	    		
	    		driver.findElement(By.id(propertyBag.getPageProperty(BLACKRECYCLINGBOX_REMOVEOLD))).click();
	    		countboxes++;
	    		
		    	
		    }
		    
		    if(nameofthebox.equalsIgnoreCase(propertyBag.getPageProperty(GREENRECYCLINGBOX_NAME)))
		    {
		    	driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    	Select dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOX_REASON))));
	    		dropdownReason.selectByValue("Damaged");
	    		
	    		Select dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(GREENCYCLEBOXQTY))));
	    		dropdownQty.selectByValue(this.quantityofallbins);
	    		
	    		driver.findElement(By.id(propertyBag.getPageProperty(GREENRECYCLINGBOX_REMOVEDOLD))).click();
	    		countboxes++;
		    }
		    
		    if(countboxes >= 2)
		    	break;
		    	
		  
		      	
		   
		    
		}  // end of for loop
		
		
	}
	

}
