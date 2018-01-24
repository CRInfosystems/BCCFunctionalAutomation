Title: Complaints -(logout) Verify user can make the complaint for some one else by giving their address  and self address uk

Narrative: 
As a customer i should able to make the complaint for some one else by giving their address  and self address uk


GivenStories:

Scenario:6# (logout) Verify user can make the complaint for some one else by giving their address  and self address uk


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
When user checks they dont have email check box : <theydonethaveemail>
When user enter others house name : <otherhousename>
When user enters others address line1 : <otheraddressline1>
When user enters others address line2 : <otheraddressline2>
When user enters others postal town : <otherpostaltown>
When user enters others post code : <otherpostcode>
When user enters other phone no : <otherphoneno>
When user select the check box send me copy of respond : <Sendmecopy>
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
When user clicks on submit your request button
Then system should navigate to the thank you page 
Then system should display the reference number
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>


Examples:
complaints/complaints_proxy_selfaddress_otheraddressuk.csv