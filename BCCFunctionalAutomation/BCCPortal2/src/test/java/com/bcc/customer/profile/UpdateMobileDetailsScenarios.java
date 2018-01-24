package com.bcc.customer.profile;
import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class UpdateMobileDetailsScenarios extends StoryTestBase{

	private final String DATA_FILE = "EXISTING_CUSTOMER_MOBILE_DETAILS_DATA_FILE ";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new UpdateMobileDetails())
					.createCandidateSteps();
		
	}
}
