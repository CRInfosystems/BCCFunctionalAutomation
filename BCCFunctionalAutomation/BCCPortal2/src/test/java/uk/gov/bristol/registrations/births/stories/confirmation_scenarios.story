Title: Birth Registrations - Confirmation Page [REG-42]  

Scenario: A user who would like to register a birth that happened in bristol should not see the declaration IAG on the confirmation page
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story 
Given that I am on the 'Where the baby was born' page
And I choose '<hospital>'
When I complete the rest of the booking process from the 'About your baby' page onwards 
And I'm on the booking confirmation page
Then the declaration IAG is not displayed

Examples:
hospital |
St Micheals Hospital |
Southmead Hospital |
Cossham Hospital |

Scenario: A user who would like to register a birth that happened outside bristol should see the declaration IAG on the confirmation page
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose 'Outside Bristol City Council area, but in England or Wales'
And I provide the birth address
And I click the 'next' button
And I am on the 'baby born outside Bristol City' page
And I click the 'Book an appointment' button
When I complete the rest of the booking process from the 'About your baby' page onwards
And I'm on the booking confirmation page
Then the declaration IAG is displayed

Scenario: A user who registers a birth should see confirmation of the detail they have provided on the confirmation page
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story 
Given that I <email_address_provided> provided an email address and selected <register_office> during the booking process
When I'm on the booking confirmation page
Then I <email_address_display_status> see confirmation of the email address I have provided
And the appointment slot I have chosen is displayed
And the <register_office> address is displayed
And information about how to find <register_office> is displayed

Examples:
| email_address_provided	| email_address_display_status 	| register_office 	|
| have						| do							| corn st 			|
| have						| do							| southmead 		|
| have not					| do not						| corn st			|
| have not					| do not						| southmead			|