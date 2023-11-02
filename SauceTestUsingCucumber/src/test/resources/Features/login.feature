#Author: Janardhan
Feature: feature to test login functionality

  Scenario Outline: Check login is succesful with valid login credintials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |