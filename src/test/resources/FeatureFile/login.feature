Feature: Data table example mercury

  Scenario: Registartion
    Given I am on the Home Page "http://newtours.demoaut.com/mercurywelcome.php" of  Website
    And User enters Credentials to LogIn
      | testuser_1 | Test@153 |
      | amit       | sumit    |
    Then Message displayed Login Successfully
