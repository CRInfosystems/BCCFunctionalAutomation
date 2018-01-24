Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: A mother and father confirm they were married when the baby was born.
GivenStories: uk/gov/bristol/registrations/births/stories/mother_and_father_names_on_register.story
Given that I am on the 'mother and father marriage status' page
When I select the 'yes' option
And I click the 'next' button
Then I am taken to the 'choose office' page