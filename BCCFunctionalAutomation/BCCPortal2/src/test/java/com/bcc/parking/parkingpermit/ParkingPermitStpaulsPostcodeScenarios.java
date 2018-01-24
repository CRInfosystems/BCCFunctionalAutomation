package com.bcc.parking.parkingpermit;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class ParkingPermitStpaulsPostcodeScenarios extends StoryTestBase {
	
	private final String DATA_FILE = "PARKING_PERMIT_STPAULS";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new ParkingPermitStpaulsPostcode())
					.createCandidateSteps();
		
	}

}
