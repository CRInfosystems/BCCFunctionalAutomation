package com.bcc.complaints.makecomplaints;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class StatutoryComplaintsSomeoneelseWithaddressViaAddressScenarios extends StoryTestBase{
	
	private final String DATA_FILE = "STATUTORY_COMPLAINTS_SOMEONEELSE_WITHADDRESS_VIA_ADDRESS";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new StatutoryComplaintsSomeoneelseWithaddressViaAddress())
					.createCandidateSteps();
		
	}

}