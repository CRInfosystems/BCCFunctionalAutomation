Title: Feedback -(logout) Verify user can make feedback via UK address

Narrative: 
As a customer i should able to make the feedback via UK address even if i have not logged in to the application
	

GivenStories:

Scenario:3# (logout) Verify user can make the feedback via UK address

Given user opens BCC Service Home Page
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on feedback button
When user enters your feedback : <feedback>
When user selects the title : <title>
When user enters first name : <firstname>
When user enters last name : <lastname>
When user checks i dont have email check box : <noemail>
When user enters house name : <housename>
When user enters address line1 : <addressline1>
When user enters address line2 : <addressline2>
When user enters postal town : <postaltown>
When user enters post code : <postcode>
When user selects country : <country> , <other>
When user enters phone number : <phonenumber>
When user clicks on preview your feedback button
Then system should navigate to preview your feedback page
When user clicks on submit your feedback button
Then system should navigate to thank you page


Examples:
feedback/feedback_address.csv