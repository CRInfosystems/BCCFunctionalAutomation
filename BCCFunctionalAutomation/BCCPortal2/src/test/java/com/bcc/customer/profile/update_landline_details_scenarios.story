Title: My Account - Change Phone Number - Verify customer can able to update only his landline details

Narrative: 
As a customer i want to update only my landline details

GivenStories:

Scenario: 3# Customer updates / changes land line number with only one entry if they have already provided ones earlier

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
Then users old contact details
When user click on update phone link
Then system should navigate to change phone details page
When user enter landline : <ExpectedLandline> and clicks on Save Phones
Then system should navigate to the profile page
Then system should display new landline details and old mobile details
Then user clicks on sign out button


Examples:
customer/updatelandlinedetails.csv