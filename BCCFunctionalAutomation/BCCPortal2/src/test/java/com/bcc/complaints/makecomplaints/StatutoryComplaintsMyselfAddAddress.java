package com.bcc.complaints.makecomplaints;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import com.bcc.complaints.ComplaintsStorySteps;

public class StatutoryComplaintsMyselfAddAddress extends ComplaintsStorySteps {

	
	public StatutoryComplaintsMyselfAddAddress()
	{
		
	}
	
	@When("user checks add address details : <addaddress>")
	public void addAddress(@Named("addaddress") String addaddress)
	{
		this.addaddress = addaddress;
		if (this.addaddress.equalsIgnoreCase("Y"))
		  driver.findElement(By.id(propertyBag.getPageProperty(COMPLAINTS_ADDMYADDRESS))).click();	
	}
	
	//COMPLAINTS_ADDMYADDRESS

}