Title: Verify the customer get charged 1.8% extra surcharge on credit card payment

Narrative:
In order to pay with credit card
AS a customer
I want to know if my credit card been charged with 1.8% extra surcharge 


GivenStories:

Scenario: 1# Verify the customer get charged 1.8% extra surcharge on credit card payment
 
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
When User Enter <cardholdername>
When User click Next in Capita confirmation page
Then verify extra surcharge is applied for the credit card
When User clicks on  Make payment in capita your payment page
When User enter extra securitypassword



Examples:
parking/threemonthsrenewals_payverifycreditcard.csv
