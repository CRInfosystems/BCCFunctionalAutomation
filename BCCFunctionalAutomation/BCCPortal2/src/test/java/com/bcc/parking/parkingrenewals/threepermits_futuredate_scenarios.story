Title: Verify the customer cannot renewal their permits when permits are future date

Narrative: 
As a customer when permits are future date cannot renewal permits

GivenStories:

Scenario:1# Verify if the permits are future date cannot renewal his permits

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
Then system should display the link for apply for new permits


Examples:
parkingrenewals/parking_renewals_future_permitnumbers.csv