Title: My Account - Change Phone Number - Verify if the customer enter the invalid Mobile Number appropriate error message is getting displayed

Narrative: 
As a customer i enter the invalid Mobile number Systhem should generate error message

GivenStories:

Scenario: 5 # Verify if the cusotomer enter the invalid Mobile Number appropriate error message is getting displayed

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on update phone link
Then system should navigate to change phone details page
When user enter invalid Mobile : <ExpectedMobile> and clicks on Save Phones
Then system should display error message invalid mobile number
Then user clicks on sign out button


Examples:
customer/invalidmobileno.csv