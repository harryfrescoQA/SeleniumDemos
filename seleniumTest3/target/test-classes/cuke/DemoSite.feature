Feature: Finding riser and faller

Background:
	Given the correct web address 
	
Scenario: Finding riser 
	When I navigate to risers
	Then I can see the top riser

Scenario: Finding Faller
	When I navigate to fallers
	Then I can see the top faller