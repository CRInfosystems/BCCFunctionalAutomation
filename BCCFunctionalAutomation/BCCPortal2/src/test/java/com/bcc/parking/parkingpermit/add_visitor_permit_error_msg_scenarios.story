Title: Parking - Soft Registration -  Veify user can add invalid visitor permits and check system is displaying error message

Narrative: 
As a customer i want to Apply for parking permit , and i added invalid visitor permits accidentally.

GivenStories:

Scenario:1# Verify user can add invalid visitor permits and check system is displaying error message

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
When User Click Add Visitor permits button in permits details page
When Users selects Free bundle : <freebundle>
When Users enter paid permits : <paidpermits>
Then Click on Finish and pay button
Then System should display the error message




Examples:
parking/addvisitorspermiterrormsg.csv