Title: 181 - Recycling box logged out- Test user can order  recycling boxes and also 
verify  delivery address , 
user can enter delivery instructions ,  
recycling boxes are free of charge ,  
view a summary of their order before final confirmation


Narrative: 
As a citizen, I want to order a new recycling box, so that I can dispose of my old recycling items

GivenStories:

Scenario:6# Verify user cn order new recycling box even though user is not logged in
Given user opens bcc home page
When user clicks on waste tab
When user enter postcode details : <postcode>
When use clicks on lookup address button
When user select address : <lookupAddress> from the drop down
When user click on next button
When user click on Order New/Replacement Bin button
When user clicks on order now button
When user selects new recycling boxes with quantity : <quantityofallbins> and ordertype : <ordertype>
Then user should able to enter delivery instructions : <deliverylocation>
When user clicks on order
Then user should able to able navigate to order summary page
When user enter email id : <email> and clicks on place order
Then user should able to view a summary of their order before final confirmation and delivery address


Examples:
waste/orderrecyclingboxes.csv