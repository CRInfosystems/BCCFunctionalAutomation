Title: Feedback -(logout) Verify user can make feedback via email

Narrative: 
As a customer i should able to make the feedback via email even if i have not logged in to the application
	

GivenStories:

Scenario:1# (logout) Verify user can make the feedback via email

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on feedback button
When user enters your feedback : <feedback>
Then check the sign in email is displayed in the feedback page
When user enters phone number : <phonenumber>
When user clicks on preview your feedback button
Then system should navigate to preview your feedback page
Then check the sign in email is displayed in the preview page
When user clicks on submit your feedback button
Then system should navigate to thank you page
Then user clicks on sign out button


Examples:
feedback/feedback_signedin_email_nonstatutory.csv