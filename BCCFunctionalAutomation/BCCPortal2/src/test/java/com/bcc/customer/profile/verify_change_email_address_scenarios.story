Title: My Account - View my profile- Verify change Email Page - CPDP-811

Narrative: 
In order to view my profile
As a customer with an account, 
I want to view my profile 
	so that I can check it is correct and update my information

GivenStories:

Scenario:3# Logged in user views profile and navigation to change email address page

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on change link of the email
Then user system should navigate to change email address page
Then user clicks on sign out button

Examples:
customer/viewprofile.csv