Feature: Acceptance testing to validate Home page 

Scenario: Validate Search Cars Page 
	Given I am on the Home Page "https://www.carsguide.com.au" of  Website
	Then i scroll down bottom of the page
	And i click on Link ContactUs
	And i scroll down little
	Then i select Enquiery "Help with my car for sale advert"