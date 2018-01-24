Title: Birth Registrations - Where was your baby born? [REG-3]

Narrative:
As a As a Birth Registration Customer 
I want to be able to choose which Hospital the birth occured 
So that the registration service know where the baby was born and can use the information to help locate the birth on the national RON system

Scenario: A user who does not select a hospital sees a error message
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When none of the hospital radio buttons are pre-selected
And I click the 'next' button
Then I see an error message saying 'please enter where the birth happened'

Scenario: A user can select a hospital and proceed to the next page
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose '<hospital>'
And I click the 'next' button
Then I'm taken to the 'About your baby' page

Examples:
hospital |
St Micheals Hospital |
Southmead Hospital |
Cossham Hospital |
