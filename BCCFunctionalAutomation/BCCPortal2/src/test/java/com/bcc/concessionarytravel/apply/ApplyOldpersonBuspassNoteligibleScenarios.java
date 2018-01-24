package com.bcc.concessionarytravel.apply;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class ApplyOldpersonBuspassNoteligibleScenarios extends StoryTestBase {

	private final String DATA_FILE = "CT_OLDPERSON_BUSPASS_NOTELIGIBLE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new ApplyOldpersonBuspassNoteligible())
					.createCandidateSteps();
		
	}

}

