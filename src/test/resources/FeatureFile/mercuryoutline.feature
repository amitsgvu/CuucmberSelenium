Feature: Data table example mercury

  Scenario Outline: Registartion
    Given I am on the Home Page "http://newtours.demoaut.com/mercuryregister.php" of  Website
    And i enter below details in form "<FirstName>" and "<LastName>" and "<Phone>" and "<Email>"

    Examples: 
      | FirstName | LastName | Phone       | Email               |
      | amit      | sharma   |  9799133424 | amit.sgvu@yahoo.com |
      | sumit     | sharma   | 32434324324 | amit@gmailcom       |
