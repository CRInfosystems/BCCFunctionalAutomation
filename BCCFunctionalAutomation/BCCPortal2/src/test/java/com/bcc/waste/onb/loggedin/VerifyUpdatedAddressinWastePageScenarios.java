package com.bcc.waste.onb.loggedin;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class VerifyUpdatedAddressinWastePageScenarios extends StoryTestBase{

	private final String DATA_FILE = "UPDATE_ADDRESS_DETAILS_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new VerifyUpdatedAddressinWastePage())
					.createCandidateSteps();
		
	}
}
