Title: CT(logout) - Verify user can apply for old persons bus pass if eligible

Narrative: 
As a customer i should be able to apply for old persons bus pass if eligible even if logged out
	

GivenStories:

Scenario:1# CT(logout) Verify user can apply for old persons bus pass if eligible

Given user opens BCC Service Home Page
When user navigates to concessionary travel page
When user clicks Apply for an older person's bus pass
When user submits DOB : <date> <month> <year>
When user enters post code and clicks on find address
When user selects address : <lookupaddress>
When user selects title : <title>
When user enters first name : <firstname>
When user enters last name : <lastname>
When user enters email : <email>
When user enters phone number : <phonenumber>
When user clicks next on main form
When user uploads photo : <uploadphoto>
When user clicks next on photo upload page
Then system should navigate to preview page
When user clicks agree and confirm order
Then system should navigate to thank you page
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>



Examples:
concessionarytravel/ct_oldperson_buspass_logout.csv