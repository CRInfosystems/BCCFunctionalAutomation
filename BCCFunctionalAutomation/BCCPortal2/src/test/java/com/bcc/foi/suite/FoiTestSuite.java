package com.bcc.foi.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bcc.foi.makefoirequest.EditDetailsOfMakeFoiRequestScenarios;
import com.bcc.foi.makefoirequest.LoggoutMakeFoiRequestEmailScenarios;
import com.bcc.foi.makefoirequest.LoggoutMakeFoiRequestPostalAddressScenarios;
import com.bcc.foi.makefoirequest.LoginMakeFoiRequestScenarios_2055;



@RunWith(Suite.class)
@SuiteClasses({ EditDetailsOfMakeFoiRequestScenarios.class , LoggoutMakeFoiRequestEmailScenarios.class , LoggoutMakeFoiRequestPostalAddressScenarios.class , LoginMakeFoiRequestScenarios_2055.class})
public class FoiTestSuite {

}
