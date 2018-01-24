Title: Verify the customer can able to request Free and Paid Visitor Permits 

Narrative: As a customer Carlos, I want to apply for only visitor permits, because I do not own a car

GivenStories:

Scenario: 1# Verify existing customer is able to request free and paid visitor permits without having to apply for a residents parking permit

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in 
When user clicks on Get Resident or visitor permits 
When User clicks on Get visitor permits link
When User Click Next Visitor button
When Users selects Free bundle : <freebundle>
When Users enter paid permits : <paidpermits>
When Users Clicks Next Button
Then system should successfully navigates to order confirmation page
Then user clicks on sign out button


Examples:
parking/parking_permit_carlos.csv


