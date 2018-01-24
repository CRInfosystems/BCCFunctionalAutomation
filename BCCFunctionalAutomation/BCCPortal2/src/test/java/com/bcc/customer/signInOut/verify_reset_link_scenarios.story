Title: Verify Forgort Password - Reset Password Link

Narrative: 
As a customer , I had entered correct email id systems should display the appropriate reset password message, and click on resert password link system should redirect to the change password page
	

Scenario: 3# If the customer enter the correct email id system is displaying a message for reset password, Verify Reset Password link is redirecting to the change password page



Given user opens bcc home page    
When user clicks sign in button
When user click on get a new password
When enter email address used for your account <email>
When user clicks on send reset email
Then verify system message for reset password
When user click on reset link
Then system should naviagte to the forgotpassword page


Examples:
customer/forgotpwd.csv
