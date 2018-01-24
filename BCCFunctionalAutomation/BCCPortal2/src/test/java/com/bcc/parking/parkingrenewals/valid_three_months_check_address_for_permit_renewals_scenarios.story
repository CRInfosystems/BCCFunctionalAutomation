Title: Verify the customer naviagte to the next page if the valid 3 months permit numbers are given - logout 

Narrative: 
As a customer i want to undertanding that i can able to navigate to the next page if the valid 3months permit numbers are given

GivenStories:

Scenario:1# Verify user can able to navigate to the next page if the valid 3 months permit numbers are given

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
Then system should display the same address selected in the permit details page




Examples:
parkingrenewals/parking_renewals_threemonths_permits.csv