package com.bcc.waste.onb.loggedin;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.bcc.general.StoryTestBase;

public class OrderFoodCandyBinsLoggedinScenarios extends StoryTestBase{

	private final String DATA_FILE = "ORDER_FOOD_CANDY_LOGGEDIN_DATA_FILE";

	@Override
	public String getDataFileName() {
		return DATA_FILE;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
			return new InstanceStepsFactory(configuration(), new OrderFoodCandyBinsLoggedin())
					.createCandidateSteps();
		
	}
}
