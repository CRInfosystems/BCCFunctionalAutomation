Title: Birth registration - Who can register [REG-31]

Narrative: 
As a Birth Registration Customer 
I want to be able to view IAG on the requirements for registering a birth in terms of who can register, attendance options and required documentation
So that I can check and confirm I'm eligible to register	

Scenario: Verify the user sees the IAG and can navigate to the next page
GivenStories: uk/gov/bristol/registrations/births/stories/about_your_baby_scenarios.story
Given I am on the 'Who can register' page
When I click the 'next' button
Then I am taken to the 'choose office' page
