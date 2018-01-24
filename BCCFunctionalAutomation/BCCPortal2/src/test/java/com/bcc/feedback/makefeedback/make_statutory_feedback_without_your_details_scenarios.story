Title: Feedback -(logout) Verify user can make statutory feedback without providing your details

Narrative: 
As a customer i should able to make the statutory feedback without providing my details even if i have not logged in to the application
	

GivenStories:

Scenario:3# (logout) Verify user can make the statutory feedback without providing your details

Given user opens BCC Service Home Page
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on feedback button
When user enters your feedback : <feedback>
When user clicks on preview your feedback button
Then system should navigate to preview your feedback page
When user clicks on submit your feedback button
Then system should navigate to thank you page


Examples:
feedback/feedback_withoutpersoanldetails.csv