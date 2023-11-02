#Author: Janardhan
Feature: feature to test add_to_cart button functionality

  Scenario: Check Add to cart buttons is working or not
    Given user is on home page
    When user clicks on all buttons
    And clicks on cart button
    Then user is navigated to cart page
