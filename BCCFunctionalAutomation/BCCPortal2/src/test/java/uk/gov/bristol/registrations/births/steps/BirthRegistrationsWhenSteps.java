package uk.gov.bristol.registrations.births.steps;

import java.util.Calendar;
import java.util.Date;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.joda.time.DateTime;
import org.junit.Assert;

import uk.gov.bristol.registrations.births.pages.interactions.AboutYourBabyPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.BabyBornOutsideBristolCityPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.CommonPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.MotherAndFemaleNotMarriedPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.RegisterABabyPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ThanksThatsBookedPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhereWasYourBabyBornPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhoseNameOnTheRegisterPageInteractions;

public class BirthRegistrationsWhenSteps extends BirthRegistrationsCommonSteps{

	@When("the mothers first name field is blank")
	public void whenTheMothersFirstNameFieldIsBlank() {
		AboutYourBabyPageInteractions.setMothersFirstName("");
	}

	@When("the mothers last name field is blank")
	public void whenTheMothersLastNameFieldIsBlank() {
		AboutYourBabyPageInteractions.setMothersLastName("");
	}

	@When("I select <number of babies>")
	public void whenISelectnumberOfBabies(@Named("number of babies") String numberOfBabies) {
	
		if(numberOfBabies.equalsIgnoreCase("one")){
			AboutYourBabyPageInteractions.selectOneBaby();
		}else if(numberOfBabies.equalsIgnoreCase("two or three")){
			AboutYourBabyPageInteractions.selectTwoOrThreeBabies();
		}else if(numberOfBabies.equalsIgnoreCase("four or more")){
			AboutYourBabyPageInteractions.selectFourOrMoreBabies();
		}
	}

	@When("the date of birth is not valid")
	public void whenTheDateOfBirthHasNotBeenProvided(){
		AboutYourBabyPageInteractions.setDOBDay("-1");
		AboutYourBabyPageInteractions.setDOBMonth("-1");
		AboutYourBabyPageInteractions.setDOBYear("-1");
	}

	@When("I have entered a <error type> into the baby's date of birth field")
	public void whenIHaveEnteredAerrorTypeIntoTheBabysDateOfBirthField(@Named("error type") String errorType) {
		
		if(errorType.equalsIgnoreCase("not valid")){
			
			// Set non-existent date i.e. 30th Feb of current year
			AboutYourBabyPageInteractions.setDOBDay("30");
			AboutYourBabyPageInteractions.setDOBMonth("2");
			AboutYourBabyPageInteractions.setDOBYear("" + Calendar.getInstance().get(Calendar.YEAR));
			
		}else if(errorType.equalsIgnoreCase("in the future")){
			
			DateTime dateTime = new DateTime(new Date());
			dateTime = dateTime.plusDays(1);
	
			AboutYourBabyPageInteractions.setDOBDay(dateTime.dayOfMonth().getAsString());
			AboutYourBabyPageInteractions.setDOBMonth(dateTime.monthOfYear().getAsString());
			AboutYourBabyPageInteractions.setDOBYear(dateTime.year().getAsString());
			
		}else if(errorType.equalsIgnoreCase("> 56 days in the past")){
			
			// Set date 57 days in the past i.e. 30th Feb of current year
			DateTime dateTime = new DateTime(new Date());
			dateTime = dateTime.minusDays(57);
	
			AboutYourBabyPageInteractions.setDOBDay(dateTime.dayOfMonth().getAsString());
			AboutYourBabyPageInteractions.setDOBMonth(dateTime.monthOfYear().getAsString());
			AboutYourBabyPageInteractions.setDOBYear(dateTime.year().getAsString());
			
		}
	}

	@When("I have provided a valid birth date")
	public void whenIHaveProvidedAValidBirthDate(){
	
		// Set date of birth to today
		DateTime dateTime = new DateTime(new Date());
	
		AboutYourBabyPageInteractions.setDOBDay(dateTime.dayOfMonth().getAsString());
		AboutYourBabyPageInteractions.setDOBMonth(dateTime.monthOfYear().getAsString());
		AboutYourBabyPageInteractions.setDOBYear(dateTime.year().getAsString());
	}

	@When("I have entered a valid mother's first and last name")
	public void whenIHaveEnteredAValidMothersFirstAndLastName(){
		AboutYourBabyPageInteractions.setMothersFirstName("Sarah");
		AboutYourBabyPageInteractions.setMothersLastName("Newton");
	}

	@When("I select the number of babies")
	public void whenISelectTheNumberOfBabies(){
		AboutYourBabyPageInteractions.selectOneBaby();
	}

	@When("I enter a <postcode2> in the postcode field")
	public void whenIEnterApostcodeInThePostcodeField(@Named("postcode2") String postcode){
		if(postcode.equals("Blank")){
			postcode = "";
		}
		WhereWasYourBabyBornPageInteractions.setPostcode(postcode); 
	}

	@When("I choose 'Please select...' from the select address field")
	public void whenIChoosePleaseSelectFromTheSelectAddressField(){
		WhereWasYourBabyBornPageInteractions.setAddressFullText("Please select...");
	}

	@When("I click the 'Find address' button")
	public void whenIClickTheFindAddressButton(){
		WhereWasYourBabyBornPageInteractions.clickAddressLookupBtn();
	}

