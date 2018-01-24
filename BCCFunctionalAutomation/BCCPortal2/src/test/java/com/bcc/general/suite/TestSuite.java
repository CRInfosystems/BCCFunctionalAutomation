package com.bcc.general.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bcc.parking.parkingpermit.ParkingPermitCarDetailsScenarios;
import com.bcc.parking.parkingpermit.ParkingPermitVerifyRegNoScenarios;




@RunWith(Suite.class)
@SuiteClasses({ ParkingPermitCarDetailsScenarios.class,  ParkingPermitVerifyRegNoScenarios.class})
public class TestSuite {

}
