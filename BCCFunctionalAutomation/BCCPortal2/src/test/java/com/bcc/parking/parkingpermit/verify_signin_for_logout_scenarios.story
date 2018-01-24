Title: Parking - Blue box - verify for logout user blue is present in the transaction leading page and when signed in blue box is not present

Narrative: 
As a customer , if i am a logout user sign out blue box is present at the transaction leading page and when signed blue box should not present 
	

GivenStories:

Scenario:1#  verify for logout user blue box is present in the transaction leading page and when signed in no displayed 



Given user opens BCC Service Home Page
When user clicks on Get Resident or visitor permits
Then blue box of sign in button should display
When user clicks on sign in button of the blue box
Then system should navigate to the sign in page 
When user enters username <email>
When user enters password <password>
When user clicks Sign in 
Then system should navigate to the parking transaction leading page
Then blue box of sign in button should not display
Then user clicks on sign out button





Examples:
parking/parking_signin_logout.csv