package com.bcc.customer.suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import com.bcc.customer.profile.ChangeIncorrectEmailScenarios;
import com.bcc.customer.profile.IncorrectCurrentPwdScenarios;
import com.bcc.customer.profile.InvalidMobileMsgScenarios;
import com.bcc.customer.profile.InvalidPhoneNumberMsgScenarios;
import com.bcc.customer.profile.NewCustomerPhoneDetailsScenarios;
import com.bcc.customer.profile.PasswordMismatchScenarios;
import com.bcc.customer.profile.UpdateAddressScenarios;
import com.bcc.customer.profile.UpdateAddressToSameAddressScenarios;
import com.bcc.customer.profile.UpdateContactDetailsCustomerScenarios;
import com.bcc.customer.profile.VerifyChangeEmailAddressScenarios;
import com.bcc.customer.profile.VerifyChangePasswordScenarios;
import com.bcc.customer.signInOut.ForgotPasswordIncorectEmail;
import com.bcc.customer.signInOut.ForgotPasswordInvalidEmailScenarios;
import com.bcc.customer.signInOut.ForgotPasswordScenarios;
import com.bcc.customer.signInOut.SignInScenarios;
import com.bcc.customer.signInOut.SignOutScenarios;
import com.bcc.customer.signInOut.VerifyResetLinkScenarios;
import com.bcc.customer.transactionHistory.VerifyTrackServiceNewCustomerScenarios;
import com.bcc.waste.onb.loggedin.VerifyTrackServiceOrderNewBinScenarios;
import com.bcc.waste.onb.loggedin.VerifyTrackServiceSortedListScenarios;
import com.bcc.waste.onb.loggedin.VerifyUpdatedAddressinWastePageScenarios;



@RunWith(Suite.class)
@SuiteClasses({  ChangeIncorrectEmailScenarios.class , IncorrectCurrentPwdScenarios.class , 
	             InvalidMobileMsgScenarios.class , InvalidPhoneNumberMsgScenarios.class , NewCustomerPhoneDetailsScenarios.class , PasswordMismatchScenarios.class ,
	             UpdateAddressScenarios.class , UpdateAddressToSameAddressScenarios.class , UpdateContactDetailsCustomerScenarios.class , VerifyChangeEmailAddressScenarios.class , 
	             VerifyChangePasswordScenarios.class , VerifyUpdatedAddressinWastePageScenarios.class , ForgotPasswordIncorectEmail.class , ForgotPasswordInvalidEmailScenarios.class , ForgotPasswordScenarios.class , SignInScenarios.class , SignOutScenarios.class , VerifyResetLinkScenarios.class , 
	             VerifyTrackServiceNewCustomerScenarios.class , VerifyTrackServiceOrderNewBinScenarios.class , VerifyTrackServiceSortedListScenarios.class })
public class CustomerTestSuite {

}
