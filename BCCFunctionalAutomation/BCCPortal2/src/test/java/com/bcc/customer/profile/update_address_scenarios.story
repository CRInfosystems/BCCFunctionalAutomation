Title: My Account - Change Address - Verify customer is able to update his address

Narrative: 
As a customer , As a customer i want to update my address
	

Scenario: 1# Verify Customer is able to change address successfully


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
Then user clicks on sign out button

Examples:
customer/updateaddressofthecustomer.csv



