package uk.gov.bristol.registrations.births.scenarios;

import org.jbehave.core.annotations.*;
import org.junit.Assert;

import uk.gov.bristol.registrations.births.pages.interactions.CheckDateAndGiveContactDetailsPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseAnAppointmentPageInteractions;

public class ChooseAnAppointmentSteps{
	
	private String selectedDate;
	private String selectedOffice;
	
	@Given("that I am on the 'Choose an appointment' page")
	public void givenThatIAmOnTheChooseAnAppointmentPage(){
		//ChooseAnAppointmentPageInteractions.isDisplayedCheck();
		//Assert.assertEquals("Choose an appointment", ChooseAnAppointmentPageInteractions.getTitle());
		
		Assert.assertTrue(ChooseAnAppointmentPageInteractions.isDisplayedCheck());
		
		//Set selected office
		selectedOffice = ChooseAnAppointmentPageInteractions.getOfficeTitle();
	}
	
	@When("I select an available slot")
	public void whenISelectAnAvailableSlot(){
		ChooseAnAppointmentPageInteractions.selectFirstAppointment();
	}
	
	@Then("it should display my chosen appointment time and date at the bottom of the page")
	public void thenItShouldDisplayMyChosenAppointmentTimeAndDateAtTheBottomOfThePage(){
		selectedDate = ChooseAnAppointmentPageInteractions.getFirstAppointmentDayDate();
		String displayedDate = ChooseAnAppointmentPageInteractions.getDisplayedAppointmentDayDate();
		
		Assert.assertEquals(selectedDate, displayedDate);
	}
	
	@Then("I am taken to the 'Check date and give contact details' page")
	public void thenIAmTakenToTheCheckDateAndGiveContactDetailsPage(){
		Assert.assertTrue(CheckDateAndGiveContactDetailsPageInteractions.isDisplayedCheck());
		//Assert.assertEquals("Choose an appointment", CheckDateAndGiveContactDetailsPageInteractions.getTitle());
	}
	
	@Then("I see the chosen appointment")
	public void thenISeeTheChosenAppointment(){
		
		String displayedDate = CheckDateAndGiveContactDetailsPageInteractions.getDisplayedAppointmentDayDate();
		Assert.assertEquals(selectedDate, displayedDate);
		
		String displayedOffice = CheckDateAndGiveContactDetailsPageInteractions.getDisplayedAppointmentOffice();
		Assert.assertEquals(selectedOffice, "Appointments at "+displayedOffice);
	}
	
}