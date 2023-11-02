#Author: Janardhan
Feature: feature to check final checkout button

  Scenario: Check finalcheckout button is working or not
    Given user is on checkoutstep2
    When  user clicks finish
    Then user is navigated to checkout_complete
