@AddProductToCart
Feature: Add product to the Cart

  Scenario: Verify user should be able to add product to the cart
    Given I'm on the Costco home page
    And I select Hot Buys option within Shop All Departments
    And I select the first product in the list
    And I add the selected product to the cart
    When I click the view cart button
    Then I am able to verify that I am on the cart page