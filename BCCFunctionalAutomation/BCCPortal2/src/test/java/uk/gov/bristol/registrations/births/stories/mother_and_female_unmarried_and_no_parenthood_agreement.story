Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: A mother and father confirm their marriage status.
GivenStories: uk/gov/bristol/registrations/births/stories/mother_and_female_names_on_register.story
Given that I am on the 'mother and female marriage status' page
When I select the 'no' option
And I click the 'next' button
Then I am taken to the 'mother and female parent not married' page
When I click the 'next' button
Then I remain on the 'mother and female parent not married' page
And an error message is displayed
When I select the 'no' option
And I click the 'next' button
Then I am taken to 'parenthood agreement' page
And a parenthood agreement required error message is displayed
And no warning is displayed
When I click the 'change' link
Then I am taken to the 'mother and female parent not married' page
And no parenthood agreement required error message is displayed
When I select the 'yes' option
And I click the 'next' button
Then I am taken to 'parenthood agreement' page
And a warning is displayed advising that the second female parent will need to attend the appointment
And no error messages are displayed