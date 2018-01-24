package uk.gov.bristol.registrations.births.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;

import uk.gov.bristol.registrations.RegistrationsConstants;
import uk.gov.bristol.registrations.births.pages.interactions.AboutYourBabyPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.BabyBornOutsideBristolCityPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.CommonPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFatherMarriageStatusPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFemaleMarriageStatusPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.RegisterABabyPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ThanksThatsBookedPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhereWasYourBabyBornPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhoseNameOnTheRegisterPageInteractions;

public class BirthRegistrationsGivenSteps extends BirthRegistrationsCommonSteps {

	@Given("that I am on the 'Where the baby was born' page")
	public void givenThatIAmOnTheWhereTheBabyWasBornPage() {
		WhereWasYourBabyBornPageInteractions.isDisplayedCheck();
	}

	@Given("that a Registration Customer is on the 'Book an appointment to register a birth' page")
	public void givenThatARegistrationCustomerIsOnTheBirthLandingPage() {
		RegisterABabyPageInteractions.loadPage();
		Assert.assertTrue(RegisterABabyPageInteractions.isDisplayedCheck());
	}
	
	@Given("that I am on the 'About your baby' page")
	public void givenThatIAmOnTheAboutYourBabyPage() {
		Assert.assertTrue(AboutYourBabyPageInteractions.isDisplayedCheck());
	}

	@Given("none of the baby number radio buttons have been selected")
	public void givenNoneOfTheBabyNumberRadioButtonsHaveBeenSelected() {
		Assert.assertFalse(AboutYourBabyPageInteractions.isOneBabyRadioSelected());
		Assert.assertFalse(AboutYourBabyPageInteractions.isTwoOrThreeBabiesRadioSelected());
		Assert.assertFalse(AboutYourBabyPageInteractions.isFourOrMoreBabiesRadioSelected());
	}
	
	@Given("the mothers first name field is blank")
	public void givenTheMothersFirstNameFieldIsBlank() {
		Assert.assertEquals("", AboutYourBabyPageInteractions.getMothersFirstName());
	}

	@Given("the mothers last name field is blank")
	public void givenTheMothersLastNameFieldIsBlank() {
		Assert.assertEquals("", AboutYourBabyPageInteractions.getMothersLastName());
	}

	@Given("the date of birth is not valid")
	public void givenTheDateOfBirthHasNotBeenProvided(){
		Assert.assertEquals("-1", AboutYourBabyPageInteractions.getDOBDay());
		Assert.assertEquals("-1", AboutYourBabyPageInteractions.getDOBMonth());
		Assert.assertEquals("-1", AboutYourBabyPageInteractions.getDOBYear());
	}

	@Given("I have entered <name value> into the mother's <name type> field")
	public void givenIHaveEnterednameValueIntoTheMothersnameTypeField(@Named("name value") String nameValue, @Named("name type") String nameType){
		System.out.println("nameValue " + nameValue + " nameType " + nameType);
		
		if(nameType.equalsIgnoreCase("first name")){
			
			if(nameValue.equalsIgnoreCase("Blank")){
				AboutYourBabyPageInteractions.setMothersFirstName("");
			}else if(nameValue.equalsIgnoreCase("Includes numbers")){
				AboutYourBabyPageInteractions.setMothersFirstName("Sarah1");
			}
			
		}else if(nameType.equalsIgnoreCase("last name")){
			
			if(nameValue.equalsIgnoreCase("Blank")){
				AboutYourBabyPageInteractions.setMothersLastName("");
			}else if(nameValue.equalsIgnoreCase("Includes numbers")){
				AboutYourBabyPageInteractions.setMothersLastName("Newton1");
			}
			
		}
	}
	
