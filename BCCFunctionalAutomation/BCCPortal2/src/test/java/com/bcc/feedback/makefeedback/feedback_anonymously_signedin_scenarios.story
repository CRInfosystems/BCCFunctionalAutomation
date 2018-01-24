Title: Feedback(signed in) - Verify user can make feedback anonymously

Narrative: 
As a customer i should be able to make the feedback anonymously when signed in
	

GivenStories:

Scenario:1# Feedback (signed in) Verify user can make the feedback anonymously

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
When user checks Leave this feedback anonymously
When user clicks on preview your feedback button
When user clicks on submit your feedback button
Then system should navigate to thank you page
Then user clicks on sign out button


Examples:
feedback/feedback_signedin_anonymous_nonstatutory.csv