Title: Parking - Car details -  Verify the Error Message by giving the invalid registration Number

Narrative: 
As a customer i want to Apply for parking permit , i had entered the car details but entered the invalid registration number
	

GivenStories:

Scenario:1# Verify the Error Message by giving the invalid registration Number

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When User selects parking type Offstreet : <offstreet> and private : <priavteparking>
When Users Clicks Next Button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User Click on Next Button
Then System should display the error message


Examples:
parking/parkingcardetailsinvalidregno.csv