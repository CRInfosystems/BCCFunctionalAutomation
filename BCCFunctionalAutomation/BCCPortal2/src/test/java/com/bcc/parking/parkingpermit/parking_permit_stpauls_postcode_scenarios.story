Title: Verify the customer cant use online application by entering the invalid StPauls post code

Narrative: 
As a user who does not live in StPauls, I want to understand that I cant use the online application

GivenStories:

Scenario:1# Verify the system displays an error messages when user enters post code out of Bristol 

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get visitor permits link
When User Enter Post code : <postcode>
When User clicks on Find Address button
Then System should display <errorMessage>

Examples:
parking/parking_permit_stpauls_postcode.csv

Scenario:2# Verify the system displays an error messages when user enters invalid postcode

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button on multizone page
When User clicks on Get visitor permits link
When User Enter Post code : <postcode>
When User clicks on Find Address button
Then System should display invalid UK address errormessage

Examples:
parkingrenewals/parking_renewals_stpauls_invalidpostcode.csv



Scenario: 3# Verify the system displays an error message when user enters post code out of St-Pauls zone

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get parking permits button on multizone page
When User clicks on Get visitor permits link
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When User Click Next Visitor button
Then System should display out of zone error message

Examples:
parkingrenewals/parking_renewals_stpauls_outofzone_postcode.csv

