Title: My Account - Change Phone Number - Verify customer can able to update his mobile details

Narrative: 
As a customer i want to update only my mobile details

GivenStories:

Scenario: 4# Customer updates / changes Mobile number with no phone numbers if they have already provided ones earlier

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
Then users old contact details
When user click on update phone link
Then system should navigate to change phone details page
When user enter Mobile : <ExpectedMobile> and clicks on Save Phones
Then system should navigate to the profile page
Then system should display New Mobile details and Old LandLine details
Then user clicks on sign out button


Examples:
customer/updatemobiledetails.csv
