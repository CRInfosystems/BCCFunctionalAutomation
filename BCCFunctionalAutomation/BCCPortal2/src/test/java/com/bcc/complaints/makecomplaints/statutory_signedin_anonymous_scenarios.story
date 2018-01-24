Title: Complaints-Statutory(signed in) Verify user can make the statutory complaint anonymously 

Narrative: 
As a customer i should able to make the statutory complaint anonymously when signed in to the application
	

GivenStories:

Scenario:1# Verify user can make statutory complaint anonymously when signed in

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on make a complaint button
When user clicks on link make complaints anonymously
Then system should display anonymous message
When user enters your complaints details : <complaints>
When user enters your action details : <request>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
When user clicks on submit your request button
Then system should navigate to the thank you page 
Then system should display the message you will not receive a confirmation as you choose to remain anonymous
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>
Then user clicks on sign out button

Examples:
complaints/statutory_signedin_anonymous.csv