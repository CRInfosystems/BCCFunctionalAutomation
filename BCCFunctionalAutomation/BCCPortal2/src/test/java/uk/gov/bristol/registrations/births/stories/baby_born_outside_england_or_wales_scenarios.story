Title: Birth Registrations - Baby born outside England or Wales [REG-126]

Narrative:
As a Birth Registration Customer
I need to be able to confirm that the birth occurred outside of England or Wales
So that I can be redirected out of the process and be given the right information on what to do next

Scenario: A user can specify their baby was born outside of England or Wales and proceed to the next page
GivenStories: uk/gov/bristol/registrations/births/stories/start_the_registration_process_scenarios.story
Given that I am on the 'Where the baby was born' page
When I choose 'Outside England or Wales'
And I click the 'next' button
Then I'm taken to the 'Baby born outside England or Wales' page

