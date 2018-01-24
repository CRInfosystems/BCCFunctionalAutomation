package com.bcc.waste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bcc.waste.onb.loggedin.BrownFoodWasteBinLoggedinScenarios;
import com.bcc.waste.onb.loggedin.HaveOldRemovedLoggedinScenarios;
import com.bcc.waste.onb.loggedin.MoreThanFourBinsLoggedinScenarios;
import com.bcc.waste.onb.loggedin.OrderBlackBinLoggedinScenarios;
import com.bcc.waste.onb.loggedin.OrderFoodCandyBinsLoggedinScenarios;
import com.bcc.waste.onb.loggedin.OrderNewRecyclingBoxesLoggedinScenarios;
import com.bcc.waste.onb.loggedin.verifyOrderBinsLoggedinScenarios;
import com.bcc.waste.onb.loggedout.BrownFoodWasteBinScenarios;
import com.bcc.waste.onb.loggedout.HaveOldRemovedScenarios;
import com.bcc.waste.onb.loggedout.MoreThanFourBinsScenarios;
import com.bcc.waste.onb.loggedout.OrderBinsScenarios;
import com.bcc.waste.onb.loggedout.OrderBlackBinScenarios;
import com.bcc.waste.onb.loggedout.OrderFoodCandyBinsScenarios;
import com.bcc.waste.onb.loggedout.OrderNewRecyclingBoxesScenarios;


@RunWith(Suite.class)
@SuiteClasses({  BrownFoodWasteBinLoggedinScenarios.class , HaveOldRemovedLoggedinScenarios.class , MoreThanFourBinsLoggedinScenarios.class , OrderBlackBinLoggedinScenarios.class , OrderFoodCandyBinsLoggedinScenarios.class, 
	             OrderNewRecyclingBoxesLoggedinScenarios.class ,verifyOrderBinsLoggedinScenarios.class , BrownFoodWasteBinScenarios.class , HaveOldRemovedScenarios.class , MoreThanFourBinsScenarios.class , OrderBinsScenarios.class , OrderBlackBinScenarios.class , OrderFoodCandyBinsScenarios.class , OrderNewRecyclingBoxesScenarios.class })
public class WasteTestSuite {

}