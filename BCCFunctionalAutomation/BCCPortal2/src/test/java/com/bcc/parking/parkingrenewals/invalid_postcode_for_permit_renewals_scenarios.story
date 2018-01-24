Title: Verify the customer cant use online application by entering the invalid/Out of Zone post code

Narrative: 
As a customer i want to undertanding if the invalid/out of bristol/ out os zone post code is given , system is giving the error message 

GivenStories:

Scenario:1# Verify the system is displays an error messages when user enters postcode outofBristol/ invalid 

Given user opens BCC Service Home Page
When user clicks on renew a resident parking permit
When user clicks on Renew parking permits button
When user enters 1st permit number : <firstpermitnumber>
When user enters 2nd permit number : <secondpermitnumber>
When user enter 3rd permit number : <thirdpermitnumber>
When User Enter Post code : <postcode>
When User clicks on Find Address button
Then System should display error message in renewals : <errorMessage>

Examples:
parkingrenewals/parking_renewals_invalid_postcode.csv

Scenario:2# Verify the system is displays an error messages when user enters postcode outofBristol/ invalid 

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
Then System should display error message : <errorMessage>

Examples:
parkingrenewals/parking_renewals_outofzone_postcode.csv
