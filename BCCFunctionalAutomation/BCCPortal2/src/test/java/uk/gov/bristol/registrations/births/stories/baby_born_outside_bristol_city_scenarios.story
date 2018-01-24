Title: Birth Registrations - Baby born outside Bristol City [REG-125]

Narrative:
As a Birth Registration Customer
I need to be able to confirm that the birth occurred outside the Bristol Registration District but within England or Wales
So that the Registration Service know whether to ask me to confirm if I wish to make a declaration

Scenario: If a user does not give a birth address then display an error message
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose 'Outside Bristol City Council area, but in England or Wales'
And I click the 'next' button
Then an error message is displayed

Scenario: If a user gives an address of longer than 400 then display an error message
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose 'Outside Bristol City Council area, but in England or Wales'
And I enter <address> in the birth address field
And I click the 'next' button
Then an error message is displayed

Examples:
| address |
| Oak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEE |

Scenario: A user can specify their baby was born outside of Bristol, provide a valid address and proceed to the next page
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose 'Outside Bristol City Council area, but in England or Wales'
And I enter <address> in the birth address field
And I click the 'next' button
Then I'm taken to the 'Baby born outside Bristol City' page

Examples:
| address |
| 36 Florence Road, Sheffield, S8 0GE |
| Oak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0GEOak Tree Cottage 36 Florence Road Sheffield S8 0G |

Scenario: A user can choose to make a 'declaration' 
Given that I am on the 'Baby born outside Bristol City' page
When I click the 'Book an appointment' button
Then I'm taken to the 'About the baby' page
