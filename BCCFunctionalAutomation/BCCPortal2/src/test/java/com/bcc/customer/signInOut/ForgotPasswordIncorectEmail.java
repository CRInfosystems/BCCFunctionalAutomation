package com.bcc.customer.signInOut;

import java.io.IOException;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 04/03/2014
 * Description  : this class when user click on get new password enter incorrect email address and click on save system should display the appropriate error message 
 * 
 */

public class ForgotPasswordIncorectEmail extends CustomerStorySteps {
	
	

	public ForgotPasswordIncorectEmail() {
	}

	
	@When("user enters incorrect email address used for your account <email>")
	public void enteremailaddress(@Named("email") String email) {
		this.email = email;
		driver.findElement(By.id(propertyBag.getPageProperty(EMAIL))).sendKeys(this.email);
	}

	
	@Then("verify system should display the error message This email does not exist.")
	public void verifyresetmessage() throws IOException {
		WebElement element = driver.findElement(By.xpath(propertyBag.getPageProperty(INCORRECTEMAILERRORMESSAGE)));
		String actualmsg = element.getText();
		String expectedmsg = "The email address does not exist.";
		assertStringEquals(actualmsg, expectedmsg);
	}

}
