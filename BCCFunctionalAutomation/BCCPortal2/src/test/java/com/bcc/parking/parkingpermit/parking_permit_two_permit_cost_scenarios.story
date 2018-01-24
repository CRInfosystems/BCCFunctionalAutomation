Title: Parking permits - Verify the cost of two permits with various tax bands when customer already allocated one permit

Narrative: 
In order to know my cost of permits
As a customer 
I want to know how much a individual vehicle of various tax bands would cost

GivenStories:

Scenario: 1# Verify the cost of a single permit with various tax bands when customer already allocated with one permit

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
Then system should display <cost> of single vehicle permit


Examples:
parking/parkingtwopermitcost.csv


Scenario: 2# Verify the cost of two permits when customer already allocated with one permit 

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button on multizone page
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
When User clicks add additional vehicle
When User enters the registration number : <regno2>
When User enters the V5c Number : <v5c2>
When User enter <firstname2>
When User enter <lastname2>
When User enter <dateofbirth2>
When User Click on Next Button
Then system should display <cost> of two vehicle permits

Examples:
parking/parkingtwopermitcost2.csv


Scenario: 3# Verify cost of 2 permits when user enter 3 vehicles in 2 permits when user already allocated one permit

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button on multizone page
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
When User clicks add additional vehicle
When User enters the registration number : <regno2>
When User enters the V5c Number : <v5c2>
When User enter <firstname2>
When User enter <lastname2>
When User enter <dateofbirth2>
When User clicks add additional vehicle
When User enters the registration number : <regno3>
When User enters the V5c Number : <v5c3>
When User enter <firstname3>
When User enter <lastname3>
When User enter <dateofbirth3>
When User Click on Next Button
Then system should display <cost> of three vehicle permits

Examples:
parking/parkingtwopermitcost3.csv



