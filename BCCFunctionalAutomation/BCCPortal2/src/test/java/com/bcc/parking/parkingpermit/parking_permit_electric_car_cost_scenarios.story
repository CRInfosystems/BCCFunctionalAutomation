Title: Verify the vehicle tax band and cost of permit when user register any electric car

Narrative:
In order to pay the bill for my electric car
AS a customer
I want to know what kind of tax band does it return and how much does it cost 


GivenStories:

Scenario: 1#  Verify the vehicle tax band and cost of permit when user register any electric car
 
Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in 
When user clicks on Get Resident or visitor permits 
When User clicks on Get parking permits button
When Users Clicks Next Button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User Click on Next Button
Then system navigates to the permit details page with with tax band returned as electric
Then system should display <cost> of single vehicle permit 
Then user clicks on sign out button


Examples:
parking/parkingelectriccar.csv