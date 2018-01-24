package uk.gov.bristol.registrations.births.steps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.AssertionFailedError;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

import uk.gov.bristol.registrations.RegistrationsConstants;
import uk.gov.bristol.registrations.StepsContext;
import uk.gov.bristol.registrations.births.pages.interactions.AboutYourBabyPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.BabyBornOutsideBristolCityPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.BabyBornOutsideEnglandOrWalesPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseARegisterOfficePageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.CommonPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFatherMarriageStatusPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFatherNotMarriedPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFemaleMarriageStatusPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFemaleNotMarriedPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ParenthoodAgreementPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ThanksThatsBookedPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhereWasYourBabyBornPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhoseNameOnTheRegisterPageInteractions;

public class BirthRegistrationsThenSteps extends BirthRegistrationsCommonSteps {

	@Then("an error message, prompting the user to enter the mother's first name should be displayed")
	public void thenAnErrorMessagePromptingTheUserToEnterTheMothersFirstNameShouldBeDisplayed() {
		Assert.assertTrue(AboutYourBabyPageInteractions.isMothersFirstNameErrorMsgDisplayed());
	}

	@Then("an error message, prompting the user to enter the mother's last name should be displayed")
	public void thenAnErrorMessagePromptingTheUserToEnterTheMothersLastNameShouldBeDisplayed() {
		Assert.assertTrue(AboutYourBabyPageInteractions.isMothersLastNameErrorMsgDisplayed());
	}

	@Then("an error message, prompting the user to confirm the number of babies should not be displayed")
	public void thenAnErrorMessagePromptingTheUserToConfirmTheNumberOfBabiesShouldNotBeDisplayed() {
		
		try{
			
			if(AboutYourBabyPageInteractions.isBabiesQtyErrorMsgDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("Number of babies error message should not be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}
	}

	@Then("an error message, prompting the user to confirm the number of babies should be displayed")
	public void thenAnErrorMessagePromptingTheUserToConfirmTheNumberOfBabiesShouldBeDisplayed() {
		Assert.assertTrue(AboutYourBabyPageInteractions.isBabiesQtyErrorMsgDisplayed());
	}

	@Then("I am shown an error message stating <error type>")
	public void thenIAmShownAnErrorMessageStatingerrorType(@Named("error type") String errorType) {
		if(errorType.equalsIgnoreCase("not valid")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getInvalidDOBErrorMsg().contains("please enter a valid date of birth"));
		}else if(errorType.equalsIgnoreCase("in the future")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getInvalidDOBErrorMsg().contains("is in the future"));
		}else if(errorType.equalsIgnoreCase("> 56 days in the past")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getInvalidDOBErrorMsg().contains("The date you've entered is too long ago"));
		}
	}

	@Then("an error message, prompting the user to provide a date of birth should be displayed")
	public void thenAnErrorMessagePromptingTheUserToProvideADateOfBirthShouldBeDisplayed(){
		Assert.assertTrue(AboutYourBabyPageInteractions.isInvalidDOBErrorMsgDisplayed());
	}

	@Then("an error message, prompting the user to provide a valid birth date should not be displayed")
	public void thenAnErrorMessagePromptingTheUserToProvideAValidDateOfBirthShouldNotBeDisplayed(){
	
		try{
			
			if(AboutYourBabyPageInteractions.isInvalidDOBErrorMsgDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("Date of birth error message should not be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}
	}

	@Then("I am shown an <error message>")
	public void thenIAmShownAnerrorMessage(@Named("error message") String errorMessage){
		
		if(errorMessage.equalsIgnoreCase("You must enter a first name")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getMotherFirstNameErrorMsgText().contains("please enter the mother's first name"));
		}else if(errorMessage.equalsIgnoreCase("You must enter a last name")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getMotherLastNameErrorMsgText().contains("please enter the mother's last name"));
		}else if(errorMessage.equalsIgnoreCase("First name should only include the letters A to Z")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getMotherFirstNameErrorMsgText().contains("the mother's first name can only include letters"));
		}else if(errorMessage.equalsIgnoreCase("Last name should only include the letters A to Z")){
			Assert.assertTrue(AboutYourBabyPageInteractions.getMotherLastNameErrorMsgText().contains("the mother's first name can only include letters"));
		}
	}

