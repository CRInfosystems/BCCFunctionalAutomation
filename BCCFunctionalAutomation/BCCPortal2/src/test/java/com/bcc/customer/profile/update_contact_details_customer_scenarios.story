Title: My Account - Change Phone Number - Verify customer can able to update his contact details

Narrative: 
As a customer i want to update my contant details


Scenario: 2# Update the customer details , and verify the updated contact details as displayed correctly in the view profile page

Given user opens bcc home page    
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user click on update phone link
Then system should navigate to change phone details page
When user enter landline : <ExpectedLandline> , mobile : <ExpectedMobile>  and clicks on Save Phones
Then system should navigate to the profile page
Then system should display customer new contact details
Then user clicks on sign out button


Examples:
customer/updatecontactdetailsofthecustomer.csv
