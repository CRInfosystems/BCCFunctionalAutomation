package com.bcc.customer.profile;
import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class UpdateLandlineDetailsScenarios extends StoryTestBase{

	private final String DATA_FILE = "EXISTING_CUSTOMER_LANDLINE_DETAILS_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new UpdateLandlineDetails())
					.createCandidateSteps();
		
	}
}
