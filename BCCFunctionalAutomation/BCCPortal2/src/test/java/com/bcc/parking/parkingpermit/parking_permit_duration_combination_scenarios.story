Title: Verify the user can able to purchase permits with combination of 3 and 12 months 

Narrative:
In order to purchase permits with flexibility
AS a customer
I want system to allow the combination of 3 and 12 months permit durations


GivenStories:

Scenario: 1#  Verify the user can able to purchase permits with combination of 3 and 12 months
 
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
When User clicks add additional vehicle
When User enters the registration number : <regno2>
When User enters the V5c Number : <v5c2>
When User enter <firstname2>
When User enter <lastname2>
When User enter <dateofbirth2>
When User Click on Next Button
When User selects 3month duration
When User Click Add Visitor permits button in permits details page
When Users selects Free bundle : <freebundle>
When Users enter paid permits : <paidpermits>
When Users Clicks Next Button
When User click on confirm and pay button
When User enter card number : <cardnumber>
When User enter <month> of expiry
When User enter <year> of expiry
When User enter security <code>
When User click Continue in Capita portal
When User Enter <cardholdername>
When User click Next in Capita confirmation page
When User clicks on  Make payment in capita your payment page
Then User payment successfully processed by capita


Examples:
parking/parking_duration_combination.csv