Title: Verify the vehicles registered before 2001 march doesn't return any tax band

Narrative:
In order to purchase residents permit for my vehicle which is registered before 2001 march
AS a customer
I want to know what kind of tax band does it return, if it doesn't return any tax band display the flat fee for the permit 


GivenStories:

Scenario: 1#  Verify the vehicles registered before 2001 march doesn't return any tax band
 
Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits 
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in  
When User clicks on Get parking permits button
When Users Clicks Next Button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User Click on Next Button
Then system navigates to the permit details page with with tax band returned as unclassified 
Then user clicks on sign out button

Examples:
parking/parkingunclassified.csv