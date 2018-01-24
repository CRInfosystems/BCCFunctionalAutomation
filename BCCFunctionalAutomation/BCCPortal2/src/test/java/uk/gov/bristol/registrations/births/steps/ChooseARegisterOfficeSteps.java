package uk.gov.bristol.registrations.births.steps;
import org.jbehave.core.annotations.*;
import org.junit.Assert;

import uk.gov.bristol.registrations.births.pages.interactions.ChooseARegisterOfficePageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseAnAppointmentPageInteractions;


public class ChooseARegisterOfficeSteps {
	
	@Given("that I am on the 'Choose a register office' page")
	public void givenThatIAmOnTheChooseARegisterOfficePage(){
		ChooseARegisterOfficePageInteractions.isDisplayedCheck();
		Assert.assertEquals("Choose a register office", ChooseARegisterOfficePageInteractions.getTitle());
	}
	
	@When("none of the office radio buttons are pre-selected")
	public void whenNoneOfTheOfficeRadioButtonsArePreselected(){
		Assert.assertFalse(ChooseARegisterOfficePageInteractions.isOffice1Checked());
		Assert.assertFalse(ChooseARegisterOfficePageInteractions.isOffice2Checked());
	}	

	@Then("I see an error message saying 'please select an office'")
	@Pending
	public void thenISeeAnErrorMessageSayingpleaseSelectAnOffice(){
		ChooseARegisterOfficePageInteractions.isValidationErrorDisplayed();
	}
	
	@When("I choose '<office>'")
	public void whenIChooseoffice(@Named("office") String office){
		if(office.equalsIgnoreCase("Corn Street Register Office")){
			ChooseARegisterOfficePageInteractions.selectOffice1();
		}else if(office.equalsIgnoreCase("Southmead Hospital Register Office")){
			ChooseARegisterOfficePageInteractions.selectOffice2();
		}
	}
	
	@Then("I am taken to the 'Choose an appointment' page")
	@Pending
	public void thenIAmTakenToTheChooseAnAppointmentPage(){
		  ChooseAnAppointmentPageInteractions.isDisplayedCheck();
		  Assert.assertEquals("Choose an appointment", ChooseAnAppointmentPageInteractions.getTitle());
	}
	
	@Then("I see appointments for '<office>'")
	@Pending
	public void thenISeeAppointmentsForTheChosenOffice(@Named("office") String office){
		Assert.assertEquals("Appointments at "+office, ChooseAnAppointmentPageInteractions.getOfficeTitle());
	}	
	
	
	@When("I view the page")
	public void whenIViewThePage(){
		// Test not needed
	}
	
	@Then("I am shown an image of a map showing the available locations")
	public void thenIAmShownAnImageOfAMapShowingTheAvailableLocations(){
		ChooseARegisterOfficePageInteractions.isMapDisplayedCheck();
	}

	
}