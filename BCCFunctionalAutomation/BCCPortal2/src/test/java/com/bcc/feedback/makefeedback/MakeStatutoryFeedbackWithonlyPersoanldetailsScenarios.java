package com.bcc.feedback.makefeedback;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class MakeStatutoryFeedbackWithonlyPersoanldetailsScenarios extends StoryTestBase {

	private final String DATA_FILE = "MAKE_FEEDBACK_WITHPERSONALDETAILS";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new MakeStatutoryFeedbackWithonlyPersoanldetails())
					.createCandidateSteps();
		
	}

}
