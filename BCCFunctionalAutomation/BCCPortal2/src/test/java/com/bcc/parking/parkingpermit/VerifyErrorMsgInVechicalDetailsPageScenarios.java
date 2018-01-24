package com.bcc.parking.parkingpermit;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class VerifyErrorMsgInVechicalDetailsPageScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "INVALID_VEHICAL_DETAILS";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new VerifyErrorMsgInVechicalDetailsPage())
					.createCandidateSteps();
		}

}
