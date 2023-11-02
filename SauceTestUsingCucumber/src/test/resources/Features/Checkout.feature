#Author: Janardhan
Feature: feature to checkout button functionality

  Scenario: Check Add to cart buttons is working or not
    Given user is on cart page
    When user clicks on checkout_button
    Then user is navigated to checkout_step1
