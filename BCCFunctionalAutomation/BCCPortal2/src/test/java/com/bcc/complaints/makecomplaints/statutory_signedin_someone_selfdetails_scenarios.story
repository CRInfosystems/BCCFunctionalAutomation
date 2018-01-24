Title: Complaints - Statutory(signed in) Verify user can make complaint for someone else without their address and with self details

Narrative: 
As a customer i should be able to make the statutory complaint for someone else without their address and with self details
	

GivenStories:

Scenario:1# Verify user can make statutory complaint for someone else without their address and with self details when signed in

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
Then system should display login email - proxy
When user enters your complaints details : <complaints>
When user enters your action details : <request>
When user enter the others first name : <otherfirstname>
When user enter the others last name : <otherlastname>
When user enter the others date of Birth : <otherdateofbirth>
When user selects the relationship : <relationship>
When user clicks on preview your complaints button  
Then system should navigate to the preview your complaints page
Then check the email is displayed in the preview page
When user clicks on submit your request button
Then system should navigate to the thank you page
Then system should display the reference number 
When user enters equalities details : <equalitycheck> , <theirage> , <theirgender> , <theirtransgender> , <theiethnicity> , <theirrelegion> , <theirdisablility> , <theirsexual>
Then user clicks on sign out button



Examples:
complaints/statutory_signedin_someone_selfdetails.csv