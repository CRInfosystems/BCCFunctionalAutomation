package com.bcc.customer.profile;


import java.util.List;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 25/02/2014
 * Description  : This class enter user emailid and password , click on your account menu , click on change password link and
 * enters incorrect current pwd and new password and verify the message for incorrect current password
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */

public class IncorrectCurrentPwd  extends CustomerStorySteps {
	
	public IncorrectCurrentPwd()
	{
		
	}
	
	
	@When ("user enter incorrect current password : <incorrectpassword>")
	public void entercurrentpassword(@Named("incorrectpassword") String incorrectpassword)
	{
		this.incorrectpassword = incorrectpassword;
		driver.findElement(By.id(propertyBag.getPageProperty(CURRENT_PASSWORD))).sendKeys(this.incorrectpassword);
	}
	
	
	@Then ("system displays an error in your existing password")
	public void verifyMessage()
	{
		// add code for verify message once the development is done
		
		List<WebElement> allElements = driver.findElements(By.xpath(propertyBag.getPageProperty(ERRORMESSAGE_EXISTING_PWD))); 
		String actualmsg = null;
		for (WebElement element: allElements) {
		      actualmsg = element.getText();
		}
		
		String expectedmsg = "There is an error in your current password.";
		assertStringEquals(actualmsg, expectedmsg);
				
	}
	
	
}
	
	
		
