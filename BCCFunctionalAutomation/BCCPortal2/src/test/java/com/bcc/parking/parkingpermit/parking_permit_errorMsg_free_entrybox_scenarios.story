Title: Parking Permits - Verify the error message Please enter a number for Free permits when user entered alphabets, special characters, AlphaNumerics in the Free visitor permit entry box

Narrative:
As a customer, I want to apply for individual free visitor parking permits, because I may want to

GivenStories:

Scenario: 1# Verify the error message when user entered alphabets, special characters, AlphaNumerics, less than minimum value, and more than maximum value in the Free visitor permit entry box

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Just Visitor Permits button
When User enter Post code : <postcode>
When User clicks on Find Address Button 
When User selects address :<lookupaddress>
When User clicks Next button
When User enter <FreeVisitorPermits>
Then Click on Finish and Pay button
Then System should display error message:<errorMessage>

Example:

Scenario: 2# Verify the functionality of "Visitor Permits" by entering the valid inputs in the Free Visitor permits Entry box 
 
Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on the parking menu
When User clicks on Just Visitor Permits button
When User enter Post code : <postcode>
When User clicks on Find Address Button 
When User selects address :<lookupaddress>
When User clicks Next button
When User enters Free Visitor Permits: <freeVisitorPermits>
Then Click on Finish and Pay button
Then System should display Order Confirmation message

