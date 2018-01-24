Title: Complaints-Statutory -(logout) Verify user can make the statutory complaint for my self by giving my address details as well 
Narrative: 
As a customer i should able to make the statutory complaint for my self by giving my address details as well 
GivenStories:

Scenario:4# (logout) Verify user can make the statutory complaint for my self by giving my address details as well 

Given user opens BCC Service Home Page
When user cliks on Make a complaint or give feedback
When user navigates via main routing page :<complainttype>
When user navigates via to sub routing page :<complaintsubtype>
When user clicks on make a complaint button
When user selected the complaint type as Myself
When user enters your complaints details : <complaints>
When user enters your action details : <request>
When user select the title : <title>
When user enter the first name : <firstname>
When user enter the last name : <lastname>
When user enter the email : <email>
When user checks add address details : <addaddress>
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
complaints/myself_addaddress_logout_complaints_statutory.csv