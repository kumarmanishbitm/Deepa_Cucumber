Feature: Feature to search google search functionality.

  Scenario: Validate Google Search is Working.
  
    Given browser is open.
    And User is on Google Search page.
    When user enters a text in search box
    And Hit enter button
    Then User is navigated to search results.
