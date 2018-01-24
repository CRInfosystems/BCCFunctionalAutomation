Title: My Account - Change Phone Number - Verify if the customer enter invalid phone number appropriate error message is getting displayed
Narrative: 
As a customer i enter a invalied phone number , System should display the error message

GivenStories:

Scenario: 6# Verify if the customer enter invalid phone number appropriate error message is getting displayed

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on update phone link
Then system should navigate to change phone details page
When user enter landline : <ExpectedLandline> and clicks on Save Phones
Then system should display error message invalid phone number
Then user clicks on sign out button


Examples:
customer/invalidphoneno.csv