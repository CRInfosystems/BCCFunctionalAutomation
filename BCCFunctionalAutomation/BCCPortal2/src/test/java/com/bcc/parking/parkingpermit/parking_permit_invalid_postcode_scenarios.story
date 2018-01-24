Title: Parking - FindAddress - Verify the error messages by giving the invalid post code

Narrative: 
As a customer i want to Apply for parking permit , by putting invalid post code, system should display the error message
	

GivenStories:

Scenario:1# Verify the error messages by giving the invalid post code

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button
When User Enter Post code : <postcode>
When User clicks on Find Address button
Then User should display the error message for the postcode




Examples:
parking/parkingfindaddressinvalidpostcode.csv