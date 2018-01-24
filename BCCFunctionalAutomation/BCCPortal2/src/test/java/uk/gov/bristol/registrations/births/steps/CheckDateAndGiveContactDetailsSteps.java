package uk.gov.bristol.registrations.births.steps;
import org.jbehave.core.annotations.*;
import org.junit.Assert;

import uk.gov.bristol.registrations.births.pages.interactions.CheckDateAndGiveContactDetailsPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseAnAppointmentPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ThanksThatsBookedPageInteractions;

public class CheckDateAndGiveContactDetailsSteps {
	
	private String selectedOffice;
	
	@Given("I have correctly filled in the last name")
	@Pending
	public void givenIHaveCorrectlyFilledInTheLastName(){
		CheckDateAndGiveContactDetailsPageInteractions.setLastName("Shearer");
	}
	
	@Given("I have entered a valid first name into the first name field")
	@Pending
	public void givenIHaveEnteredAValidFirstNameIntoTheFirstNameField(){
		CheckDateAndGiveContactDetailsPageInteractions.setFirstName("Phil");
	}
	
	@Then("the URL opens in a new browser window.")
	@Pending
	public void thenTheURLOpensInANewBrowserWindow(){
		String target = CheckDateAndGiveContactDetailsPageInteractions.getPrivacyLinkTarget();
		Assert.assertEquals("_blank", target); 
	}
	
	@Then("I am shown an <error message>")
	@Pending
	public void thenIAmShownAnerrorMessage(@Named("error message") String errorMessage){
		
		//Can't be implemented until BB implement correct validation
		
		CheckDateAndGiveContactDetailsPageInteractions.isValidationErrorDisplayed();
		
		/*
		if(errorMessage.equalsIgnoreCase("You must enter a first name")){
			Assert.assertTrue(CheckDateAndGiveContactDetailsPageInteractions.getMotherFirstNameErrorMsgText().contains("please enter a first name"));
		}else if(errorMessage.equalsIgnoreCase("You must enter a last name")){
			Assert.assertTrue(CheckDateAndGiveContactDetailsPageInteractions.getMotherLastNameErrorMsgText().contains("please enter a last name"));
		}else if(errorMessage.equalsIgnoreCase("First name should only include the letters A to Z")){
			Assert.assertTrue(CheckDateAndGiveContactDetailsPageInteractions.getMotherFirstNameErrorMsgText().contains("the first name can only include the letters A to Z without accents"));
		}else if(errorMessage.equalsIgnoreCase("Last name should only include the letters A to Z")){
			Assert.assertTrue(CheckDateAndGiveContactDetailsPageInteractions.getMotherLastNameErrorMsgText().contains("the last name can only include the letters A to Z without accents"));
		}	*/	
		
	}
	
	@When("I click the 'change this appointment' link ")
	@Pending
	public void whenIClickThechangeThisAppointmentLink(){
		CheckDateAndGiveContactDetailsPageInteractions.clickChangeAppointmentLink();
	}
	
	@Given("that I am on the 'Check date and give contact details' page")
	@Pending
	public void givenThatIAmOnTheCheckDateAndGiveContactDetailsPage(){
		CheckDateAndGiveContactDetailsPageInteractions.isDisplayedCheck();
		Assert.assertEquals("Check date and give contact details", CheckDateAndGiveContactDetailsPageInteractions.getTitle());
		
		selectedOffice = CheckDateAndGiveContactDetailsPageInteractions.getDisplayedAppointmentOffice();
	}

	@Given("I have entered <first name> into the first name field")
	@Pending
	public void givenIHaveEnteredfirstNameIntoTheFirstNameField(@Named("first name") String firstName){
		 if(firstName.equals("Blank")){
			 CheckDateAndGiveContactDetailsPageInteractions.setFirstName("");
		 }else if(firstName.equals("Includes characters outside Alpha a-z")){
			 CheckDateAndGiveContactDetailsPageInteractions.setFirstName("Phil1");
		 }else{
			 CheckDateAndGiveContactDetailsPageInteractions.setFirstName(firstName);
		 }
	}
	
	@Then("I am taken back to the 'Choose an appointment' page")
	@Pending
	public void thenIAmTakenBackToTheChooseAnAppointmentPage(){
		ChooseAnAppointmentPageInteractions.isDisplayedCheck();
		Assert.assertEquals("Choose an appointment", ChooseAnAppointmentPageInteractions.getTitle());
	}
	
