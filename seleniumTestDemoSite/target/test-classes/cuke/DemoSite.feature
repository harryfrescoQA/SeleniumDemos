Feature: Creating a user

Background:
	Given the correct web address 
	
Scenario: Click create user 
	When I navigate to the 'Add a User' page 
	Then I can see a form to create a user 

Scenario: Fill in the form
	When I click add user button and fill in the form and submit
	Then the user is created
	
Scenario: Log in 
	When I log in with the credentials
	Then the success message is shown