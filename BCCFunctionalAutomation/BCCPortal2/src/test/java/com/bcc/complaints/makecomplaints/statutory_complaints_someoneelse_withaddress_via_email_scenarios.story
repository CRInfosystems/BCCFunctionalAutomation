Title: Complaints -(logout) Verify user can make the complaint statutory for someone else by going address details via email

Narrative: 
As a customer i should able to make the complaint statutory for someone else by giving address details via email even if i had not logged in to the application
	

GivenStories:

Scenario:2# (logout) Verify user can make the complaint statutory for someone else by giving address details via email

Given user opens BCC Service Home Page
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on make a complaint button
When user selected the complaint type for some one else behalf
When user enters your complaints details : <complaints>
When user enters your action details : <request>
When user enter the others first name : <otherfirstname>
When user enter the others last name : <otherlastname>
When user enter the others date of Birth : <otherdateofbirth>
When user selects the add their address : <addtheiraddress>
When user enter others house name : <otherhousename>
When user enters others address line1 : <otheraddressline1>
When user enters others address line2 : <otheraddressline2>
When user enters others postal town : <otherpostaltown>
When user enters others post code : <otherpostcode>
When user selects others country : <othercountry> , <otheroutofuk>
When user select the title : <title>
When user enter the first name : <firstname>
When user enter the last name : <lastname>
When user enter the email : <email>
When user selects the relationship : <relationship>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
When user clicks on submit your request button
Then system should navigate to the thank you page 
Then system should display the reference number 
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>


Examples:
complaints/someoneelse_viaemail_otheraddress_logout_complaints_statutory.csv