	@Then("I should progress to the 'Who can register' page")
	public void thenIShouldProgressToTheWhoCanRegisterPage(){
		WhoseNameOnTheRegisterPageInteractions.isDisplayedCheck();
	}

	@Then("I'm taken to the 'Where the baby was born' page")
	public void thenImTakenToTheWhereTheBabyWasBornPage(){
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isDisplayedCheck()); 
	}

	@Then("the postcode field is displayed")
	public void thenThePostcodeFieldIsDisplayed(){
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isPostcodeDisplayed());
	}

	@Then("a drop-down list of addresses are displayed which contains <address>")
	public void thenADropdownListOfAddressesAreDisplayedWhichContainsaddress(@Named("address") String address){
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isAddressFullDisplayed());
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.containsAddress(address));
	}

	@Then("I'm taken to the 'About the baby' page")
	public void thenImTakenToTheAboutTheBabyPage(){
		  AboutYourBabyPageInteractions.isDisplayedCheck();
		  Assert.assertEquals("About your baby", AboutYourBabyPageInteractions.getTitle());
	}

	@Then("I'm taken to the 'Baby born outside Bristol City' page")
	public void thenImTakenToTheBabyBornOutsideBristolCityPage(){
		 BabyBornOutsideBristolCityPageInteractions.isDisplayedCheck();
		 Assert.assertEquals("Baby born outside Bristol City", BabyBornOutsideBristolCityPageInteractions.getTitle());
	}

	@Then("I'm taken to the 'Baby born outside England or Wales' page")
	public void thenImTakenToTheBabyBornOutsideEnglandOrWalesPage(){
		 BabyBornOutsideEnglandOrWalesPageInteractions.isDisplayedCheck();
		 Assert.assertEquals("Baby born outside England or Wales", BabyBornOutsideEnglandOrWalesPageInteractions.getTitle());
	}

	@Then("I click the 'next' button")
	public void thenIClickThenextButton(){
		CommonPageInteractions.clickNextBtn();
	}

	@Then("an alert is displayed advising that the father will need to attend the appointment")
	public void thenAnAlertIsDisplayedAdvisingThatTheFatherWillNeedToAttendTheAppointment(){
		Assert.assertTrue(MotherAndFatherNotMarriedPageInteractions.isAdvisePanelDisplayed()); 
	}

	@Then("an error message is displayed")
	public void thenAnErrorMessageIsDisplayed(){
		Assert.assertTrue(CommonPageInteractions.isErrorMsgDisplayed());
	}

	@Then("I am taken to the 'mother and father are not married' page")
	public void thenIAmTakenToThemotherAndFatherAreNotMarriedPage(){
		MotherAndFatherNotMarriedPageInteractions.isDisplayedCheck();
	}

	@Then("I am taken to the 'mother and father marriage status' page")
	public void thenIAmTakenToThemotherAndFatherMarriageStatusPage(){
		MotherAndFatherMarriageStatusPageInteractions.isDisplayedCheck();
	}

	@Then("no error messages are displayed")
	public void thenNoErrorMessagesAreDisplayed(){
		
		try{
			
			if(MotherAndFatherMarriageStatusPageInteractions.isErrorMsgDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("Mother and father marriage status unselected error message should not be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}
	}

	@Then("no mother and father marriage status options have been selected")
	public void thenNoMotherAndFatherMarriageStatusOptionsHaveBeenSelected(){
		 Assert.assertFalse(MotherAndFatherMarriageStatusPageInteractions.isYesRadioSelected());
		 Assert.assertFalse(MotherAndFatherMarriageStatusPageInteractions.isNoRadioSelected());
	}

	@Then("the 'no' option is selected")
	public void thenThenoOptionIsSelected(){
		CommonPageInteractions.isNoRadioSelected();
	}

	@Then("I am taken to the 'mother and female parent not married' page")
	public void thenIAmTakenToThemotherAndFemaleNotMarriedPage() {
		MotherAndFemaleNotMarriedPageInteractions.isDisplayedCheck();
	}

	@Then("I remain on the 'mother and female parent not married' page")
	public void thenIRemainOnThemotherAndFemaleParentNotMarriedPage(){
		MotherAndFemaleNotMarriedPageInteractions.isDisplayedCheck();
	}

	@Then("I am taken to the 'mother and female are not married' page")
	public void thenIAmTakenToThemotherAndFemaleAreNotMarriedPage(){
		MotherAndFemaleNotMarriedPageInteractions.isDisplayedCheck();
	}

	@Then("I am taken to the 'mother and female marriage status' page")
	public void thenIAmTakenToThemotherAndFemaleMarriageStatusPage(){
		MotherAndFemaleMarriageStatusPageInteractions.isDisplayedCheck();
	}

	@Then("no mother and female marriage status options have been selected")
	public void thenNoMotherAndFemaleMarriageStatusOptionsHaveBeenSelected(){
		 Assert.assertFalse(MotherAndFemaleMarriageStatusPageInteractions.isYesRadioSelected());
		 Assert.assertFalse(MotherAndFemaleMarriageStatusPageInteractions.isNoRadioSelected());
	}

	@Then("a parenthood agreement required error message is displayed")
	public void thenAParenthoodAgreementRequiredErrorMessageIsDisplayed(){
		Assert.assertTrue(ParenthoodAgreementPageInteractions.isParenthoodAgreementRequiredErrorMsgDisplayed());
	}

	@Then("a warning is displayed advising that the second female parent will need to attend the appointment")
	public void thenAWarningIsDisplayedAdvisingThatTheSecondFemaleParentWillNeedToAttendTheAppointment(){
		Assert.assertTrue(ParenthoodAgreementPageInteractions.isWarningPanelDisplayed());
	}

	@Then("I am taken to 'parenthood agreement' page")
	public void thenIAmTakenToparenthoodAgreementPage() {
		ParenthoodAgreementPageInteractions.isDisplayedCheck();
	}

	@Then("no parenthood agreement required error message is displayed")
	public void thenNoParenthoodAgreementErrorMessagesAreDisplayed(){
		
		try{
			
			if(ParenthoodAgreementPageInteractions.isParenthoodAgreementRequiredErrorMsgDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("An error message has been found. No error messages should be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}
	}

	@Then("no warning is displayed")
	public void thenNoWarningIsDisplayed(){
		
		try{
			
			if(ParenthoodAgreementPageInteractions.isWarningPanelDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("An warning panel has been found. No warnings should be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}
	}

	@Then("I am taken to the the 'Where the baby was born' page")
	public void thenIAmTakenToTheWhereTheBabyWasBornPage() {
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isDisplayedCheck());
	}

	@Then("I'm taken to the 'About your baby' page")
	public void thenImTakenToTheaboutTheBabyPage() {
	  AboutYourBabyPageInteractions.isDisplayedCheck();
	  Assert.assertEquals("About your baby", AboutYourBabyPageInteractions.getTitle());
	}

	@Then("I see an error message saying 'please enter where the birth happened'")
	public void thenISeeAnErrorMessageSayingpleaseEnterWhereTheBirthHappened() {
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isValidationErrorDisplayed());
	}

	@Then("I am taken to the 'choose office' page")
	public void thenIAmTakenToTheChooseOfficePage(){
		ChooseARegisterOfficePageInteractions.isDisplayedCheck();
	}

	@Then("an error message displayed, asking for whose names should be on the register")
	public void thenAnErrorMessageDisplayedAskingForWhoseNamesShouldBeOnTheRegister(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isErrorMessageDisplayed());
	}

	@Then("I am taken to the 'whose name do you want to register' page")
	public void thenIAmTakenToThewhoseNameDoYouWantToRegisterPage(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isDisplayedCheck()); 
	}

	@Then("I remain on the 'whose name do you want to register' page")
	public void thenIRemainOnThewhoseNameDoYouWantToRegisterPage(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isDisplayedCheck()); 
	}

	@Then("the 'just mother' option is selected")
	public void thenThejustMotherOptionIsSelected(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isJustMotherRadioSelected());
	}

	@Then("the 'mother and father' option is selected")
	public void thenThemotherAndFatherOptionIsSelected(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isMotherAndFatherRadioSelected());
	}

	@Then("the 'mother and female' option is selected")
	public void thenThemotherAndFemaleOptionIsSelected(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isMotherAndFemaleRadioSelected());
	}

	@Then("no options have been selected")
	public void thenNoOptionsHaveBeenSelected() {
		Assert.assertFalse(CommonPageInteractions.isYesRadioSelected());
		Assert.assertFalse(CommonPageInteractions.isNoRadioSelected());
	}

	@Then("an error message is displayed asking you to confirm if there is a parenthood agreement")
	public void thenAnErrorMessageIsDisplayedAskingYouToConfirmIfThereIsAParenthoodAgreement() {
		Assert.assertTrue(ParenthoodAgreementPageInteractions.isParenthoodAgreementRequiredErrorMsgDisplayed());
	}
	
	@Then("I am on the 'mother and female marriage status' page")
	public void thenIAmOnThemotherAndFemaleMarriageStatusPage() {
		MotherAndFemaleMarriageStatusPageInteractions.isDisplayedCheck();
	}
	
	@Then("no error message is displayed")
	public void thenNoErrorMessageIsDisplayed() {
		
		try{
			
			if(CommonPageInteractions.isErrorMsgDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("An error message has been found. No error messages should be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}
	}
	
	@Then("I am taken to the 'parenthood agreement status' page")
	public void thenIAmTakenToTheparenthoodAgreementStatusPage() {
		Assert.assertTrue(ParenthoodAgreementPageInteractions.isDisplayedCheck());
	}
	
	@Then("the 'next' button is not displayed")
	public void thenThenextButtonIsNotDisplayed() {
		
		try{
			
			if(CommonPageInteractions.isNextButtonDisplayed()){
				
				// Fail the test. Error should not be displayed.
				new AssertionFailedError("A 'next' button has been found. The 'next' button should be displayed");
			}
			
		}catch(NoSuchElementException nsee){
			// No action required
		}

	}
	
	@Then("an alert is displayed advising that the second female parent will need to attend the appointment")
	public void thenAnAlertIsDisplayedAdvisingThatTheSecondFemaleParentWillNeedToAttendTheAppointment() {
		Assert.assertTrue(MotherAndFemaleNotMarriedPageInteractions.isAdvisePanelDisplayed());
	}

	@Then("the appointment slot I have chosen is displayed")
	public void thenAppointmentSlotIHaveChosenIsDisplayed(){
		
		SimpleDateFormat bbFormat = new SimpleDateFormat(RegistrationsConstants.BOOKINGBUG_DATEFORMAT);
		SimpleDateFormat confFormat = new SimpleDateFormat(RegistrationsConstants.CONFIRMATION_DATEFORMAT);
		
		try {
			Date confDate = confFormat.parse(ThanksThatsBookedPageInteractions.getAppointmentDate());
			Date bbDate = bbFormat.parse(StepsContext.INSTANCE.get("appointmentDate").toString());
			Assert.assertTrue(confDate.equals(bbDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Then("I <email_address_display_status> see confirmation of the email address I have provided")
	public void thenIemail_address_display_statusSeeConfirmationOfTheEmailAddressIHaveProvided(@Named("email_address_display_status") String displayStatus) {
		if(displayStatus.equalsIgnoreCase("do")){
			Assert.assertTrue(ThanksThatsBookedPageInteractions.isEmailAddressDisplayed());
		}else if(displayStatus.equalsIgnoreCase("do not")){
			Assert.assertFalse(ThanksThatsBookedPageInteractions.isEmailAddressDisplayed());
		}
	}

	@Then("information about how to find <register_office> is displayed")
	public void thenInformationAboutHowToFindregister_officeIsDisplayed(@Named("register_office") String registerOffice){
		if(registerOffice.equalsIgnoreCase(RegistrationsConstants.CORN_ST)){
			Assert.assertTrue(ThanksThatsBookedPageInteractions.isCornStAddressDisplayed());
		}else if(registerOffice.equalsIgnoreCase(RegistrationsConstants.SOUTHMEAD)){
			Assert.assertTrue(ThanksThatsBookedPageInteractions.isSouthmeadAddressDisplayed());
		}
	}

	@Then("the declaration IAG is displayed")
	public void thenTheDeclarationIAGIsDisplayed() {
		Assert.assertTrue(ThanksThatsBookedPageInteractions.isDeclarationDisplayed());
	}

	@Then("the declaration IAG is not displayed")
	public void thenTheDeclarationIAGIsNotDisplayed() {
		Assert.assertFalse(ThanksThatsBookedPageInteractions.isDeclarationDisplayed());
	}
}
