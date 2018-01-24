Title: Tracking - track service request- Order a new bin and verify List is sorted by date created

Narrative: 
As the customer of the council website, Need to order new bin and verify Transaction List is sorted by date created
	

Scenario: 4# Order a New Bin, verify List is sorted by date created


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
Then verify list is sorted by date created
Then user clicks on sign out button


Examples:
customer/transactionhistory.csv