package com.bcc.foi.makefoirequest;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;


public class LoggoutMakeFoiRequestEmailScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "MAKE_FOI_REQUEST_EMAIL_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new LoggoutMakeFoiRequestEmail())
					.createCandidateSteps();
		
	}

}
