Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: A mother and second female parent would like to register the birth of their child.
GivenStories: uk/gov/bristol/registrations/births/stories/about_your_baby_scenarios.story
Given that I am on the 'whose name do you want to register' page
And no register name options have been selected
When I click the 'next' button
Then I remain on the 'whose name do you want to register' page
And an error message displayed, asking for whose names should be on the register
When I select 'mother and female'
And I click the 'next' button
Then I am taken to the 'mother and female marriage status' page
And no mother and female marriage status options have been selected
When I click the 'change' link
Then I am taken to the 'whose name do you want to register' page
And no error messages are displayed
And the 'mother and female' option is selected
When I click the 'next' button
Then I am taken to the 'mother and female marriage status' page
And no mother and female marriage status options have been selected
When I click the 'next' button
Then an error message is displayed
