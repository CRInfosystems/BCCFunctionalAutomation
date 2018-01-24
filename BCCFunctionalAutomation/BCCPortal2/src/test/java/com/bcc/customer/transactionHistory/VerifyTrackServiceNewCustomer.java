package com.bcc.customer.transactionHistory;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import com.bcc.customer.CustomerStorySteps;


/* Created By   : Naga Jyostna
 * Created Date : 25/02/2014
 * Description  : This class enter user emailid and password , and check user can sign out from the application
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */

public class VerifyTrackServiceNewCustomer extends CustomerStorySteps {
	
	
	
	
	public VerifyTrackServiceNewCustomer() {

	}
	
	
	@Then("verify transaction history is displying message You have no closed or pending waste jobs.")
	public void verifyTransactionDetails() {
		
		// should display message "You have no closed or pending waste jobs."
		
		String actualmsg = driver.findElement(By.id(propertyBag.getPageProperty(NEWCUSTOMERMESSAGE))).getText();
		String expectedmsg = "If you need to check your order now, the details you need should be in the confirmation email we sent. The email will also give a date when we will reply or send your order";
		assertStringContains(actualmsg ,expectedmsg);
		
	}
	

	
	
	
	
}

