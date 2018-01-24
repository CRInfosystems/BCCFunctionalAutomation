Title: Verify the customer renew , is giving the error message if the email id is invalid 
Narrative: 
As a customer i want to get the error message if had give the invalid email id 

GivenStories:

Scenario:1# Verify if the user had given the invalid email , system should give the error message 

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
Then system should give the error message for invalid email


Examples:
parkingrenewals/parking_renewals_one_future_invalidemail.csv