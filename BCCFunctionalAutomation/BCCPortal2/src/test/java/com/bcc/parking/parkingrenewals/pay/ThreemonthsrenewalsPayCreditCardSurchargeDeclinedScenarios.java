package com.bcc.parking.parkingrenewals.pay;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class ThreemonthsrenewalsPayCreditCardSurchargeDeclinedScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "VALID_THREEMONTHS_PERMITNUMEBRS_CHECKADDRESS";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new ThreemonthsrenewalsPayCreditCardSurchargeDeclined())
					.createCandidateSteps();
		
	}

}