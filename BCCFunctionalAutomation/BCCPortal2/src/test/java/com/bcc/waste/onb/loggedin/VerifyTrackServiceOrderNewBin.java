package com.bcc.waste.onb.loggedin;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bcc.customer.CustomerStorySteps;



/* Created By   : Naga Jyostna
 * Created Date : 04/03/2014
 * Description  : This class enter user email id and password , click on your account menu , and 
 * verified Need to check transaction history row count and order new bin and check the transaction history count */


public class VerifyTrackServiceOrderNewBin extends CustomerStorySteps {

	
	List<String> listValues = new ArrayList<String> ();
	
	public VerifyTrackServiceOrderNewBin() {

	}
	
	
	
	
		
	@Then("verify transaction history rowcount is getting incremented")
	public void checkRowCount()
	{
		
		List<WebElement> allElements = driver.findElements(By.xpath(propertyBag.getPageProperty(TRANSACTIONTABLE)));
		
		for (WebElement element : allElements) {
			
			//System.out.println(element.getText());
			listValues.add(element.getText());

		}
	    neworderrowcount = allElements.size();
		boolean verify = false;
		if (intialrowcount <neworderrowcount )
		{
			verify = true;
			Assert.assertTrue("Transaction History Rowcount Incremented", verify);
		}
		else
		{
			Assert.assertFalse("Transaction History rowcount is not Incremented", verify);
		}
	}
	
	@Then("verify order number is getting displayed")
	public void checkorernumber()
	{
		
		boolean verifyval = false;
		
		System.out.println(neworderrowcount);
		
		for(int i = 0 ; i <neworderrowcount ; i++)
		{
			String stringval = (String) listValues.get(i);
			
			verifyval = stringContians(stringval , ordernumber);
			if (verifyval = true)
				break;
			
		}
		
		Assert.assertTrue("Reference Number should get Displayed", verifyval);
	}
	

		
}
