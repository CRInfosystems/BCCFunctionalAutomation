Title: Verify the user can able to retry payment process in capita if user wrong card details unexpectedly

Narrative:
In order to retry my payment process in capita 
As a customer
I want capita to display an error message so that I can re-enter my card details again

GivenStories:

Scenario: 1# Verify the user can able to retry payment process in capita if user wrong card details unexpectedly

Given user opens BCC Service Home Page
When user clicks on renew a resident parking permit
When user clicks on Renew parking permits button
When user enters 1st permit number : <firstpermitnumber>
When user enters 2nd permit number : <secondpermitnumber>
When user enter 3rd permit number : <thirdpermitnumber>
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When user clicks on next button of renewals
Then system should navigate to the check order page 
When user enters email address
When user clicks on next button of renewals
When User click on confirm and pay button
When User enter card number : <cardnumber>
When User enter <month> of expiry
When User enter <year> of expiry
When User enter security <code>
When User click Continue in Capita portal
Then capita gateway should display error message
When user re-enter <cardnumber1>
When User enter security <code>
When User click Continue in Capita portal
When User Enter <cardholdername>
When User click Next in Capita confirmation page
When User clicks on  Make payment in capita your payment page
Then User payment successfully processed by capita

Examples:
parkingrenewals/threemonthsrenewals_pay_retry_payment.csv


 


