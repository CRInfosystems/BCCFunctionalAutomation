Title: Sign Out - Sign in Customer , should able to sign out 

Narrative: 
As a customer , I had entered sign in to my account, i shouls able to sign out
	

Scenario: 1# Verify sign in user can able to sign out from 


Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user selects sign-out to log out of his/her account
Then system returns them to the home page (default Liferay functionality)


Examples:
customer/logon.csv