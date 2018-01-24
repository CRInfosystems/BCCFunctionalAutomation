Title: Verify the system displaying error message when user enter visitor permits more than allocated

Narrative: In order to apply the maximum number of permits
As a customer
I want to system allow me enter maximum number of visitor permits including maximum number 


GivenStories:


Scenario: 1# Verify the system displaying error message when user enter visitor permits more than allocated

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When User clicks on Get visitor permits link
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress>
When User Click Next Visitor button
When Users selects Free bundle : <freebundle>
When Users enter paid permits : <paidpermits>
When User Click Next button
Then system should display maximum limit error message


Examples:
parking/parking_permit_maximum_limit_visitor_permits.csv