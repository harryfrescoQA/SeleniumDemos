Feature: Adding all to cart

Background:
	Given the correct web address 
	
Scenario: Log in
	When I enter the correct credentials
	Then I can see the inventory page

Scenario: Add to cart

	When I log in and add all to cart
	Then I can go to checkout and see all items
