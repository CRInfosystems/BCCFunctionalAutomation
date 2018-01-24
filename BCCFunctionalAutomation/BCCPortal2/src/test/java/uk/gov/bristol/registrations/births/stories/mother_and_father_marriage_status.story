Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: A mother and father confirm their marriage status.
GivenStories: uk/gov/bristol/registrations/births/stories/mother_and_father_names_on_register.story
Given that I am on the 'mother and father marriage status' page
When I select the 'no' option
And I click the 'next' button
Then I am taken to the 'mother and father are not married' page
And an alert is displayed advising that the father will need to attend the appointment
When I click the 'change' link
Then I am taken to the 'mother and father marriage status' page
And the 'no' option is selected
When I click the 'next' button
Then I am taken to the 'mother and father are not married' page
And an alert is displayed advising that the father will need to attend the appointment
When I click the 'next' button
Then I am taken to the 'choose office' page