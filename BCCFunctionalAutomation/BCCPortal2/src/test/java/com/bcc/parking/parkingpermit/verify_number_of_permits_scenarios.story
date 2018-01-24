Title: Parking - parking permits - verify for the provided address number of permits entitled to

Narrative: 
As a customer i want to Apply for parking permit , i want to know how many permits are entitle for my address
	

GivenStories:

Scenario:1# verify for the provided address number of permits entitled to

Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits   
When User clicks on Get parking permits button
When User Enter Post code : <postcode>
When User clicks on Find Address button
When User selects address :<lookupaddress> 
When User selects parking type Offstreet : <offstreet> and private : <priavteparking>
When User Click Next button
Then User gets details of the parking permits entitled to : <expectedmsg>



Examples:
parking/parkingpremitsentitled.csv