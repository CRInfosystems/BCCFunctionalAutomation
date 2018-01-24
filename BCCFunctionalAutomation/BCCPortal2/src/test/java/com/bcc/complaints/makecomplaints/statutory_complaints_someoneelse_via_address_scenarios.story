Title: Complaints -(logout) Verify user can make the complaint statutory for someone else by going address details via email

Narrative: 
As a customer i should able to make the complaint statutory for someone else by giving address details via email even if i had not logged in to the application
	

GivenStories:

Scenario:3# (logout) Verify user can make the complaint statutory for someone else by giving address details via email

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
When user select the title : <title>
When user enter the first name : <firstname>
When user enter the last name : <lastname>
When user checks i dont have email check box : <noemail>
When user enters house name : <housename>
When user enters address line1 : <addressline1>
When user enters address line2 : <addressline2>
When user enters postal town : <postaltown>
When user enters post code : <postcode>
When user selects country : <country> , <other>
When user selects the relationship : <relationship>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
When user clicks on submit your request button
Then system should navigate to the thank you page 
Then system should display the reference number 
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>


Examples:
complaints/someoneelse_viaaddress_logout_complaints_statutory.csv