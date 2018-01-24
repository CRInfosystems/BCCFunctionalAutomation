Title: My Account - View my profile - CPDP-811

Narrative: 
As a customer with an account, i want to see my account details

Scenario: 1# Verify user can see his details in the view profile page

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
Then system displays account profile
Then user clicks on sign out button

Examples:
customer/viewprofile.csv
