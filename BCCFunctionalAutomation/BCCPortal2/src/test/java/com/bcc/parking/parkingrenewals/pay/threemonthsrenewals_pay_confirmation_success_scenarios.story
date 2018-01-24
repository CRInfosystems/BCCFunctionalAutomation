Title: Verify the confirmation of success after successful payment of customer

Narrative:
In order to know my payment is success
AS a customer
I want to view the confirmation page saying your payment is success and order reference number so that I contact if I have any issues


GivenStories:

Scenario: 1# Verify the order reference number after successful payment

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
When User clicks on  Make payment in capita your payment page
Then User payment successfully processed by capita

Examples:
parkingrenewals/threemonthsrenewals_pay_confirmation_success.csv
