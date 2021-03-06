package com.bcc.customer.profile;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class PasswordMismatchScenarios extends StoryTestBase{

	private final String DATA_FILE = "PASSWORD_MISMATCH_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new PasswordMismatch())
					.createCandidateSteps();
		
	}
}
