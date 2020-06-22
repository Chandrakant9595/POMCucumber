Feature: Degital bank New Savings test 

Scenario: Validate the New Savings page URL 
	Then Validate the New Savings page URL 
	
Scenario: Validate the New Savings page title 
	Then Validate the New Savings page title 
	
	
Scenario Outline: Validate the Add New Savings Account functionality 
	When Click on New savings link
	Then Add "<Account Name>" and "<Initial Amount>" and click on Save button
	
	Examples: 
		| Account Name | Initial Amount         |
		| Arun         | 3700                   |	 	 
		| ganesh       | 4800                   |
		