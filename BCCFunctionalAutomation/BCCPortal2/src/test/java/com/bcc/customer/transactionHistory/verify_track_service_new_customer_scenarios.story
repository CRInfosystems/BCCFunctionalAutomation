Title: Tracking - track service request- For the new Customer , transaction History tab should displying message "You have no closed or pending waste jobs."

Narrative: 
As the new customer of the council website, i want to Check the transaction History tab
	

Scenario: 1# For the new Customer veify in transaction History tab 


Given user opens bcc home page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user clicks on Orders and Payments Tab
Then verify transaction history is displying message You have no closed or pending waste jobs.
Then user clicks on sign out button


Examples:
customer/transactionhistorynewcustomer.csv