	@Given("I have correctly filled in the email")
	@Pending
	public void givenIHaveCorrectlyFilledInTheEmail(){
		CheckDateAndGiveContactDetailsPageInteractions.setEmail("dave.burrows@pfiks.com"); 
	}

	@Then("I am taken to the URL 'https://www.bristol.gov.uk/privacy'")
	@Pending
	public void thenIAmTakenToTheURLhttpswwwbristolgovukprivacy(){
		String href = CheckDateAndGiveContactDetailsPageInteractions.getPrivacyLinkHref();
		Assert.assertEquals("https://www.bristol.gov.uk/privacy", href);
	}
	
	@Given("I have entered a valid last name into the last name field")
	@Pending
	public void givenIHaveEnteredAValidLastNameIntoTheLastNameField(){
		CheckDateAndGiveContactDetailsPageInteractions.setLastName("Shearer"); 
	}
	
	@Given("I have correctly filled in the first name ")
	@Pending
	public void givenIHaveCorrectlyFilledInTheFirstName(){
		CheckDateAndGiveContactDetailsPageInteractions.setFirstName("Phil");
	}
	
	@Given("I have entered <last name> into the last name field")
	@Pending
	public void givenIHaveEnteredlastNameIntoTheLastNameField(@Named("last name") String lastName){
		if(lastName.equals("Blank")){
			 CheckDateAndGiveContactDetailsPageInteractions.setLastName("");
		}else if(lastName.equals("Includes characters outside Alpha a-z")){
			 CheckDateAndGiveContactDetailsPageInteractions.setLastName("Shearer1");
		}else{
			 CheckDateAndGiveContactDetailsPageInteractions.setLastName(lastName);
		} 
	}
	
	@When("I click the 'privacy notice' link")
	@Pending
	public void whenIClickTheprivacyNoticeLink(){
		//CheckDateAndGiveContactDetailsPageInteractions.clickPrivacyLink();
		//Don't click the link, instead check the href and target attributes to make sure they're correct
	}
	
	@Given("I have entered <email> into the email field")
	@Pending
	public void givenIHaveEnteredemailIntoTheEmailField(@Named("email") String email){
		if(email.equals("Blank")){
			 CheckDateAndGiveContactDetailsPageInteractions.setEmail("");
		}else if(email.equals("valid email format")){
			 CheckDateAndGiveContactDetailsPageInteractions.setEmail("dave.burrows@pfiks.com");
		}else if(email.equals("invalid email format")){
			 CheckDateAndGiveContactDetailsPageInteractions.setEmail("dave.burrows");
		}else{
			 CheckDateAndGiveContactDetailsPageInteractions.setEmail(email);
		} 
	}

	@Then("I am taken to the 'Confirmation' page")
	@Pending
	public void thenIAmTakenToTheConfirmationPage(){
		ThanksThatsBookedPageInteractions.isDisplayedCheck();
	}

	@Then("I can see the text about the privacy notice")
	@Pending
	public void thenICanSeeTheTextAboutThePrivacyNotice(){
		CheckDateAndGiveContactDetailsPageInteractions.isPrivacyLinkDisplayed(); 
	}
	
	@Given("I have entered <telephone number> into the telephone number field")
	@Pending
	public void givenIHaveEnteredtelephoneNumberIntoTheTelephoneNumberField(@Named("telephone number") String telephoneNumber){
		if(telephoneNumber.equals("Blank")){
			 CheckDateAndGiveContactDetailsPageInteractions.setMobile("");
		}else if(telephoneNumber.equals("valid tel number")){
			 CheckDateAndGiveContactDetailsPageInteractions.setMobile("07854952028");
		}else if(telephoneNumber.equals("invalid telephone number format")){
			 CheckDateAndGiveContactDetailsPageInteractions.setMobile("david");
		}else{
			 CheckDateAndGiveContactDetailsPageInteractions.setMobile(telephoneNumber);
		} 
	}
	
	@Then("the appointments shown are still appropriate (length, type, chosen office)")
	@Pending
	public void thenTheAppointmentsShownAreStillAppropriatelengthTypeChosenOffice(){
		String officeTitle = ChooseAnAppointmentPageInteractions.getOfficeTitle(); 
		
		Assert.assertEquals(officeTitle, selectedOffice);
	}

}