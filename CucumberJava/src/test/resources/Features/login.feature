@SmokeFeature
Feature: Feature to test Login functionality.

	@SmokeTest
  Scenario: Check login is successfully with valid credentials.
  
 	
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigating to the home page
