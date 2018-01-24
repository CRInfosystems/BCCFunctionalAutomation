package com.bcc.customer.registration;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class RegisterCustomerAccountScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "CREATE_ACCOUNTS_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new RegisterCustomerAccount())
					.createCandidateSteps();
	}
	
}