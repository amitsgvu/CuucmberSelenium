Feature: Test Background feature 

Background: user is loogen in 
	Given I navigate to the login page "http://newtours.demoaut.com/" 
	When I submit username "admin" and password "admin" 
	Then I should be logged in 
	
Scenario Outline: Registartion
    Given I am on the Home Page "http://newtours.demoaut.com/mercuryregister.php" of  Website
    And i enter below details in form "<FirstName>" and "<LastName>" and "<Phone>" and "<Email>"

    Examples: 
      | FirstName | LastName | Phone       | Email               |
      | amit      | sharma   |  9799133424 | amit.sgvu@yahoo.com |
      | sumit     | sharma   | 32434324324 | amit@gmailcom       |
