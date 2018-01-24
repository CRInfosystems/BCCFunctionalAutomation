Title: My Account - Change Phone Number - Verify new customer is not having any default contact details

Narrative: 
As a new customer i want to see my details in view profile page


Scenario: 1# For new customer, verify system is not displaying any default contact details

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
Then verify contact details for the new customer
Then user clicks on sign out button


Examples:
customer/newcustomercontactdetails.csv