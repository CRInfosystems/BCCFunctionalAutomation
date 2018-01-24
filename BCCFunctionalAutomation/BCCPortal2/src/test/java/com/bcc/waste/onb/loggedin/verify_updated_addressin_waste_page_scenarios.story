Title: My Account - Change Address - Validate the address displayed in Waste ordering process

Narrative: 
As a customer i want to update my address so that i can see the updated address in the waste ordering page

GivenStories:

Scenario: 3# Validate the address displayed in Waste ordering process

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on update address link
When user enter the <postcode> , <lookupAddress> and click on save address
Then system should navigate to the profile page
Then system should display updated address details
When user click on home menu
When user naviagte to the waste page
Then verify address in the waste page
Then user clicks on sign out button


Examples:
customer/updateaddressofthecustomer.csv


