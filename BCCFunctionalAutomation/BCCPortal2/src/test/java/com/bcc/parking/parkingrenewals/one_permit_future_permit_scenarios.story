Title: Verify the customer renew , if the user have one or two permits are expired or furture
Narrative: 
As a customer i should able to renew my valid permits , even if the other tow or one is having future date or expire date

GivenStories:

Scenario:1# Verify if the user have one or two permits are expired or furture

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
When user enters date of birth for the first vehicals
When user enters date of birth for the second vehicals
When User Click on view order summary button in renewals page
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
parkingrenewals/parking_renewals_one_future_permitnumbers.csv