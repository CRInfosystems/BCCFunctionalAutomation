package uk.gov.bristol.registrations.births.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uk.gov.bristol.common.BrowserDriver;
import uk.gov.bristol.registrations.births.pages.ChooseAnAppointmentPage;

public class ChooseAnAppointmentPageInteractions extends CommonPageInteractions {

	private static ChooseAnAppointmentPage chooseAnAppointmentPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ChooseAnAppointmentPage.class);
	
	public static String getTitle() {
		System.out.println("Title text: "+chooseAnAppointmentPage.title.getText());
		return chooseAnAppointmentPage.title.getText();
	}

	public static void isValidationErrorDisplayed(){
		BrowserDriver.waitForElement(chooseAnAppointmentPage.validationError);
		chooseAnAppointmentPage.validationError.isDisplayed();
	}
	
	public static boolean isDisplayedCheck(){
		BrowserDriver.waitForElement(chooseAnAppointmentPage.title, 20);
		return chooseAnAppointmentPage.title.isDisplayed();
	}	
	
	public static String getOfficeTitle(){
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 20);
		wait.until(ExpectedConditions.textToBePresentInElement(chooseAnAppointmentPage.officeTitle, "Appointments at"));
		
		return chooseAnAppointmentPage.officeTitle.getText();
	}
	
	public static void selectFirstAppointment(){
		WebElement firstAppointment = chooseAnAppointmentPage.firstAvailableDay.findElement(By.cssSelector(".form__item__field--radio"));
		firstAppointment.click();
	}
	
	public static String getFirstAppointmentDayDate(){
		
		//Get selected time
		WebElement firstAppointment = chooseAnAppointmentPage.firstAvailableDay.findElement(By.cssSelector(".label--radio"));
		String time = firstAppointment.getText().trim();
		
		//Get selected day
		WebElement firstDay = chooseAnAppointmentPage.firstAvailableDay.findElement(By.cssSelector(".appointment-card__weekday"));
		String day = firstDay.getText().trim();
		
		//Get selected date
		WebElement firstDate = chooseAnAppointmentPage.firstAvailableDay.findElement(By.cssSelector(".appointment-card__daymonth"));
		String date = firstDate.getText().trim();
		date = convertDate(date);
		
		String daydate = time + " " + day + " " + date;
		
		return daydate;
		
	}
	
	public static String getDisplayedAppointmentDayDate(){
		
		WebElement displayedAppointment = chooseAnAppointmentPage.selectedAppointment.findElement(By.cssSelector(".panel__copy"));
		String daydate = displayedAppointment.getText().trim();
		
		return daydate;
	}
	
	private static String convertDate(String date){
		String longDate = date;
		
		if(date.endsWith("Jan"))
			longDate = longDate.replaceAll("Jan", "January");
		else if(date.endsWith("Feb"))
			longDate = longDate.replaceAll("Feb", "February");
		else if(date.endsWith("Mar"))
			longDate = longDate.replaceAll("Mar", "March");
		else if(date.endsWith("Apr"))
			longDate = longDate.replaceAll("Apr", "April");
		else if(date.endsWith("May"))
			longDate = longDate.replaceAll("May", "May");
		else if(date.endsWith("Jun"))
			longDate = longDate.replaceAll("Jun", "June");
		else if(date.endsWith("Jul"))
			longDate = longDate.replaceAll("Jul", "July");
		else if(date.endsWith("Aug"))
			longDate = longDate.replaceAll("Aug", "August");
		else if(date.endsWith("Sep"))
			longDate = longDate.replaceAll("Sep", "September");
		else if(date.endsWith("Oct"))
			longDate = longDate.replaceAll("Oct", "October");
		else if(date.endsWith("Nov"))
			longDate = longDate.replaceAll("Nov", "November");
		else if(date.endsWith("Dec"))
			longDate = longDate.replaceAll("Dec", "December");
		
		return longDate;
	}
}
