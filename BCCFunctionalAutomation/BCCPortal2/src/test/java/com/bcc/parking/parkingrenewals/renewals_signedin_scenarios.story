Title: Verify signed in user can renew for the 12 months permits
Narrative: 
As a signed in customer i could able to renew my 12 months permits 
GivenStories:

Scenario:1# Verify if the user have one or two permits are expired or furture

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in 
When user clicks on renew a resident parking permit
When user clicks on Renew parking permits button
When user enters 1st permit number : <firstpermitnumber>
When user enters 2nd permit number : <secondpermitnumber>
When user enter 3rd permit number : <thirdpermitnumber>
When user clicks on next button of renewals in the permits details page
Then system should navigate to the check order page 
When User click on confirm and pay button on renewals
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
parkingrenewals/parking_renewals_signedin.csv