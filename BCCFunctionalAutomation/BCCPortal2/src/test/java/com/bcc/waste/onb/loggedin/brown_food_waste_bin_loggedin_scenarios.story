Title: Food recycling logged in - Test user can order  food waste 


Narrative: 
As a citizen, I want to order food waste containers, so that I can dispose of my food waste
	

Scenario: 1# Verify user can order brown food waste Bin when logged in


Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on sign in link and enter user name : <email> and password : <password>
When user selects food caddy containers and quantity : <quantityofallbins> and type of order :<ordertype>
Then user should able to enter delivery instructions : <deliverylocation>
When user clicks on order
Then user should able to able navigate to order summary page
When clicks on place order
Then user should able to view a summary of their order before final confirmation and delivery address
Then user clicks on sign out button


Examples:
waste/orderfoodwasteloggedin.csv


