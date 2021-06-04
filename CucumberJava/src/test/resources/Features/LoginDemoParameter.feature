

Feature: Login functionality

Scenario: Login with valid credentials.

Given Open browser
And User on Login page
When Enters <username> and <password>
And click on LOgin button
Then Navigating to Home page

Examples:
 |username|password| 
 |Raghav | 12345 |
 |Ele | 12345 |