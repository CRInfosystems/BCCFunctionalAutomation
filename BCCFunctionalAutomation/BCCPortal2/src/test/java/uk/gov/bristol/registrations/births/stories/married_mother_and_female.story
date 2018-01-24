Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: A mother and female second parent have confirmed that they are married.
GivenStories: uk/gov/bristol/registrations/births/stories/mother_and_female_names_on_register.story
Given that I am on the 'mother and female marriage status' page
When I select the 'yes' option
And I click the 'next' button
Then I am taken to the 'choose office' page