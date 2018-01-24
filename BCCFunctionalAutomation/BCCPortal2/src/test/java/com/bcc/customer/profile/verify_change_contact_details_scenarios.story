Title: My Account - View my profile- Verify Contact Details Page - CPDP-811

Narrative: 
In order to view my profile
As a customer with an account, 
I want to view my profile 
	so that I want to navigate to change contact page

GivenStories:

Scenario: 4# Logged in user views profile and verify navigation to change contact page

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on update phone link
Then system should navigate to change phone deails page
Then user clicks on sign out button


Examples:
customer/viewprofile.csv