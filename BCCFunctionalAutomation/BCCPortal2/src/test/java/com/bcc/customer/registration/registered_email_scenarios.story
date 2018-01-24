Narrative:As a customer, I want to register for a customer account so that I can manage my services online (basic account)- CPDP-70

Scenario:1#  Test more than one account can not be created using single email address

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
Then system should display please enter a valid email address

Examples:
customer/register.csv