package com.bcc.foi.makefoirequest;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;


public class EditDetailsOfMakeFoiRequestScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "MAKE_FOI_REQUEST_EDITPAGE_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new EditDetailsOfMakeFoiRequest())
					.createCandidateSteps();
		
	}

}
