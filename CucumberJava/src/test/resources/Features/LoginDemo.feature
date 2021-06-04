

Feature: Test Login functionality

Scenario: Check Login with valid credentials.

Given Browser is open
And User is on Login page
When User enters username and password
And User click on LOgin button
Then User is navigating to Home page