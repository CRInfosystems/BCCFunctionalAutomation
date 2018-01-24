package com.bcc.customer.signInOut;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class ForgotPasswordScenarios extends StoryTestBase {

	private final String DATA_FILE = "FORGOT_PASSWORD_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new ForgotPassword())
					.createCandidateSteps();
		
	}
}
