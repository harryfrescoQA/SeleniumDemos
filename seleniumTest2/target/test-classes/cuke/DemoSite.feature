Feature: Creating a user

Scenario: Click create user 
	Given the correct web address 
	When I navigate to the 'Add a User' page 
	Then I can see a form to create a user 

Scenario: Fill in the form
	Given the correct web address 
	When I click add user button and fill in the form and submit
	Then the user is created
	
Scenario: Log in 
	Given the correct web address
	When I log in with the credentials
	Then the success message is shown