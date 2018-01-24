Title: My Account - Change Password- Password Mismatch - CPDP-554 - WDP-52

Narrative: 
In order to view my profile
As a customer with an account, 
I want to change password of my account with the new password mismatch

GivenStories:

Scenario: 3# Test if the new pasword is mismatch system should display error message

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on change link of the password
Then user system should navigate to change password page
When user enter current password : <password>
When user enter new password : <newpassword>
When user enter type incorrect password again : <incorrectpassword>
When user click on save changes button
Then system displays error message Passwords - don't match
Then user clicks on sign out button

Examples:
customer/pwdmismatch.csv