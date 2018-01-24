Title: Complaints - (signed in) Verify user can make complaint for someone else via their email and self email

Narrative: 
As a customer i should able to make the complaint for someone else with my email (without entering explicitly) and other persons email if i am logged in to the application
	

GivenStories:

Scenario:1# (signed in) Verify user can make the complaint for someone else via their email and self email

Given user opens BCC Service Home Page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on make a complaint button
When user selected the complaint type for some one else behalf
When user enters your complaints details : <complaints>
When user enters your action details : <request>
When user select others title:<othertitle>
When user enter the others first name : <otherfirstname>
When user enter the others last name : <otherlastname>
When user enter the others email : <otheremail>
When user enters other phone no : <otherphoneno>
When user select the check box send me copy of respond : <Sendmecopy>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
Then check the self email is displayed in the preview page
Then check the other email is displayed in the preview page
When user clicks on submit your request button
Then system should navigate to the thank you page 
Then system should display the reference number
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>
Then user clicks on sign out button


Examples:
complaints/someone_bothemails_signedin_complaints.csv

