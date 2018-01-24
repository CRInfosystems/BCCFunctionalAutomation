Title: Parking - Logged in -  User gets free permits visitor only

Narrative: 
As a customer i want to Apply for parking permit , after technical details are given i can do soft registration so that i can track my order
	

GivenStories:

Scenario:1# Verify user can do soft registration when application for parking 

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits 
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in  
When User clicks on Get visitor permits link
When User Click Next Visitor button
When Users selects Free bundle : <freebundle>
When User Click Next button
When User click on confirm and pay button
Then System should navigate to thankyou page
Then user clicks on sign out button



Examples:
parking/loggedinthankyou.csv