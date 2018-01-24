Title: Have quantity loggin IN- Test that user can order 1,2,3 or 4 of each item, except black wheelie bin - WDP-188

Narrative: 
As a customer i used not have to privilage to order more than 4 bins

GivenStories:

Scenario:5# Verify user can order bins when logged in
Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on sign in link and enter user name : <email> and password : <password>
When user selects the bins with quantity  : <quantityofallbins>
Then user should able to able navigate to order summary page
Then user clicks on sign out button

Examples:
waste/ordernewbinloggedin.csv