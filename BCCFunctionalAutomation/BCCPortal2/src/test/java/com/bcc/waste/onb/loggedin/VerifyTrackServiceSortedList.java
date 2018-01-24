package com.bcc.waste.onb.loggedin;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;

import com.bcc.customer.CustomerStorySteps;


public class VerifyTrackServiceSortedList extends CustomerStorySteps {

	List<String> listValues = new ArrayList<String> ();
	
	
	public VerifyTrackServiceSortedList() {

	}
	
		
	@Then("verify list is sorted by date created")
	public void verifySortedList()
	{
		boolean verifyval = false;
		
		System.out.println(neworderrowcount);
		
		
		if (neworderrowcount > 1)
		{
		
			String stringval = (String) listValues.get(1);
			
			verifyval = stringContians(stringval , ordernumber);
			Assert.assertTrue("Reference Number should get Displayed", verifyval);
				
			
		}else
		{
			Assert.assertFalse("There are no transaction details for the user :" , false);
		}
		
		
	}
		
	
	}
	
	


