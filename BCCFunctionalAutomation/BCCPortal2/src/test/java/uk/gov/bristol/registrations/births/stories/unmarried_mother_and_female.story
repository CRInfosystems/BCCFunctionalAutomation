Title: Birth Registrations - Parent names on the register [REG-127, REG-128, REG-129 & REG-131]

Scenario: An umarried mother and second female parent confirm if they have a parenthood agreement.
GivenStories: uk/gov/bristol/registrations/births/stories/mother_and_female_names_on_register.story
Given that I am on the 'mother and female marriage status' page
When I select the 'no' option
And I click the 'next' button
Then I am taken to the 'mother and female parent not married' page
And no options have been selected
When I click the 'next' button
Then an error message is displayed asking you to confirm if there is a parenthood agreement
When I click the 'change' link
Then I am on the 'mother and female marriage status' page
And the 'no' option is selected
When I click the 'next' button
Then I am taken to the 'mother and female parent not married' page
And no error message is displayed
When I select the 'no' option
And I click the 'next' button  
Then I am taken to the 'parenthood agreement status' page

And an error message is displayed
And the 'next' button is not displayed
When I click the 'change' link
Then I am taken to the 'mother and female parent not married' page
And the 'no' option is selected
When I select the 'yes' option
Then I am taken to the 'parenthood agreement status' page
And an alert is displayed advising that the second female parent will need to attend the appointment
When I click the 'next' button
Then I am taken to the 'choose office' page