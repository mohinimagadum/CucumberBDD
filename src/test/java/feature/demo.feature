Feature: Google search page
  Scenario: search in google
  Given i am on google search page
  When i entered java and click on search
  Then page title must start with java
  