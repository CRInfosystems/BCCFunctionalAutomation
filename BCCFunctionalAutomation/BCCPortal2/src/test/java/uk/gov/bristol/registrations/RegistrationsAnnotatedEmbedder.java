package uk.gov.bristol.registrations;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.AnnotatedEmbedderRunner;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

import uk.gov.bristol.registrations.RegistrationsAnnotatedEmbedder.RegistrationsEmbedder;
import uk.gov.bristol.registrations.RegistrationsAnnotatedEmbedder.RegistrationsReportBuilder;
import uk.gov.bristol.registrations.births.steps.BirthRegistrationsGivenSteps;
import uk.gov.bristol.registrations.births.steps.BirthRegistrationsThenSteps;
import uk.gov.bristol.registrations.births.steps.BirthRegistrationsWhenSteps;
import uk.gov.bristol.registrations.births.steps.CheckDateAndGiveContactDetailsSteps;
import uk.gov.bristol.registrations.births.steps.ChooseARegisterOfficeSteps;
import uk.gov.bristol.registrations.births.steps.ChooseAnAppointmentSteps;

import com.bcc.general.StoryBase;
import com.bcc.general.StoryReporterBase;

/**
 * The Class RegistrationsAnnotatedEmbedder.
 */
@RunWith(AnnotatedEmbedderRunner.class)
@Configure(storyReporterBuilder = RegistrationsReportBuilder.class )
@UsingEmbedder(embedder = RegistrationsEmbedder.class, generateViewAfterStories = true, ignoreFailureInStories = true, ignoreFailureInView = false, verboseFailures = true, storyTimeoutInSecs=14400)
@UsingSteps(instances = { BirthRegistrationsGivenSteps.class, BirthRegistrationsWhenSteps.class, BirthRegistrationsThenSteps.class,
					ChooseARegisterOfficeSteps.class, CheckDateAndGiveContactDetailsSteps.class, ChooseAnAppointmentSteps.class})
public class RegistrationsAnnotatedEmbedder extends InjectableEmbedder {

	/** The Constant log. */
	private final static Logger log = Logger.getLogger(RegistrationsAnnotatedEmbedder.class);
	
	/* (non-Javadoc)
	 * @see org.jbehave.core.Embeddable#run()
	 */
	@Test
	public void run() {

		URL codeLocationsPath = CodeLocations.codeLocationFromPath("target/classes");
		List<String> includes = new ArrayList<String>();
		includes.add("**/registrations/**/*.story");
		
		List<String> excludes = new ArrayList<String>();
		excludes.add("**/registrations/**/about_your_baby_scenarios.story");
		excludes.add("**/registrations/**/check_date_and_give_contact_details_scenarios.story");
		excludes.add("**/registrations/**/choose_a_register_office_scenarios.story");
		excludes.add("**/registrations/**/choose_an_appointment_scenarios.story");
		excludes.add("**/registrations/**/start_the_registration_process_scenarios.story");
		excludes.add("**/registrations/**/where_was_your_baby_born_scenarios.story");
		excludes.add("**/registrations/**/who_can_register_scenarios.story");
		
		List<String> storyPaths = new StoryFinder().findPaths(codeLocationsPath, includes, excludes);

		log.info("codeLocation " + codeLocationsPath);

		for (String storyPath : storyPaths) {
			log.info(storyPath);
		}

		injectedEmbedder().runStoriesAsPaths(storyPaths);
	}

	/**
	 * The Class RegistrationsReportBuilder.
	 */
	public static class RegistrationsReportBuilder extends StoryReporterBuilder {
		
		/**
		 * Instantiates a new registrations report builder.
		 */
		public RegistrationsReportBuilder() {
			this.withReporters(new StoryReporterBase());
			this.withDefaultFormats();
			this.withFormats(Format.HTML, Format.XML, Format.CONSOLE);
		}
	}

	/**
	 * The Class RegistrationsEmbedder.
	 */
	public static class RegistrationsEmbedder extends StoryBase {

	}

}
