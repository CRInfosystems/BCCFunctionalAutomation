package com.bcc.parking.parkingrenewals;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class RenewalsSignedoutScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "THREEMONTHS_PERMITNUMEBRS_CHECKPRICE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new RenewalsSignedout())
					.createCandidateSteps();
		
	}

}
