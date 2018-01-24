package com.bcc.complaints.makecomplaints;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class ComplaintsMyselfSignedinScenarios extends StoryTestBase {

	
	private final String DATA_FILE = "COMPLAINTS_MYSELF_SIGNEDIN";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new ComplaintsMyselfSignedin())
					.createCandidateSteps();
		
	}

}
