Title: Birth Registrations - Choose a register office? [REG-40]

Narrative:
As a Birth Registration Customer
I want to be able to choose an appropriate office to attend the registration appointment
So that I can view that office's available appointment slots

Scenario: A user who does not select an office sees a error message
GivenStories: uk/gov/bristol/registrations/births/stories/who_can_register_scenarios.story
Given that I am on the 'Choose a register office' page
When none of the office radio buttons are pre-selected
And I click the 'next' button
Then I see an error message saying 'please select an office'

Scenario: A user can select an office and proceed to the next page
GivenStories: uk/gov/bristol/registrations/births/stories/who_can_register_scenarios.story
Given that I am on the 'Choose a register office' page
When I choose '<office>'
And I click the 'next' button
Then I am taken to the 'Choose an appointment' page
And I see appointments for '<office>'

Examples:
| office |
| Corn Street Register Office |
| Southmead Hospital Register Office |

Scenario: A user sees a map of the available offices
GivenStories: uk/gov/bristol/registrations/births/stories/who_can_register_scenarios.story
Given that I am on the 'Choose a register office' page
When I view the page
Then I am shown an image of a map showing the available locations