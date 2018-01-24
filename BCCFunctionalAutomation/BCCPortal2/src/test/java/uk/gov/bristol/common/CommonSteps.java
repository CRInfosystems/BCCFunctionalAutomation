package uk.gov.bristol.common;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.ScenarioType;

public class CommonSteps {

	@AfterScenario(uponOutcome=AfterScenario.Outcome.FAILURE, uponType=ScenarioType.EXAMPLE)
    public void afterFailedScenarioExample() {
		// captureScreen();
    }
	
	@AfterScenario(uponOutcome=AfterScenario.Outcome.FAILURE, uponType=ScenarioType.NORMAL)
    public void afterFailedScenario() {
        // captureScreen();
    }
}
