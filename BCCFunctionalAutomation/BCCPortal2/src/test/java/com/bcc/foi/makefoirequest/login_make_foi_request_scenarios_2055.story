Title: FOI - Make FOI Request -  Veify logged in user can able to make the FOI request  ( story id : 2055 )

Narrative: 
As a customer i want to make the FOI request log in to the system

GivenStories:

Scenario:2# Veify logged in user can able to make the FOI request

Given user opens bcc foi home page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user click on make a new foi request button
Then user should be in make FOI Request Page
When user enter your request : <request>
When user wants to upload the documents : <uploaddoc>
When user click on Preview your request Button 
Then system should navigate to Preview your request page
When user clicks on Submit your request button
Then user should navigate to thank you page
Then system should display Reference Number and the What Happens Next
Then user clicks on sign out button


Examples:
foi/foi_request_loggedin.csv