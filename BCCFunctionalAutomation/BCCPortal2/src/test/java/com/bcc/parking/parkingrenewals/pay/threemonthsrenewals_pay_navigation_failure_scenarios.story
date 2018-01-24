Title: Verify the customer is not allowed to move backwards once customer is navigated to capita

Narrative:
In order to move backward from capita to order confirmation page
As a customer
I want Capita to display an error message so that I will be aware of.

GivenStories:

Scenario: 1# Verify the error message when user move backward from capita to order confirmation page

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
When User click back button in Capita portal
Then User payment process should be cancelled

Examples:
parkingrenewals/threemonthsrenewals_pay_navigation.csv
