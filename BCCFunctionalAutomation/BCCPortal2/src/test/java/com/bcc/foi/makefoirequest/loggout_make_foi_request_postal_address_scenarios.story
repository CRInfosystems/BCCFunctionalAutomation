Title: FOI - Make FOI Request -  Veify user can able to make the FOI request using postable address and upload the documents  ( story id : 2041 , 2044 )

Narrative: 
As a customer i want to make the FOI request without log in to the system

GivenStories:

Scenario:2# Veify user can able to make the FOI request using postal address

Given user opens bcc foi home page
When user click on make a new foi request button
Then user should be in make FOI Request Page
When user enter your request : <request>
When user wants to upload the documents : <uploaddoc>
When user select title : <title>
When user enters first Name : <firstName>
When user enters last Name : <lastName>
When user enters your org : <yourOrg>
When user select checkbox i dont have email id : <idonthaveemail>
When user enters AddressLine1 : <addressLine1>
When user enters AddressLine2 : <addressLine2>
When user enters AddressLine3 : <addressLine3>
When user enters AddressLine4 : <addressLine4>
When user enters PostCode : <postCode>
When user enters Country: <country> , <OtherCountry>
When user click on Preview your request Button 
Then system should navigate to Preview your request page
When user clicks on Submit your request button
Then user should navigate to thank you page
Then system should display Reference Number and the What Happens Next


Examples:
foi/foi_request_postaladdress.csv