Feature: Login Page
  Scenario:login with valid credential
    Given I am on login page
    When user enters valid username
    And user enters valid password
    And click on login button
    Then user redirects to home page

 