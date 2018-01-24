package com.bcc.customer.signInOut;


import org.jbehave.core.annotations.Then;

import com.bcc.customer.CustomerStorySteps;

public class SignIn extends CustomerStorySteps {
	
	
	
	public SignIn() {
	}
	
	
	@Then("system logs user in and displays information that user is logged in")
	public void Systemdisplays() throws InterruptedException {
		//ToDo: implement Assert
		
		// signout
		clickSignOut();
	}
}