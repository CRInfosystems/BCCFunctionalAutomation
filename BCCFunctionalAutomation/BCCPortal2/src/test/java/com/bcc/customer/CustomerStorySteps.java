package com.bcc.customer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public abstract class CustomerStorySteps extends CustomerStoryBase {
	
	public void openAccountsPage() throws InterruptedException {
		driver.findElement(By.id(propertyBag.getPageProperty(MY_ACCOUNT_MENU))).click();
		pause();
	}
	
	public  boolean stringContians(String fullString , String strcontains)
	{
		
		boolean stringContains = fullString.toLowerCase().contains(strcontains.toLowerCase());
		return stringContains;
	}
	
	public static String getStringVal(String fullstring , String seperator , int i)
	{
		String[] parts = fullstring.split(seperator);
		//referenceList.add(parts[1].substring(0, 7));
		
		return parts[i];
		
	}
	
	// is date valid
		public static boolean isDateValid(String date) 
		{
			
			final String DATE_FORMAT = "dd MMM yyyy"; 
		        try {
		            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
		            df.setLenient(false);
		            df.parse(date);
		            return true;
		        } catch (ParseException e) {
		            return false;
		        }
		}
	
	
	

	@When("user click on get a new password")
	public void clickonnewpassword() throws InterruptedException {
		driver.findElement(By.linkText(propertyBag.getPageProperty(GETNEWPASSWORDLINK)))
				.click();
		pause();
	}
	
	@When("user clicks on send reset email")
	public void clickResetEmail() {
		driver.findElement(By.name(propertyBag.getPageProperty(SENDRESETBUTTON))).click();
	}	
	
	@When("enter email address used for your account <email>")
	public void enterEmailAddress(@Named("email") String email) {
		this.email = email;
		// driver.findElement(By.id("ff-text-validate-4")).sendKeys(this.email);
		driver.findElement(By.id(propertyBag.getPageProperty(EMAIL))).sendKeys(this.email);
	}
	
	@Then("verify system message for reset password")
	public void verifyResetMessage() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath(propertyBag.getPageProperty(VERIFYMESSAGE)));
		String actualmsg = element.getText();

		String expectedmsg = "Click the link in the email to confirm your password reset.";
		
		assertStringEquals(actualmsg, expectedmsg);
		pause();

	}
	
	
	@When("user clicks Your Account")
	public void userClicks() throws InterruptedException {
		openAccountsPage();
	}
	
	@When("user clicks Create an account")
	public void userClicksCreateAccount() throws InterruptedException {
		driver.findElement(By.id(propertyBag.getPageProperty(CREATE_ACCOUNT_MENU))).click();
		pause();
	}

	@When("user clicks on Orders and Payments Tab")
	public void ClickActivity() throws InterruptedException {
		driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERSANDPAYMENTSTAB))).click();
		pause();
	}
	
	@Then("verify transaction history rowcount")
	public void verifyTransactionDetails() throws ParseException {
		
		List<WebElement> allElements = driver.findElements(By.xpath(propertyBag.getPageProperty(TRANSACTIONTABLE)));
		
				
		intialrowcount = allElements.size();
		
		
	}
	
	

	@When("user naviagte to waste page")
	public void clickYourAccount() throws InterruptedException
	{
		
		driver.findElement(By.xpath(propertyBag.getPageProperty(HOME_MENU))).click();
		pause();
		
		driver.findElement(By.xpath(propertyBag.getPageProperty(WASTE_MENU))).click();
		pause();
	
		driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWREPLACEMENT_BUTTON))).click();
		pause();
	}
	
	
	@When("user order bins")
	public void orderNewbins() throws InterruptedException
	{
							
		List <WebElement> listFieldSet = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWBIN_FIELDSETS))).findElements(By.tagName("fieldset")); 
		int count = listFieldSet.size();
		System.out.println(count);
		for(int i =1; i<= count ; i++)
		{		
			
			pause();
			String nameofthebox = driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(GET_BIN_NAME), i))).getText();
			System.out.println(i);
			System.out.println(nameofthebox);
		    
		    if(nameofthebox.equalsIgnoreCase(propertyBag.getPageProperty(BROWNFOODWASTECADDY_NAME)))
		    {
		    	
		    	 driver.findElement(By.xpath(String.format(propertyBag.getPageProperty(SELECTBIN_CHECKBOX), i))).click();
		    	Select dropdownReason = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REASON))));
	    		dropdownReason.selectByValue("Damaged");
	    		
	    		Select dropdownQty = new Select(driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDYQTY))));
	    		dropdownQty.selectByValue("2");
	    		
	    		driver.findElement(By.id(propertyBag.getPageProperty(BROWNFOODWASTECADDY_REMOVEOLD))).click();
	    		
	    		break;  // this breaks the for loop once the brown food waste candy is selected 
		    	
		    }
		    	
		   	
		   
		    
		}  // end of for loop
		   
			
		// SELECT THE CHECKBOX
		
		driver.findElement(By.id(propertyBag.getPageProperty(CONFIRMOFFSTREET))).click();
		
		// CLICK ON ORDER ITEMS BUTTON
		driver.findElement(By.name(propertyBag.getPageProperty(ORDERITEMSBUTTON))).click();
		
		// wait
		pause();
		
		// click on place order
		driver.findElement(By.className(propertyBag.getPageProperty(PLACEORDER))).click();
		pause();
	}
	
	
	@When("users gets order number and naviagte to the transaction history tab")
	public void getOrderNumber() throws InterruptedException
	{
		ordernumber = driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNUMBER))).getText();
		driver.findElement(By.id(propertyBag.getPageProperty(MY_ACCOUNT_MENU))).click();
		pause();
		pause();
		driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERSANDPAYMENTSTAB))).click();
		pause();
	}
	
	
	@When("user click on update address link")
	public void clickupdateaddress() throws InterruptedException {
		// driver.findElement(By.xpath("//*[@id='tab-profile']/div/div[4]/dl/dd/a")).click();
		// wait
		pause();

		driver.findElement(By.xpath(propertyBag.getPageProperty(CHANGEADDRESSLINK))).click();
		
	}
	
	@Then("system should navigate to the profile page")
	public void yourDetailsTab()
	{
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(YOURDETAILS_TAB))).getText();
		String expectedmsg = "Your details";
		
		assertStringEquals(actualmsg, expectedmsg);
		
		
	}
	
	@When("user enter the <postcode> , <lookupAddress> and click on save address")
	public void entersAddressDetails(@Named("postcode") String postcode , @Named("lookupAddress") String lookupAddress) throws InterruptedException
	{
		pause();
		this.postcode = postcode;
		this.lookupAddress = lookupAddress;
		driver.findElement(By.name(propertyBag.getPageProperty(POSTCODE))).clear();
		driver.findElement(By.name(propertyBag.getPageProperty(POSTCODE))).sendKeys(this.postcode);
		driver.findElement(By.name(propertyBag.getPageProperty(LOOKUPADDRESS))).click();
			
		Select dropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(ADDRESS_UPRN))));
		int index = Integer.parseInt(this.lookupAddress);
		dropdown.selectByIndex(index);
		
		// get the changed address
		WebElement option = dropdown.getFirstSelectedOption();
		
		expectedAddress = option.getText();
		
		System.out.println(expectedAddress);
		
						
		driver.findElement(By.name(propertyBag.getPageProperty(SAVEADDRESS))).click();
		pause();
		
	}
	
	@Then("system should display updated address details")
	public void updatedaddress()
	{
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(CURRENTADDRESS))).getText();
		
		System.out.println(actualmsg);
		
		 assertStringContains("Address :" + actualmsg ,"Address :" + expectedAddress );
		 
		 
		 
	}
	
	@When ("user click on update phone link")
	public void clickChangePhoneLink() throws InterruptedException {
		//wait
		pause();
		driver.findElement(By.xpath(propertyBag.getPageProperty(CHANGEPHONELINK))).click();
		pause();
		
	}
	
	@Then ("system should navigate to change phone details page")
	public void verifyEmailPhonePage() throws InterruptedException
	{
		//wait
		pause();
		
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(UPDATEPHONE_TITLE))).getText();
		String expectedmsg = "Change phone numbers";
		
		assertStringContains(expectedmsg , actualmsg);
			
	}
	
	@When("user click on change link of the password")
	public void clickChangePwdLink() {
		driver.findElement(By.xpath(propertyBag.getPageProperty(CHANGE_PWD_LINK))).click();
		// driver.findElement(By.xpath("//*[@id='tab-profile']/div/div[3]/dl/dd/a")).click();

	}
	
	@Then("user system should navigate to change password page")
	public void verifyPwdAddressPage() throws InterruptedException {
		pause();

		String actualmsg = driver.findElement(
				By.xpath(propertyBag.getPageProperty(CHANGEPWD_TITLE))).getText();
		String expectedmsg = "Change Password";
		assertStringEquals(actualmsg, expectedmsg);

	}
	
	
	@When ("user enter new password : <newpassword>")
	public void enternewpassword(@Named("newpassword") String newpassword )
	{
		this.newpassword = newpassword;
		driver.findElement(By.id(propertyBag.getPageProperty(NEW_PASSWORD))).sendKeys(this.newpassword);
	}
	
	@When ("user enter type password again : <newpassword>")
	public void entertypenewpassword(@Named("newpassword") String newpassword  )
	{
		this.newpassword = newpassword;
		driver.findElement(By.id(propertyBag.getPageProperty(CONFIRM_PASSWORD))).sendKeys(this.newpassword);
	}
	
	@When ("user click on save changes button")
	public void SaveChangesButton() throws InterruptedException
	{
		driver.findElement(By.name(propertyBag.getPageProperty(SAVE_CHANGES))).click();
		pause();
	}
	
	@When ("user click on change link of the email")
	public void clickChangeEmailLink() {
			
		driver.findElement(By.xpath(propertyBag.getPageProperty(CHANGE_EMAIL_LINK))).click();
			
	}
	
	@Then ("user system should navigate to change email address page")
	public void verifyEmailAddressPage() throws InterruptedException
	{
		
		pause();
			
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(CHANGEEMAIL_TITLE))).getText();
		String expectedmsg = "Change email address";
		assertStringEquals(actualmsg, expectedmsg);
				
	}

	@When("user enter new change email details : <newemail>")
	public void enternewemaildetails(@Named("newemail") String newemail)
	{
		this.newemail = newemail;
		driver.findElement(By.name(propertyBag.getPageProperty(NEWEMAIL))).sendKeys(this.newemail);
		driver.findElement(By.name(propertyBag.getPageProperty(CONFIRMEMAIL))).sendKeys(this.newemail);
	}
	
	@When ("user click on save changes button in the email page")
	public void SaveButton() throws InterruptedException
	{
		driver.findElement(By.xpath(propertyBag.getPageProperty(SAVE_CHANGES_EMAIL))).click();
		pause();
	}
	
	
	
	

}
