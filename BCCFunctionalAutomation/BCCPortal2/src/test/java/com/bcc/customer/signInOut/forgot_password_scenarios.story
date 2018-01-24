Title: Verify Forgort Password - Request Forgotten Password for a valid email id

Narrative: 
As a customer , I had entered correct email id systems should display the appropriate reset password message
	

Scenario: 1# Verify if the customer enter the correct email id system is displaying a message for reset password


Given user opens bcc home page
When user clicks sign in button
When user click on get a new password
When enter email address used for your account <email>
When user clicks on send reset email
Then verify system message for reset password


Examples:
customer/forgotpwd.csv