package com.bcc.customer.profile;


import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 25/02/2014
 * Description  : This class enter user emailid and password , click on your account menu , and 
 * navigate to the view profile page and verifies user can navigate to the change change address details page
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */

public class VerifyChangeAddress extends CustomerStorySteps {
	
	public VerifyChangeAddress()
	{
		
	}


	@Then("system should navigate to change address page")
	public void verifyAddressPage() {
		// String actualmsg =
		// driver.findElement(By.xpath("//*[@id='p_p_id_bcccustomerportlet_WAR_bccwasteportlet_']/div/div/p")).getText();
		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(UPDATEADDRESS_TITLE))).getText();
		String expectedmsg = "Change home address";
		
		assertStringEquals(actualmsg, expectedmsg);
		
	}
	

	

}
