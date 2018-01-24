Title: My Account - Change Address - Verify customer is able to update his address as the same existing address

Narrative: 
As a customer i want to update my address to the existing address


Scenario: 2# Verify customer is able to update his address as the same existing address


Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
Then get currect address
When user click on update address link
When user enter the address and click on save address
Then system should navigate to the profile page
Then system should display updated address details
Then user clicks on sign out button


Examples:
customer/updateaddresswithcurrentadressofthecustomer.csv