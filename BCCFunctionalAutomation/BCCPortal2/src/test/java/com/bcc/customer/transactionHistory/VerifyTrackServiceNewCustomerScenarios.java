package com.bcc.customer.transactionHistory;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class VerifyTrackServiceNewCustomerScenarios extends StoryTestBase {

	private final String DATA_FILE = "VIEW_TRANSACTION_NEWCUSTOMER_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new VerifyTrackServiceNewCustomer())
					.createCandidateSteps();
		
	}
}
