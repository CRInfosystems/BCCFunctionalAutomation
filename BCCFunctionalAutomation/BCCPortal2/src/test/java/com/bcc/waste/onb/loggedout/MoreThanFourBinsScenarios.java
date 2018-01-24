package com.bcc.waste.onb.loggedout;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class MoreThanFourBinsScenarios extends StoryTestBase{

	private final String DATA_FILE = "MORE_THAN_FOUR_BIN_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new MoreThanFourBins())
					.createCandidateSteps();
		
	}
}
