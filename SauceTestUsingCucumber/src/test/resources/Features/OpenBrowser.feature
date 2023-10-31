#Author: Janardhan
Feature: Feauture to test whether the website is working or not

  Scenario: Check website is up
    Given Browser is open
    When Url is entered
    And clicks enter
    Then user is navigated to Sauce Demo website
