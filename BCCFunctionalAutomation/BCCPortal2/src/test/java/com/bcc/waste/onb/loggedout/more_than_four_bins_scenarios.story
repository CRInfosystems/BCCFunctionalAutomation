Title: ONB  Have quantity- Verify User cant order more than 4 bins - WDP-188

Narrative: 
As a customer i used not have to privilage to order more than 4 bins

GivenStories:

Scenario: 3# Verify user cant order more than 4 bins except for Black Wheel Bin even though user is not logged in
Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on order now button
Then verify user cant select more than four bin for each type


Examples:
waste/morethanfourebins.csv