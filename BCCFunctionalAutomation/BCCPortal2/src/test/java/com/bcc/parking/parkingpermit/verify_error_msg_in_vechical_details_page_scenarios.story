Title: Parking - Soft Registration -  Verify user can not do soft registration if the user details are invalid 

Narrative: 
As a customer I want to Apply for parking permit , after technical details are given I can do soft registration so that I can track my order, but if the user has provided incorrect details , user can not complete soft registration
	

GivenStories:

Scenario:1# Verify user can not do soft registration if the user details are invalid 

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
Then check the error messages in the vehcial details page



Examples:
parking/parking_invalid_car_details.csv