	@Given("the select address field is displayed")
	public void givenTheSelectAddressFieldIsDisplayed(){
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isAddressFullDisplayed());
	}
	
	@Given("I enter 'BS4 2DR' in the postcode field")
	public void givenIEnterApostcodeInThePostcodeField(){
		WhereWasYourBabyBornPageInteractions.setPostcode("BS4 2DR"); 
	}
	
	@Given("I enter <invalid> in the postcode field")
	public void givenIEnterInvalidInThePostcodeField(@Named("invalid") String invalid){
		WhereWasYourBabyBornPageInteractions.setPostcode(invalid); 
	}
	
	@Given("I enter <postcode1> in the postcode field")
	public void givenIEnterPostcode1InThePostcodeField(@Named("postcode1") String postcode){
		WhereWasYourBabyBornPageInteractions.setPostcode(postcode); 
	}
	
	@Given("I click the 'Find address' button")
	public void givenIClickTheFindAddressButton(){
		WhereWasYourBabyBornPageInteractions.clickAddressLookupBtn();
	}
	
	@Given("the postcode field is displayed")
	public void givenThePostcodeFieldIsDisplayed(){
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isPostcodeDisplayed());
	}
	
	@Given("I choose 'An address in the Bristol City Council area'")
	public void givenIChooseAnAddressInTheBristolCityCouncilArea(){
		WhereWasYourBabyBornPageInteractions.selectLocationInBristol();
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isLocationInBristolChecked()); 
	}
	
	@Given("that I am on the 'Baby born outside Bristol City' page")
	public void givenThatIAmOnTheBabyBornOutsideBristolCityPage(){
		BabyBornOutsideBristolCityPageInteractions.isDisplayedCheck();
		Assert.assertEquals("Baby born outside Bristol City", BabyBornOutsideBristolCityPageInteractions.getTitle());
	}
	
	@Given("that I am on the 'mother and father marriage status' page")
	public void givenThatIAmOnThemotherAndFatherMarriageStatusPage(){
		MotherAndFatherMarriageStatusPageInteractions.isDisplayedCheck(); 
	}
	
	@Given("that I am on the 'mother and female marriage status' page")
	public void givenThatIAmOnThemotherAndFemaleMarriageStatusPage(){
		MotherAndFemaleMarriageStatusPageInteractions.isDisplayedCheck(); 
	}

	@Given("I am on the 'Who can register' page")
	public void givenIAmOnTheWhoCanRegisterPage(){
		WhoseNameOnTheRegisterPageInteractions.isDisplayedCheck();
	}
	
	@Given("that I am on the 'whose name do you want to register' page")
	public void givenThatIAmOnThewhoseNameDoYouWantToRegisterPage(){
		Assert.assertTrue(WhoseNameOnTheRegisterPageInteractions.isDisplayedCheck());	
	}
	
	@Given("no register name options have been selected")
	public void givenNoRegisterNameOptionsHaveBeenSelected(){
		Assert.assertFalse(WhoseNameOnTheRegisterPageInteractions.isMotherAndFatherRadioSelected());
		Assert.assertFalse(WhoseNameOnTheRegisterPageInteractions.isJustMotherRadioSelected());
		Assert.assertFalse(WhoseNameOnTheRegisterPageInteractions.isMotherAndFemaleRadioSelected());
	}
	
	@Given("an error message is displayed")
	public void givenAnErrorMessageIsDisplayed(){
		Assert.assertTrue(CommonPageInteractions.isErrorMsgDisplayed());
	}

	@Given("I choose '<hospital>'")
	public void givenIChoosehospital(@Named("hospital") String hospital){
		if(hospital.equalsIgnoreCase("St Micheals Hospital")){
			WhereWasYourBabyBornPageInteractions.selectLocation1();
		}else if(hospital.equalsIgnoreCase("Southmead Hospital")){
			WhereWasYourBabyBornPageInteractions.selectLocation2();
		}else if(hospital.equalsIgnoreCase("Cossham Hospital")){
			WhereWasYourBabyBornPageInteractions.selectLocation3();
		}
	}

	@Given("that I completed the booking process")
	public void givenThatICompletedTheBookingProcess() {
		CommonPageInteractions.clickNextBtn();
		
		aboutYourBabySimpleSetUp();
		parentNamesOnTheRegisterSimpleSetUp();
		chooseRegisterOfficeSimpleSetUp();
		chooseAnAppointmentSimpleSetUp();
		checkDateAndContactDetailsSimpleSetUp("noreply@bristol.gov.uk");
	}

	@Given("that I <email_address_provided> provided an email address and selected <register_office> during the booking process")
	public void givenThatIProvidedAnEmailAddressAndSelectedRegisterOffice(@Named("email_address_provided") String emailAddressProvided, @Named("register_office") String registerOffice) {
	
		if(emailAddressProvided.equalsIgnoreCase("have")){
			
			whereWasYourBabyBornSimpleSetUp();
			aboutYourBabySimpleSetUp();
			parentNamesOnTheRegisterSimpleSetUp();
			
			if(registerOffice.equalsIgnoreCase(RegistrationsConstants.CORN_ST)){
				chooseRegisterOfficeSimpleSetUp(RegistrationsConstants.CORN_ST);
			}else{
				chooseRegisterOfficeSimpleSetUp(RegistrationsConstants.SOUTHMEAD);
			}
			
			chooseAnAppointmentSimpleSetUp();
			checkDateAndContactDetailsSimpleSetUp("noreply@bristol.gov.uk");
			
		}else if(emailAddressProvided.equalsIgnoreCase("have not")){
			
			whereWasYourBabyBornSimpleSetUp();
			aboutYourBabySimpleSetUp();
			parentNamesOnTheRegisterSimpleSetUp();
			
			if(registerOffice.equalsIgnoreCase(RegistrationsConstants.CORN_ST)){
				chooseRegisterOfficeSimpleSetUp(RegistrationsConstants.CORN_ST);
			}else{
				chooseRegisterOfficeSimpleSetUp(RegistrationsConstants.SOUTHMEAD);
			}
			
			chooseAnAppointmentSimpleSetUp();
			checkDateAndContactDetailsSimpleSetUp("");
			
		}
	}

	@Then("the <register_office> address is displayed")
	public void givenTheregister_officeAddressIsDisplayed(@Named("register_office") String registerOffice){
		Assert.assertTrue(ThanksThatsBookedPageInteractions.getAppointmentLocation().toLowerCase().contains(registerOffice.toLowerCase()));
	}
}
