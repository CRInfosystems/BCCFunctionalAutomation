Title: Verify the error message displayed by capita when user enter invalid card details

Narrative:
In order to enter the valid card details in capita portal
As a customer
I want Capita to display an error message if in case I enter invalid card number

GivenStories:

Scenario: 1# Verify the error when user enter invalid card details

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
Then capita payment process should fail displaying: <capitaerrormessage>

Examples:
parkingrenewals/threemonthsrenewals_pay_confirmation_failure.csv

 