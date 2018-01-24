package com.bcc.customer.signInOut;

import java.util.NoSuchElementException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
 * Created Date : 04/03/2014
 * Description  : this class when user click on get new password enter  email address and click on save system should display the appropriate  message with the reset password link
 * when user clicks on reset password link system should able to naviagate to the reset password page 
 * 
 */

public class VerifyResetLink extends CustomerStorySteps {

	


	public String email;

	public VerifyResetLink() {

	}


	@When("user click on reset link")
	public void resetPasswordLink() {
		//driver.findElement(By.xpath(propertyBag.getPageProperty(RESTPASSWORDLINK))).click();
		driver.findElement(By.linkText(propertyBag.getPageProperty(RESTPASSWORDLINK))).click();
	}

	@Then("system should naviagte to the forgotpassword page")
	public void verifyForgotPassword() {
		boolean present;
		try {
			driver.findElement(By.id(propertyBag.getPageProperty(EMAIL)));
			present = true;
		} catch (NoSuchElementException e) {
			present = false;
		}

		Assert.assertTrue("User should navigate to the forgot password  page ",
				present);

	}

}