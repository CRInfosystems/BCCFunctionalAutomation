Title: 187- ONB- Have old removed- Test user have the option of having the old one removed for all the contianers


Narrative: 
As a citizen, when I order a new bin, I want to have the option of having the old one removed

GivenStories:

Scenario:2# Verify user remove the old bins even though user is not logged in
Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on order now button
When user selects the bin and qunatity of bins : <quantityofallbins> and selects the check box remove old bin for each bin
Then user should able to able navigate to order summary page


Examples:
waste/ordernewbin.csv

