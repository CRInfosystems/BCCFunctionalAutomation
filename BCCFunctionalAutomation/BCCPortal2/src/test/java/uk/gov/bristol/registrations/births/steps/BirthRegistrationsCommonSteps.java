package uk.gov.bristol.registrations.births.steps;

import java.util.Date;

import org.joda.time.DateTime;

import uk.gov.bristol.common.CommonSteps;
import uk.gov.bristol.registrations.RegistrationsConstants;
import uk.gov.bristol.registrations.StepsContext;
import uk.gov.bristol.registrations.births.pages.interactions.AboutYourBabyPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.CheckDateAndGiveContactDetailsPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseARegisterOfficePageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.ChooseAnAppointmentPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.CommonPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhereWasYourBabyBornPageInteractions;
import uk.gov.bristol.registrations.births.pages.interactions.WhoseNameOnTheRegisterPageInteractions;

public class BirthRegistrationsCommonSteps extends CommonSteps {
	
	protected void whereWasYourBabyBornSimpleSetUp(){
		WhereWasYourBabyBornPageInteractions.selectLocation1();
		CommonPageInteractions.clickNextBtn();
	}
	
	protected void aboutYourBabySimpleSetUp(){
		AboutYourBabyPageInteractions.isDisplayedCheck();
		AboutYourBabyPageInteractions.selectOneBaby();
		DateTime dateTime = new DateTime(new Date());
		AboutYourBabyPageInteractions.setDOBDay(dateTime.dayOfMonth().getAsString());
		AboutYourBabyPageInteractions.setDOBMonth(dateTime.monthOfYear().getAsString());
		AboutYourBabyPageInteractions.setDOBYear(dateTime.year().getAsString());
		AboutYourBabyPageInteractions.setMothersFirstName("Sarah");
		AboutYourBabyPageInteractions.setMothersLastName("Newton");
		CommonPageInteractions.clickNextBtn();
	}

	
	protected void parentNamesOnTheRegisterSimpleSetUp(){
		WhoseNameOnTheRegisterPageInteractions.isDisplayedCheck();
		WhoseNameOnTheRegisterPageInteractions.selectJustMother();
		CommonPageInteractions.clickNextBtn();
	}

	protected void checkDateAndContactDetailsSimpleSetUp(String emailAddress) {
		CheckDateAndGiveContactDetailsPageInteractions.setFirstName("Chris");
		CheckDateAndGiveContactDetailsPageInteractions.setLastName("Newton");
		CheckDateAndGiveContactDetailsPageInteractions.setEmail(emailAddress);
		CheckDateAndGiveContactDetailsPageInteractions.clickNextBtn();
	}
	
	protected void chooseAnAppointmentSimpleSetUp() {
		ChooseAnAppointmentPageInteractions.selectFirstAppointment();
		String appointmentDate = ChooseAnAppointmentPageInteractions.getFirstAppointmentDayDate();
		StepsContext.INSTANCE.put("appointmentDate", appointmentDate);
		ChooseAnAppointmentPageInteractions.clickNextBtn();
	}

	protected void chooseRegisterOfficeSimpleSetUp() {
		chooseRegisterOfficeSimpleSetUp(RegistrationsConstants.CORN_ST);
	}

	protected void chooseRegisterOfficeSimpleSetUp(String office) {
		if(office.equalsIgnoreCase(RegistrationsConstants.CORN_ST)){
			ChooseARegisterOfficePageInteractions.selectOffice1(); // Corn Street
		}else{
			ChooseARegisterOfficePageInteractions.selectOffice2(); // Southmead
		}
		
		ChooseARegisterOfficePageInteractions.clickNextBtn();
	}
	
}
