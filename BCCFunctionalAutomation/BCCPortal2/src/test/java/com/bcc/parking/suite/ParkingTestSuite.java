package com.bcc.parking.suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bcc.parking.parkingpermit.ParkingPermitDurationCombinationScenarios;
import com.bcc.parking.parkingpermit.ParkingPermitOnlyThreeMonthScenarios;
import com.bcc.parking.parkingpermit.ParkingPermitOnlyTwelveMonthScenarios;
import com.bcc.parking.parkingpermit.ParkingPermitThreeMonthPriceScenarios;



@RunWith(Suite.class)
@SuiteClasses({ ParkingPermitOnlyThreeMonthScenarios.class, ParkingPermitOnlyTwelveMonthScenarios.class, ParkingPermitDurationCombinationScenarios.class, 
	ParkingPermitThreeMonthPriceScenarios.class})
public class ParkingTestSuite {

}