	@When("I choose 'An address in the Bristol City Council area'")
	public void whenIChooseAnAddressInTheBristolCityCouncilArea(){
		WhereWasYourBabyBornPageInteractions.selectLocationInBristol();
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isLocationInBristolChecked()); 
	}

	@When("I choose an address from the select address field")
	public void whenIChooseAnAddressFromTheSelectAddressField(){
		WhereWasYourBabyBornPageInteractions.setValidAddressFull();
	}

	@When("I choose 'Outside Bristol City Council area, but in England or Wales'")
	public void whenIChooseOutsideBristolCityCouncilAreaButInEnglandOrWales(){
		WhereWasYourBabyBornPageInteractions.selectLocationOutsideBristol();
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isLocationOutsideBristolChecked()); 
	}
	
	@When("I enter <address> in the birth address field")
	public void whenIEnteraddressInTheBirthAddressField(@Named("address") String address){
		if(address.equals("Blank")){
			address = "";
		}
		WhereWasYourBabyBornPageInteractions.setDeclarationAddress(address); 
	}

	@When("I choose 'Outside England or Wales'")
	public void whenIChooseOutsideEnglandOrWales(){
		WhereWasYourBabyBornPageInteractions.selectLocationOutsideEnglandOrWales();
		Assert.assertTrue(WhereWasYourBabyBornPageInteractions.isLocationOutsideEnglandOrWalesChecked());
	}

	@When("I click the 'change' link")
	public void whenIClickThechangeLink(){
		CommonPageInteractions.clickChangeLink();
	}

	@When("I click the 'next' button")
	public void whenIClickThenextButton(){
		CommonPageInteractions.clickNextBtn();
	}

	@When("I select the 'yes' option")
	public void whenISelectTheyesOption(){
		CommonPageInteractions.selectYes();
	}

	@When("I select the 'no' option")
	public void whenISelectThenoOption(){
		CommonPageInteractions.selectNo();
	}

	@When("no marriage status options have been selected")
	public void whenNoMarriageStatusOptionsHaveBeenSelected() {
		Assert.assertFalse(MotherAndFemaleNotMarriedPageInteractions.isYesRadioSelected());
		Assert.assertFalse(MotherAndFemaleNotMarriedPageInteractions.isNoRadioSelected());
	}

	@When("I click the 'book now' button,")
	public void whenIClickThebookNowButton() {
		RegisterABabyPageInteractions.clickBookNowBtn();
	}

	@When("none of the hospital radio buttons are pre-selected")
	public void whenNoneOfTheHospitalRadioButtonsArePreselected() {
		Assert.assertFalse(WhereWasYourBabyBornPageInteractions.isLocation1Checked());
		Assert.assertFalse(WhereWasYourBabyBornPageInteractions.isLocation2Checked());
		Assert.assertFalse(WhereWasYourBabyBornPageInteractions.isLocation3Checked());
	}

	@When("I choose '<hospital>'")
	public void whenIChooseAhospitalAndClickThenNextButton(@Named("hospital") String hospital) {
		
		if(hospital.equalsIgnoreCase("St Micheals Hospital")){
			WhereWasYourBabyBornPageInteractions.selectLocation1();
		}else if(hospital.equalsIgnoreCase("Southmead Hospital")){
			WhereWasYourBabyBornPageInteractions.selectLocation2();
		}else if(hospital.equalsIgnoreCase("Cossham Hospital")){
			WhereWasYourBabyBornPageInteractions.selectLocation3();
		}
	}

	@When("I select 'just mother'")
	public void whenISelectjustMother(){
		WhoseNameOnTheRegisterPageInteractions.selectJustMother(); 
	}

	@When("I select 'mother and father'")
	public void whenISelectmotherAndFather(){
		WhoseNameOnTheRegisterPageInteractions.selectMotherAndFather();
	}

	@When("I select 'mother and female'")
	public void whenISelectmotherAndFemale(){
		WhoseNameOnTheRegisterPageInteractions.selectMotherAndFemale(); 
	}

	@When("I am on the 'baby born outside Bristol City' page")
	public void whenIAmOnThebabyBornOutsideBristolCityPage(){
		 BabyBornOutsideBristolCityPageInteractions.isDisplayedCheck(); 
	}

	@When("I click the 'Book an appointment' button")
	public void whenIClickTheBookAnAppointmentButton(){
		BabyBornOutsideBristolCityPageInteractions.clickBookAnAppointmentBtn();
	}

	@When("I complete the rest of the booking process from the 'About your baby' page onwards")
	public void whenICompleteTheRestOfTheBookingProcessFromTheaboutYourBabypageOnwards(){
	
		CommonPageInteractions.clickNextBtn();
		
		aboutYourBabySimpleSetUp();
		parentNamesOnTheRegisterSimpleSetUp();
		chooseRegisterOfficeSimpleSetUp();
		chooseAnAppointmentSimpleSetUp();
		checkDateAndContactDetailsSimpleSetUp("noreply@bristol.gov.uk");
	}

	@When("I'm on the booking confirmation page")
	public void whenImOnTheBookingConfirmationPage() {
		ThanksThatsBookedPageInteractions.isDisplayedCheck();
	}

	@When("I provide the birth address")
	public void whenIProvideTheBirthAddress(){
		WhereWasYourBabyBornPageInteractions.setDeclarationAddress("Manor Hospital, Walsall");
	}

}
