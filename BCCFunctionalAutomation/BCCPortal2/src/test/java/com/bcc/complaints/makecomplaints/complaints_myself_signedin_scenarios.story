Title: Complaints - (signed in) Verify user can make complaint for myself

Narrative: 
As a customer i should able to make the complaint for myself without providing my details if i am logged in to the application
	

GivenStories:

Scenario:1# (signed in) Verify user can make the complaint for myself via email

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on make a complaint button
When user selected the complaint type as Myself
When user enters your complaints details : <complaints>
When user enters your action details : <request>
When user enters phone no : <phoneno>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
When user clicks on submit your request button
Then system should navigate to the thank you page 
Then system should display the reference number
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>
Then user clicks on sign out button


Examples:
complaints/myself_signedin_complaints.csv