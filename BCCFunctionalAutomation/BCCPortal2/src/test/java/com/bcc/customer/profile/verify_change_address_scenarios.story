Title: My Account - View my profile- Verify Change Address Page - CPDP-811

Narrative: 
In order to view my profile
As a customer with an account, 
I want to view my profile 
	and navigate to change address page

GivenStories:

Scenario:5# Logged in user views profile and verify navigation to change address page

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on update address link
Then system should navigate to change address page
Then user clicks on sign out button

Examples:
customer/viewprofile.csv