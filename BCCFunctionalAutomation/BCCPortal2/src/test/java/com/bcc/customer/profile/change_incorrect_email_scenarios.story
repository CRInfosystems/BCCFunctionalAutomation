Title: My Account - Change Email- CPDP-82

Narrative: 
In order to view my profile
As a customer with an account, 
I want to change my emailid for my account
	

GivenStories:

Scenario:1# Change Email id for my account

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on change link of the email
Then user system should navigate to change email address page
When user enter new change email details : <newemail>
When user click on save changes button in the email page
Then system should display the error message for incorrect email address
Then user clicks on sign out button



Examples:
customer/changeincorrectemail.csv