package com.bcc.waste.onb.loggedin;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bcc.customer.CustomerStorySteps;

/* Created By   : Naga Jyostna
* Created Date : 07/02/2014
* Description  : This class Validate the address displayed in Waste ordering process
* Story id      : 1537 - Change Address
*/

public class VerifyUpdatedAddressinWastePage extends CustomerStorySteps {
	
	//private static final String INCORRECTEMAILERRORMESSAGE = "FORGORTPASSWORD.INCORRECTEMAILERRORMESSAGE";

	//private String email;

	public VerifyUpdatedAddressinWastePage() {
	}
	
		
	@When("user click on home menu")
	public void clickHome() throws InterruptedException
	{
		openHomePage();
	}
	
	@When("user naviagte to the waste page")
	public void WastePage() throws InterruptedException
	{
		
		driver.findElement(By.xpath(propertyBag.getPageProperty(WASTE_MENU))).click();
		pause();
		driver.findElement(By.xpath(propertyBag.getPageProperty(ORDERNEWREPLACEMENT_BUTTON))).click();
		pause();
	}
	
	@Then("verify address in the waste page")
	public void verifyAddressinWastepage()
	{
		//String actualmsg = driver.findElement(By.xpath("//*[@id='p_p_id_bccwasteformsportlet_WAR_bccportalapps101BUILDSNAPSHOT_']/div/div/div[2]/div/div[2]/p[2]")).getText();
		WebElement  Elementactualmsg = driver.findElement(By.xpath(propertyBag.getPageProperty(ADDRESS)));
		String actualmsg = Elementactualmsg.getText();
		System.out.println(actualmsg);
		assertStringContains(expectedAddress , actualmsg);
	}
	
	
}
