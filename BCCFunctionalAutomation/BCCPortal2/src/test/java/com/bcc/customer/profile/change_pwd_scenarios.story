Title: My Account - Change Password - CPDP-554 - WDP-52

Narrative: 
In order to view my profile
As a customer with an account, 
I want to change password of my account

GivenStories:

Scenario: 1# verify Change Password

Given user opens bcc home page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on change link of the password
Then user system should navigate to change password page
When user enter current password :<password>
When user enter new password : <newpassword>
When user enter type password again : <newpassword>
When user click on save changes button
Then system displays password changed successfully
Then user clicks on sign out button

Examples:
customer/changepwd.csv