package com.bcc.parking.parkingpermit;


import java.util.Iterator;
import java.util.List;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bcc.parking.ParkingStorySteps;

public class VerifyRemovelinkYourVehicle extends ParkingStorySteps{
	
	public VerifyRemovelinkYourVehicle()
	{
		
	}
	
	
	public int noRemoveVehiclelinks()
	{
		
	    int nooflinks ;
	    
	    // By.xpath("//form[@class='form js--validate']/div[2]/div/div/h2/button")
	    //List<WebElement> allRemovelinksfirstvehicle = driver.findElements(By.xpath("//form[@class='form js--validate']/div[2]/div/div/h2/button"));
	    List<WebElement> allRemovelinksfirstvehicle = driver.findElements(By.name(propertyBag.getPageProperty(PARKING_REMOVEFIRSTVEHICLELINK)));
		int nooflinksfirst = allRemovelinksfirstvehicle.size();
		List<WebElement> allRemovelinkssecondvehicle = driver.findElements(By.name(propertyBag.getPageProperty(PARKING_REMOVESECONDVEHICLELINK)));
		int nooflinkssecond = allRemovelinkssecondvehicle.size();
		nooflinks = nooflinksfirst + nooflinkssecond;
		return nooflinks;
	}
	
	
	@Then("remove link should present in both the vehicals")
	public void checkNoofLinksfortwovehucalsbeforeclickonremove()
	{
		int links = noRemoveVehiclelinks();
		
		Assert.assertEquals(2 , links);
	}
	
	@Then("System should navigate to the Check permit details")
	public void checkpermitpage()
	{
		
		WebElement element = driver.findElement(By.xpath(propertyBag.getPageProperty(PARKING_CHECKPERMITSDETAILPAGE)));
		System.out.println(element.isDisplayed());
		
		//Assert.assertTrue("system should be in check permtis details page",element.isDisplayed());
	}
	
	@When("User clicks on remove vehical link of the first vehical")
	public void removeVehicalLink()
	{
		
		driver.findElement(By.name("_eventId_removeVehicle1")).click();
	}
	
		
	@Then("remove link should not present on the first vehical details")
	public void checkNoofLinksfortwovehucalsafterclickonremove()
	{
		int links = noRemoveVehiclelinks();
		
		
		Assert.assertEquals(0 , links);
	}

}
