Title: Parking - parking permits - verify for the entered address number of permits allocated

Narrative: 
As a customer i want to Apply for parking permit , i want to know how many permits are allocated to
	

GivenStories:

Scenario:1# verify for the entered address number of permits allocated

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits   
When User clicks on Get parking permits button
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When User selects parking type Offstreet : <offstreet> and private : <priavteparking>
When User Click Next button
Then system should display visitor permits entitled to : <expectedmsg>



Examples:
parking/permitsallocated.csv

