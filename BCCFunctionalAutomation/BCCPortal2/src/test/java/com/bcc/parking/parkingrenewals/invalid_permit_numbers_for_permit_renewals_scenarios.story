Title: Verify the customer cant use online application if user has entered invalid/incorrect format permit number 

Narrative: 
As a customer i want to undertanding if the invalid/incorrect format permit number is giving system will display the error message

GivenStories:

Scenario:1# Verify if the invalid/incorrect format permit number is giving system displays the error message

Given user opens BCC Service Home Page
When user clicks on renew a resident parking permit
When user clicks on Renew parking permits button
When user enters 1st permit number : <firstpermitnumber>
When user enters 2nd permit number : <secondpermitnumber>
When user enter 3rd permit number : <thirdpermitnumber>
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When user clicks on next button of renewals
Then system should display the error message for the 1st permit
Then system should display the error message for the 2nd permit
Then system should display the error message for the 3rd permit


Examples:
parkingrenewals/parking_renewals_invalid_permitnumbers.csv