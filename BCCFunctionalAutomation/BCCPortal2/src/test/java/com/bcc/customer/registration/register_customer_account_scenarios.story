Title: Registration - Register for a customer account - CPDP 70

Narrative: In order to register for a customer account As a customer, I want to register for a customer account so that I can manage my services online (basic account)
 
Scenario:1# Flat citizen registers for customer Account

Given user opens bcc home page
When user clicks Create an account
When user enters title <title>
When user enters firstname <firstname>
When user enters lastname <lastname>
When user enters postcode <postcode>
When user clicks on find address button
When user selects address <addresslookup> from the dropdown list
When user enters email <email>
When user enters twice password <password>
When user clicks on create account button
Then system should display confirm your account


Examples:
customer/createAccounts.csv
