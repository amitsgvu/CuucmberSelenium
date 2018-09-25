Feature: verify search dress functionality

  @ValidLogin
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username "blog.cucumber@gmail.com" and Password "Cucumber@blog"
    Then success message is displayed

  @SearchDress
  Scenario: verify search feature
    Given i enter "dress" into search bar
    And i click enter
    Then i should see result page
    Then i verify all product details

  @writetoexcel
  Scenario: verify product details
    When i write product details to excel

  @verifypdfDetails
  Scenario: verify pdf details
    Given i click on back button
    Then i click on Link Order history and Details
    Then i verify odf details
