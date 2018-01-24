Title: Birth Registrations - Check date and give contact details [REG-37, REG-38]

Narrative:
As a Birth Registration Customer
I need to be able to provide my name and contact details as the person attending the appointment
So I can be contacted if required and can receive email confirmation of the appointment booking if I supply my email address


Scenario: A user wants to go back to change their appointment
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
When I click the 'change this appointment' link 
Then I am taken back to the 'Choose an appointment' page
And the appointments shown are still appropriate (length, type, chosen office)
And I click the 'next' button



Scenario: A user enters an invalid first name
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
And I have entered <first name> into the first name field
And I have entered a valid last name into the last name field
When I click the 'next' button
Then I am shown an <error message>

Examples:
| First name | Error message |
| Blank      | You must enter a first name |
| Includes characters outside Alpha a-z | First name should only include the letters A to Z |



Scenario: A user enters an invalid last name
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
And I have entered <last name> into the last name field
And I have entered a valid first name into the first name field
When I click the 'next' button
Then I am shown an <error message>

Examples:
| Last name | Error message |
| Blank     | You must enter a last name |
| Includes characters outside Alpha a-z | Last name should only include the letters A to Z |



Scenario: A user enters an invalid email or contact number
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
And I have entered <telephone number> into the telephone number field
And I have entered <email> into the email field
When I click the 'next' button
Then I am shown an <error message>

Examples:
| Telephone number                | email                | Error message |
| Blank                           | Blank                | You must enter either a telephone number or email |
| valid tel number                | Blank                | no error |
| invalid telephone number format | Blank                | The telephone number is not in the right format |
| Blank                           | valid email format   | no error |
| Blank                           | invalid email format | the email address is not valid |
| valid tel number                | invalid email format | the email address is not valid |
| invalid telephone number format | valid email format   | the telephone number is not in the right format |



Scenario: A user can see the privacy notice IAG
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
When I view the page
Then I can see the text about the privacy notice



Scenario: `A user can access the bristol privacy page
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
When I click the 'privacy notice' link
Then I am taken to the URL 'https://www.bristol.gov.uk/privacy'
And the URL opens in a new browser window.



Scenario: A user enters the correct details and clicks the 'next' button
GivenStories: uk/gov/bristol/registrations/births/stories/choose_an_appointment_scenarios.story
Given that I am on the 'Check date and give contact details' page
And I have correctly filled in the first name 
And I have correctly filled in the last name
And I have correctly filled in the email
When I click the 'next' button
Then I am taken to the 'Confirmation' page
