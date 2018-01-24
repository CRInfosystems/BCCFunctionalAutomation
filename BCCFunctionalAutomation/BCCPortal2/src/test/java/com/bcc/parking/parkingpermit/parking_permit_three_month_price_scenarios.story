Title: Verify the price of permits with different tax bands for 3 month durations

Narrative:
In order to purchase the 3 month permit
AS a customer
I want to know what each band would cost 


GivenStories:

Scenario: 1#  Verify the price of permits with different tax bands for 3 month durations
 
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
When User selects 3month duration
Then system should display <cost> of single vehicle permit 
Then user clicks on sign out button


Examples:
parking/parking_three_month.csv