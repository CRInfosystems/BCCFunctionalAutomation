Title: Feedback -(logout) Verify user can make feedback with out giving any personal details 

Narrative: 
As a customer i should able to make the feedback with out giving any persoal details 
	

GivenStories:

Scenario:5# (logout) Verify user can make the feedback without giving personal details 

Given user opens BCC Service Home Page
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on feedback button
When user enters your feedback : <feedback>
When user selects the title : <title>
When user enters first name : <firstname>
When user enters last name : <lastname>
When user enters phone number : <phonenumber>
When user clicks on preview your feedback button
Then system should navigate to preview your feedback page
When user clicks on submit your feedback button
Then system should navigate to thank you page


Examples:
feedback/feedback_withpersoanldetails_nonstatutory.csv