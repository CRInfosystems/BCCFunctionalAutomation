Title: Parking - Car details - Enter the valid car details and check user is navigating to the next step

Narrative: 
As a customer i want to Apply for parking permit , I Entered the valid car details and check user is navigating to the next step
	

GivenStories:

Scenario:1# Enter the valid car details and check user is navigating to the next step

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
Then System should navigate to the vehical details page


Examples:
parking/parkingcardetails.csv