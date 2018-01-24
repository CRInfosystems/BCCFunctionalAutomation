package com.bcc.customer.payment;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import com.bcc.general.StoryTestBase;


public class PayApplySametimeScenarios extends StoryTestBase{

	private final String DATA_FILE = "PAY_APPLY_SAME_TIME_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new PayApplySametime())
					.createCandidateSteps();
	}
}