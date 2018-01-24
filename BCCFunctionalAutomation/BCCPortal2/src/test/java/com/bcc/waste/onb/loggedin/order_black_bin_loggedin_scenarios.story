Title: New black bin logged In- Test user can order  new black bin and also 
verify  delivery address , 
user can enter delivery instructions ,  
recycling boxes are free of charge ,  
view a summary of their order before final confirmation


Narrative: 
As a citizen, I want to place an order for a new black bin without loggin in , so that I can dispose of my rubbish



Scenario:5# Verify user can order black bin when logged in

Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on sign in link and enter user name : <email> and password : <password>
When user selects new black bin with size :<blackbinsize> and provide reason as damaged and order type : <ordertype>
Then user should able to enter delivery instructions : <deliverylocation>
When user clicks on order
Then user should able to able navigate to order summary page
When clicks on place order
Then user should able to view a summary of their order before final confirmation and delivery address
Then user clicks on sign out button


Examples:
waste/orderblackwheeliebinloggedin.csv