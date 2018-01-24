Title: ONB  Have quantity logged in- Verify User cant order more than 4 bins - WDP-188

Narrative: 
As a customer i used not have to privilage to order more than 4 bins


Scenario:3# Verify user cant order more then 4 bins except for back wheel bin (can order only 1) when logged in

Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on sign in link and enter user name : <email> and password : <password>
Then verify user cant select more than four bin for each type
Then user clicks on sign out button


Examples:
waste/morethanfourebinsloggedin.csv