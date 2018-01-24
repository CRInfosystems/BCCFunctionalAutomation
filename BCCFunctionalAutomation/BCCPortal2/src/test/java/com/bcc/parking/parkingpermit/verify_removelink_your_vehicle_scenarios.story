Title: Parking - parking permits - verify remove link 

Narrative: 
As a customer , if i enter more than one vehical details user should able to remove his vehical details if not required - story id : 2959 
	

GivenStories:

Scenario:1# For the sign in user , if the user has entered one vehical details remove vehical link should not present , if the user has entered more than one vehical details remove link should present


Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in 
When user clicks in resident permit header
When User clicks on Get parking permits button
When Users Clicks Next Button
When User enters the registration number : <regno>
When User enters the V5c Number : <v5c>
When User enter <firstname>
When User enter <lastname>
When User enter <dateofbirth>
When User clicks add additional vehicle
Then remove link should present in both the vehicals
When User clicks on remove vehical link of the first vehical
Then remove link should not present on the first vehical details 
When User Click on Next Button
Then System should navigate to the Check permit details
Then user clicks on sign out button


Examples:
parking/parking_remove_vehical.csv