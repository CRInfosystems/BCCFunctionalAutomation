package com.bcc.customer.payment;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import com.bcc.general.StoryTestBase;


public class PayConfirmationSuccessScenarios extends StoryTestBase{

	private final String DATA_FILE = "PAY_CONFIRMATION_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new PayConfirmationSuccess())
					.createCandidateSteps();
		
	}
}