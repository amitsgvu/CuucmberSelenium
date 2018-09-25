Feature: Login Feature
  Verify if user is able to Login in to the site

  @ValidLogin
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username "blog.cucumber@gmail.com" and Password "Cucumber@blog"
    Then success message is displayed

  @addtocart
  Scenario: verify add to cart functionality
    When user hoover on product
    Then user clicks on add to cart button
    Then user verify product details
    Then user click on checkout

  @AddressPage
  Scenario: verify address details page
    Given user is on address details page
    Then user verify address details

  @ShippingPage
  Scenario: verify shipping details page functionality
    Given user is on shipping details page
    Then user verify shipping details

  @PaymentPage
  Scenario: verify payment page functionality
    Given user is on payment page
    Then user verify payment details

  @NetBankingPage
  Scenario: verify Net banking details page
    Given user is on Net banking page
    Then user verify Net banking details

  @FinalProductDetaiPage
  Scenario: verify Final Product Detail Page
    Given user is on Final Product Page
    Then user verify product details page
