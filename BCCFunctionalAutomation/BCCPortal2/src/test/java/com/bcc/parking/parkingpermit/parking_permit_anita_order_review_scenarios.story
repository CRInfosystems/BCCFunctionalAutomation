Title: Parking permits - Verify the parking permits order confirmation page consists of cost, address delivered to and order details

Narrative: As a customer, I want to review my (multiple permit) order, so that I am confident that it is correct

GivenStories:

Scenario: 1# Verify the customer ordered permits, cost and address delivered were correct

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
Then system should show the order confirmation page with cost, address and order details 

Examples:
parking/parkingpermitanitaorderreview.csv









