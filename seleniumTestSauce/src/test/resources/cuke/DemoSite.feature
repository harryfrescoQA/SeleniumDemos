Feature: Adding all to cart

Scenario: Log in
	Given the correct web address 
	When I enter the correct credentials
	Then I can see the inventory page

Scenario: Add to cart
	Given the correct web address 
	When I log in and add all to cart
	Then I can go to checkout and see all items
