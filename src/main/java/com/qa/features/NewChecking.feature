Feature: Degital bank New Checking test 

Scenario: Validate the New Checking page URL 
	Then Validate the New Checking page URL 
	
Scenario: Validate the New Checking page title 
	Then Validate the New Checking page title 
	
	
Scenario Outline: Validate the Add New Checking Account  functionality 
	When Click on New checking link
	Then Add "<Account Name>" and "<Initial Deposit Amount>" click on Save button
	
	Examples: 
		| Account Name | Initial Deposit Amount |
		| Adam         | 5500                   |	 	 
		| Kunnal       | 6500                   |
		