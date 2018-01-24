Title: Birth Registrations - Choose an appointment [REG-41]

Narrative:
As a Birth Registration Customer
I want to be able to choose an appointment to book from a list of available appointments
So that I can reserve the chosen appointment slot before confirming the booking

Scenario: A user who selects an appointment slot should see the appointment displayed at the bottom of the page
GivenStories: uk/gov/bristol/registrations/births/stories/choose_a_register_office_scenarios.story
Given that I am on the 'Choose an appointment' page
When I select an available slot
Then it should display my chosen appointment time and date at the bottom of the page

Scenario: A user who selects an appointment slot and clicks next should see the 'Check date and give contact details' page and the selected appointment details
GivenStories: uk/gov/bristol/registrations/births/stories/choose_a_register_office_scenarios.story
Given that I am on the 'Choose an appointment' page
When I select an available slot
And I click the 'next' button
Then I am taken to the 'Check date and give contact details' page
And I see the chosen appointment