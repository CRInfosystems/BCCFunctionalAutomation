Title: Verify the amount displayed in Capita portal is same as amount calculated by digital platform

Narrative:
In order to pay for the permits I applied 
As a customer
I want to pay for them at the same time and wanted to know amount displaying in Capita portal is same as  digital platform

GivenStories:

Scenario: 1# Verify the customer can able to process payment successfully in capita 

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
parkingrenewals/threemonthsrenewals_pay_apply_sametime.csv





