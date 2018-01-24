Title: Sign In - Registered customer sign in 

Narrative: 
As a customer , I had entered sign in to my account
	

Scenario: 1# Verify registered customer can able to Sign in his account


Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
Then system logs user in and displays information that user is logged in



Examples:
customer/logon.csv