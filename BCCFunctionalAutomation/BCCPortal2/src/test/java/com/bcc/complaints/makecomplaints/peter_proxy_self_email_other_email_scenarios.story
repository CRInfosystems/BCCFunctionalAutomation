Title: Complaints -(logout) Verify user can make the complaint for on some else behalf by giving their email and self email

Narrative: 
As a customer i should able to make the complaint for for some else by giving their email and self email

	

GivenStories:

Scenario:1# (logout) Verify user can make the complaint for on some else behalf by giving their email and self email


Given user opens BCC Service Home Page
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
When user select the title : <title>
When user enter the first name : <firstname>
When user enter the last name : <lastname>
When user enter the email : <email>
When user enters phone no : <phoneno>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
When user clicks on submit your request button
Then system should navigate to the thank you page
Then system should display the reference number
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>



Examples:
complaints/complaints_proxy_via_emailBoth.csv