Title:ONB- Have old removed logged in- Test user have the option of having the old one removed for all the contianers


Narrative: 
As a citizen, when I order a new bin, I want to have the option of having the old one removed


Scenario:2# Verify user can remove old bin when logged in
Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on sign in link and enter user name : <email> and password : <password>
When user selects the bin and qunatity of bins : <quantityofallbins> and selects the check box remove old bin for each bin
Then user should able to able navigate to order summary page
Then user clicks on sign out button



Examples:
waste/ordernewbinloggedin.csv