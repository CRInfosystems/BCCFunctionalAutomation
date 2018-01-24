Title: Verify the customer renew 3months permits can update the permit numbers
Narrative: 
As a customer when i am renewing the 3 months permits , i could able to update the permit numbers

GivenStories:

Scenario:1# Verify if the user have one or two permits are expired or furture

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
Then system should navigate to the check order page
When user click on change permit numbers link
Then system should navigate to permits details page



Examples:
parkingrenewals/parking_renewals_threemonths_updatepermitnumbers.csv