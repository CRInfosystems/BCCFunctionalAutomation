Title: Verify customer can able to abandon the payment process

Narrative:
In order to abandon the payment process
As a customer 
I want to cancel my payment

GivenStories:

Scenario: 1# Verify the customer can abandon the process after accepting card details

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in 
When user clicks on Get Resident or visitor permits  
When User clicks on Get parking permits button on multizone page
When User clicks on Get parking permits button
When Users Clicks Next Button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User clicks add additional vehicle
When User enters the registration number : <regno2>
When User enters the V5c Number : <v5c2>
When User enter <firstname2>
When User enter <lastname2>
When User enter <dateofbirth2>
When User Click on Next Button
When User Click Add Visitor permits button in permits details page
When Users selects Free bundle : <freebundle>
When Users Clicks Next Button
When User click on confirm and pay button
When User enter card number : <cardnumber>
When User enter <month> of expiry
When User enter <year> of expiry
When User enter security <code>
When User click Continue in Capita portal
When User Enter <cardholdername>
When User click Next in Capita confirmation page
When User click on cancel payment
Then the payment process should be abandoned

Examples:
parking/pay_abandon.csv



