#Author: Janardhan
Feature: feature to continue button in stepone

  Scenario: Check continue button in stepone is working or not
    Given user is on checkoutstep1
    When user enters firstname
    And user enters secondname
    And user enters postal code
    And user clicks continue
    Then user is navigated to checkout_step2
