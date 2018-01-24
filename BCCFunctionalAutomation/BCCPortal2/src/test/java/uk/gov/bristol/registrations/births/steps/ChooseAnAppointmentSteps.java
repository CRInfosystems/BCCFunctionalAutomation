package uk.gov.bristol.registrations.births.steps;

import org.jbehave.core.annotations.*;
import org.junit.Assert;

import uk.gov.bristol.registrations.births.pages.interactions.CheckDateAndGiveContactDetailsPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseAnAppointmentPageInteractions;

public class ChooseAnAppointmentSteps{
	
	private String selectedDate;
	private String selectedOffice;
	
	@Given("that I am on the 'Choose an appointment' page")
	@Pending
	public void givenThatIAmOnTheChooseAnAppointmentPage(){
		ChooseAnAppointmentPageInteractions.isDisplayedCheck();
		Assert.assertEquals("Choose an appointment", ChooseAnAppointmentPageInteractions.getTitle());
		
		//Set selected office
		selectedOffice = ChooseAnAppointmentPageInteractions.getOfficeTitle();
	}
	
	@When("I select an available slot")
	@Pending
	public void whenISelectAnAvailableSlot(){
		ChooseAnAppointmentPageInteractions.selectFirstAppointment();
	}
	
	@Then("it should display my chosen appointment time and date at the bottom of the page")
	@Pending
	public void thenItShouldDisplayMyChosenAppointmentTimeAndDateAtTheBottomOfThePage(){
		selectedDate = ChooseAnAppointmentPageInteractions.getFirstAppointmentDayDate();
		String displayedDate = ChooseAnAppointmentPageInteractions.getDisplayedAppointmentDayDate();
		
		Assert.assertEquals(selectedDate, displayedDate);
	}
	
	@Then("i am taken to the 'Check date and give contact details' page")
	@Pending
	public void thenIAmTakenToTheCheckDateAndGiveContactDetailsPage(){
		CheckDateAndGiveContactDetailsPageInteractions.isDisplayedCheck();
		Assert.assertEquals("Choose an appointment", CheckDateAndGiveContactDetailsPageInteractions.getTitle());
	}
	
	@Then("i see the chosen appointment")
	@Pending
	public void thenISeeTheChosenAppointment(){
		
		String displayedDate = CheckDateAndGiveContactDetailsPageInteractions.getDisplayedAppointmentDayDate();
		Assert.assertEquals(selectedDate, displayedDate);
		
		String displayedOffice = CheckDateAndGiveContactDetailsPageInteractions.getDisplayedAppointmentOffice();
		Assert.assertEquals(selectedOffice, "Appointments at "+displayedOffice);
	}
	
}