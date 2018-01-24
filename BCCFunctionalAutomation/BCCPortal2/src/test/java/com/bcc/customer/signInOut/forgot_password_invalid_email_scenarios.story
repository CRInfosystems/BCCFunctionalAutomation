Title: Verify Forgort Password - Request Forgotten Password - Verify Invalid email id

Narrative: 
As a customer , I had entered invalid email id systems should display the appropriate error message
	

Scenario: 4# Verify if the customer enter the invalid email id system is displaying the error message 

Given user opens bcc home page
When user clicks sign in button
When user click on get a new password
When user enters invalid email address used for your account <email>
When user clicks on send reset email
Then verify system should display the error message Please enter a valid email address.


Examples:
customer/invalidemailid.csv