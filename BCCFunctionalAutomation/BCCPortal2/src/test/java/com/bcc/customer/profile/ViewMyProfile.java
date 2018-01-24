package com.bcc.customer.profile;


import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 25/02/2014
 * Description  : This class enter user emailid and password , click on your account menu , and 
 * verified user can navigate to the view profile page
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */

public class ViewMyProfile extends CustomerStorySteps {

	public ViewMyProfile() {
	}

	@Then("system displays account profile")
	public void systemDisplays() throws InterruptedException {

		// wait for the object
		pause();

		String actualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(YOURACCOUNT_MESSAGE))).getText();
		String expectedmsg = "Your details";
		assertStringEquals(actualmsg, expectedmsg);

		
	}

}
