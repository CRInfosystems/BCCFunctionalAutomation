Title: Birth Registrations - About your baby [REG-12, REG-17, REG-22]

Narrative:
As a Birth Registration Customer,
I want to be able to provide the number of children I wish to register,
So that the registration service know how long the appointment should last and therefore what length of appointment to offer me

Scenario: A customer is providing none of the required detail about the baby is unable to progress to the next page
GivenStories: uk/gov/bristol/registrations/births/stories/where_was_your_baby_born_scenarios.story
Given that I am on the 'About your baby' page
And none of the baby number radio buttons have been selected
And the date of birth is not valid
And the mothers first name field is blank
And the mothers last name field is blank
When I click the 'next' button
Then an error message, prompting the user to confirm the number of babies should be displayed
And an error message, prompting the user to provide a date of birth should be displayed
And an error message, prompting the user to enter the mother's first name should be displayed
And an error message, prompting the user to enter the mother's last name should be displayed

Scenario: A customer confirms the number of babies born 
Given that I am on the 'About your baby' page
When I select <number of babies>
And the date of birth is not valid
And the mothers first name field is blank
And the mothers last name field is blank
And I click the 'next' button
Then an error message, prompting the user to confirm the number of babies should not be displayed
And an error message, prompting the user to provide a date of birth should be displayed
And an error message, prompting the user to enter the mother's first name should be displayed
And an error message, prompting the user to enter the mother's last name should be displayed

Examples:
| number of babies 	|
| one				|
| two or three		|
| four or more		|


Scenario: A customer provides an invalid date of birth
Given that I am on the 'About your baby' page
When I have entered a <error type> into the baby's date of birth field
And the mothers first name field is blank
And the mothers last name field is blank
And I click the 'next' button
Then I am shown an error message stating <error type>
And an error message, prompting the user to enter the mother's first name should be displayed
And an error message, prompting the user to enter the mother's last name should be displayed

Examples:
| error type			| 
| not valid				|
| in the future 		|
| > 56 days in the past	|


Scenario: A customer provides a valid birth date 
Given that I am on the 'About your baby' page
When I have provided a valid birth date
And the mothers first name field is blank
And the mothers last name field is blank
And I click the 'next' button
Then an error message, prompting the user to provide a valid birth date should not be displayed
And an error message, prompting the user to enter the mother's first name should be displayed
And an error message, prompting the user to enter the mother's last name should be displayed


Scenario: A customer provides invalid names
Given that I am on the 'About your baby' page
And I have entered <name value> into the mother's <name type> field
When I click the 'next' button
Then I am shown an <error message>

Examples:
| name type		| name value		| error message										|
| first name	| Blank    			| You must enter a last name   						|
| first name	| Includes numbers	| First name should only include the letters A to Z	|
| last name		| Blank    			| You must enter a last name   						|
| last name		| Includes numbers	| First name should only include the letters A to Z	|


Scenario: A customer has completed all required fields 
Given that I am on the 'About your baby' page
When I select the number of babies
And I have provided a valid birth date
And I have entered a valid mother's first and last name
And I click the 'next' button
Then I should progress to the 'Who can register' page
