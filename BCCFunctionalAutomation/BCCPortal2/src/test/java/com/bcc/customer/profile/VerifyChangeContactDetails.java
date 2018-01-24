package com.bcc.customer.profile;


import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 25/02/2014
 * Description  : This class enter user emailid and password , click on your account menu , and 
 * navigate to the view profile page and verifies user can navigate to the change change contact details page
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */


public class VerifyChangeContactDetails extends CustomerStorySteps {
	
	public VerifyChangeContactDetails() {
	}
	
		
	@Then ("system should navigate to change phone deails page")
	public void verifyEmailAddressPage() throws InterruptedException
	{
		
		pause();
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(UPDATEPHONE_TITLE))).getText();
		String expectedmsg = "Change phone numbers";
		assertStringEquals(actualmsg, expectedmsg);
		
		}
	
	
}

