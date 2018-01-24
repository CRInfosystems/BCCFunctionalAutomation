Title: Parking permits - Verify error message when Experian validation fails

Narrative:
In order to know whether my vehicle registration details are with experian or not 
As a customer
I want to system to display an error message when vehicle details are not validated 

GivenStories:

Scenario: 1# Verify error message when Experian validation fails

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When User Click Next button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User Click on Next Button
Then experian error message should be displayed 

Examples:
parking/parking_permit_experian_error_message.csv
