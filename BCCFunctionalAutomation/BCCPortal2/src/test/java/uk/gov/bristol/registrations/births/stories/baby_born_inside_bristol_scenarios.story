Title: Birth Registrations - Baby born inside Bristol [REG-124]

Narrative:
As a Birth Registration Customer 
I need to be able to confirm that the birth occured at home or another address within Bristol as well as providing the postcode of the location 
So it can be verified as being within the BCC Registration District


Scenario: A user can specify their baby was born inside of Bristol and provide a postcode
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose 'An address in the Bristol City Council area'
Then the postcode field is displayed

Scenario: If a user provides a blank or invalid postcode then they see an error message
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
And I choose 'An address in the Bristol City Council area'
And the postcode field is displayed
And I enter <invalid> in the postcode field
And I click the 'Find address' button
Then an error message is displayed

Examples:
| invalid |
| Blank		|
| INVALID	|
| S8 0GE	|


Scenario: If a user provides a blank, invalid or valid postcode then they can re-enter a valid one and continue
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
And I choose 'An address in the Bristol City Council area'
And the postcode field is displayed
And I enter <postcode1> in the postcode field
And I click the 'Find address' button
When I enter a <postcode2> in the postcode field
And I click the 'Find address' button
Then I'm taken to the 'Where the baby was born' page
And a drop-down list of addresses are displayed which contains <address>

Examples:
| postcode1 | postcode2 | address                          |
| Blank		| BS4 2DR   | 40 Bayham Road  Bristol  BS4 2DR |
| INVALID	| BS4 2DR   | 40 Bayham Road  Bristol  BS4 2DR |
| S8 0GE	| BS4 2DR   | 40 Bayham Road  Bristol  BS4 2DR |
| BS1 3LP	| BS4 2DR   | 40 Bayham Road  Bristol  BS4 2DR |


Scenario: A user can provide a postcode and get a list of addresses matching that postcode
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
And I choose 'An address in the Bristol City Council area'
And the postcode field is displayed
When I enter a <postcode2> in the postcode field
And I click the 'Find address' button
Then I'm taken to the 'Where the baby was born' page
And a drop-down list of addresses are displayed which contains <address>

Examples:
| postcode2 | address 													|
| BS1 3LP  | Jesus Kingdom Cannon Street City Centre Bristol BS1 3LP	|
| BS4 2DR  | 40 Bayham Road  Bristol  BS4 2DR							|


Scenario: If a user does not select an address then they will see an error when clicking next
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
And I choose 'An address in the Bristol City Council area'
And the postcode field is displayed
And I enter 'BS4 2DR' in the postcode field
And I click the 'Find address' button
And the select address field is displayed
When I choose 'Please select...' from the select address field
And I click the 'next' button
Then an error message is displayed

Scenario: A user can select an address and move to the next step
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
And I choose 'An address in the Bristol City Council area'
And the postcode field is displayed
And I enter 'BS4 2DR' in the postcode field
And I click the 'Find address' button
And the select address field is displayed
When I choose an address from the select address field
And I click the 'next' button
Then I'm taken to the 'About the baby' page

