package com.bcc.customer.profile;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bcc.customer.CustomerStorySteps;



/* Created By   : Naga Jyostna
* Created Date : 07/02/2014
* Description  : This class Verify customer can able to give his same address as the new address
* Story id      : 1534 - Change Phone Number
*/

public class UpdateAddressToSameAddress extends CustomerStorySteps {
	
	//private static final String INCORRECTEMAILERRORMESSAGE = "FORGORTPASSWORD.INCORRECTEMAILERRORMESSAGE";

	//private String email;

	public UpdateAddressToSameAddress() {
	}
	
	@Then("get currect address")
	public void getCurrectAddress() throws InterruptedException
	{
		
		
		currectAddress = driver.findElement(By.xpath(propertyBag.getPageProperty(CURRENTADDRESS))).getText();
		
		System.out.println( currectAddress);
		
		currectAddress = currectAddress.trim();
		
		currectAddress =  currectAddress.replace("Change" , "");
		
		currectAddress =  currectAddress.trim();
		
		System.out.println( currectAddress);
			
		currentpostcode = getStringVal(currectAddress , "Bristol" , 1);
		currentpostcode = currentpostcode.trim();
		System.out.println("postcode");
		System.out.println(currentpostcode);
		
		
		
	}
	
	@When("user enter the address and click on save address")
	public void entersAddressDetails() throws InterruptedException
	{
		driver.findElement(By.name(propertyBag.getPageProperty(POSTCODE))).clear();
		driver.findElement(By.name(propertyBag.getPageProperty(POSTCODE))).sendKeys(currentpostcode);
		//System.out.println("---------");
	    System.out.println(currentpostcode);
		driver.findElement(By.name(propertyBag.getPageProperty(LOOKUPADDRESS))).click();
		
		
		// commenting 
		Select dropdown = new Select(driver.findElement(By.id(propertyBag.getPageProperty(ADDRESS_UPRN))));
		
		// select current address
		dropdown.selectByVisibleText(currectAddress);
	    		
		pause();
		// get the changed address
		WebElement option = dropdown.getFirstSelectedOption();
		
		expectedAddress = option.getText();
		
		
		
		// verify the selected address is the same address
		
		assertStringEquals(currectAddress ,expectedAddress );
				
		driver.findElement(By.name(propertyBag.getPageProperty(SAVEADDRESS))).click();
		pause();
		
	}

}
