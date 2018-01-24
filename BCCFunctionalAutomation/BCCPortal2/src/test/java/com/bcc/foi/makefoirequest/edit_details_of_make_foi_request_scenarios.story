Title: FOI - Make FOI Request -  Veify user can able to edit his details by clicking on edit your details page ( story id : 2042 )

Narrative: 
As a customer i want to make the FOI request and edit my details to update the details 

GivenStories:

Scenario:1# Veify user can able to edit his details by clicking on "edit your details" Link

Given user opens bcc home page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user select FOI menu
When user click on make a new foi request button
Then user should be in make FOI Request Page
When user enter your request : <request>
When user click on Preview your request Button 
Then system should navigate to Preview your request page
When user click on edit these details link
When user updated your request details : <updateyourrequest>
When user click on Preview your request Button 
Then system should navigate to Preview your request page
Then system display the updated your request details
When user clicks on Submit your request button
Then user should navigate to thank you page
Then system should display Reference Number and the What Happens Next
Then user clicks on sign out button


Examples:
foi/foi_resubmit.csv