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
 * enters  current pwd and enter 2 new password that are mismatch and verify the message for incorrect current password
 * History      : script has been refactored as per the framework - nagajyostna - 03/03/2014
 */


public class PasswordMismatch  extends CustomerStorySteps {
	
	@When ("user enter current password : <password>")
	public void entercurrentpassword(@Named("password") String password )
	{
		this.password = password;
		driver.findElement(By.id(propertyBag.getPageProperty(CURRENT_PASSWORD))).sendKeys(this.password);
	}
	
	@When ("user enter new password : <newpassword>")
	public void enternewpassword(@Named("newpassword") String newpassword )
	{
		this.newpassword = newpassword;
		driver.findElement(By.id(propertyBag.getPageProperty(NEW_PASSWORD))).sendKeys(this.newpassword);
	}
	
	@When ("user enter type incorrect password again : <incorrectpassword>")
	public void entertypenewpassword(@Named("incorrectpassword") String incorrectpassword )
	{
		this.incorrectpassword = incorrectpassword;
		driver.findElement(By.id(propertyBag.getPageProperty(CONFIRM_PASSWORD))).sendKeys(this.incorrectpassword);
	}
	
	@When ("user click on save changes button")
	public void SaveChangesButton() throws InterruptedException
	{
		driver.findElement(By.name(propertyBag.getPageProperty(SAVE_CHANGES))).click();
		pause();
	}
	
	@Then ("system displays error message Passwords - don't match")
	public void verifyMessage()
	{
		// add code for verify message once the development is done
		
		List<WebElement> allElements = driver.findElements(By.xpath(propertyBag.getPageProperty(ERRORMESSAGE_PWD_MISMATCH))); 
		String actualmsg = null;
		for (WebElement element: allElements) {
		      actualmsg = element.getText();
		}
		
		String expectedmsg = "Passwords don't match";
		System.out.print(actualmsg);
		assertStringContains(actualmsg, expectedmsg);
			
		
	}
	
	
	
}