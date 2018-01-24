Title: Parking Permits - Verify the permit cost when user allocated with a single permit with various tax bands

Narrative:
In order to apply for a single resident permit
As a customer
I want to know how much does it costs for various tax bands

GivenStories:

Scenario: 1# Verify the cost displayed for a single vehicle permit of different tax bands

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress>
When User selects parking type Offstreet : <offstreet> and private : <priavteparking>
When User Click Next button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User Click on Next Button
Then system should display <cost> of single vehicle permit

Examples: 
parking/parking_permit_bob_cost.csv

Scenario: 2# Verify the cost of single permit when customer adds two vehicles

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
Then system should display <cost> of single vehicle permit

Examples: 
parking/parking_permit_bob2_cost.csv

Scenario: 3# Verify the cost of single permit when customer already allocated two permits before

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
When User Click on Next Button
Then system should display <cost> of single vehicle permit

Examples: 
parking/parking_permit_bob3_cost.csv

