package com.bcc.customer.signInOut;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.customer.CustomerStorySteps;


/* Created By   : Naga Jyostna
 * Created Date : 25/02/2014
 * Description  : This class enter user emailid and password , and check user can sign out from the application
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */

public class SignOut extends CustomerStorySteps {
	
	public SignOut() {

	}
	
	
	@When ("user selects sign-out to log out of his/her account")
	public void logout() throws InterruptedException
	{
		// signout
		clickSignOut();
	}
	
	
	@Then ("system returns them to the home page (default Liferay functionality)")
	public void verifyHomepage()
	{
		//verify home page once code is done
		
		boolean present;
		try {
			driver.findElement(By.id(propertyBag.getPageProperty(CREATE_ACCOUNT_MENU)));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		Assert.assertTrue("User should navigate to the home page ", present);
				
	}
	
	
	
	
}