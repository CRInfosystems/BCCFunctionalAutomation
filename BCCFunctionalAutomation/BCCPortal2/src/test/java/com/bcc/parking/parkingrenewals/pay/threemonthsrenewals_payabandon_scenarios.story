Title: Verify the customer can abandon his payment at any time 
Narrative: 
As a customer i want to undertanding that i can abandon my payment at any time 

GivenStories:

Scenario:1# Verify user can abandon his payment in the middle of the transaction

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
When User click on confirm and pay button on renewals
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
parkingrenewals/threemonthsrenewals_payabandon.csv