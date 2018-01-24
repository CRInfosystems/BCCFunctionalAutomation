Title: CT(logout) - Verify user is notified that they are not eligible for bus pass if age < 65

Narrative: 
As a customer i should be notified that I am not eligible for bus pass if age < 65
	

GivenStories:

Scenario:1# CT(logout) Verify user is notified that they are not eligible for bus pass if age < 65

Given user opens BCC Service Home Page
When user navigates to concessionary travel page
When user clicks Apply for an older person's bus pass
When user submits DOB : <date> <month> <year>
Then system should display user not eligible message



Examples:
concessionarytravel/ct_oldperson_buspass_noteligible.csv