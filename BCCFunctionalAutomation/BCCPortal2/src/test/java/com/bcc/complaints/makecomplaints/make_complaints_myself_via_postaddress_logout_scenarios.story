Title: Complaints -(logout) Verify user can make the complaint for myself via post address UK

Narrative: 
As a customer i should able to make the complaint for myself via post address UK even if i had not logged in to the application
	

GivenStories:

Scenario:2# (logout) Verify user can make the complaint for myself via postal address 


Given user opens BCC Service Home Page
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on make a complaint button
When user selected the complaint type as Myself
When user enters your complaints details : <complaints>
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
When user enters phone no : <phoneno>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
Then check the address is displayed in the preview page
When user clicks on submit your request button
Then system should navigate to the thank you page
Then system should display the reference number
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>


Examples:
complaints/myself_viapostaddressuk_logout_complaints.csv