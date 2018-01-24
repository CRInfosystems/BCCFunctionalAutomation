Title: Tracking - track service request- user orders a new Bin ,verify rowcount is getting incremented in transaction history 

Narrative: 
As the customer of the council website, Need to order new bin anch check the transansaction history detail
	

Scenario: 2# Order a New Bin, check rowcount is getting incremented in transaction history with appropriate order number.


Given user opens bcc home page
When user clicks sign in button
When user enters username <email>
When user enters password <password>
When user clicks Sign in
When user clicks Your Account
When user clicks on Orders and Payments Tab
Then verify transaction history rowcount
When user naviagte to waste page
When user order bins
When users gets order number and naviagte to the transaction history tab
Then verify transaction history rowcount is getting incremented
Then verify order number is getting displayed
Then user clicks on sign out button


Examples:
customer/transactionhistory.csv