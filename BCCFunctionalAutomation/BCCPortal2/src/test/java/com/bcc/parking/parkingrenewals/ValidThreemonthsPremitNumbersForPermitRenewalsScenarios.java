package com.bcc.parking.parkingrenewals;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class ValidThreemonthsPremitNumbersForPermitRenewalsScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "VALID_THREEMONTHS_PERMITNUMEBRS";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new ValidThreemonthsPremitNumbersForPermitRenewals())
					.createCandidateSteps();
		
	}

}
