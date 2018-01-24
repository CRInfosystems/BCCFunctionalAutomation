Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: The mother only, would like to register the birth of her child.
GivenStories: uk/gov/bristol/registrations/births/stories/about_your_baby_scenarios.story
Given that I am on the 'whose name do you want to register' page
And no register name options have been selected
When I click the 'next' button
Then I remain on the 'whose name do you want to register' page
And an error message is displayed
When I select 'just mother'
And I click the 'next' button
Then I am taken to the 'choose office' page
