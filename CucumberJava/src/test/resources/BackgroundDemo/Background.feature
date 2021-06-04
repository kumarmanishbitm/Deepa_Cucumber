Feature: Check Home page functionality

Background: user is logged in
Given user is on login page
When enter credentials
And click on login button
Then user is navigating to home page

Scenario: check logout link

When user clicks on Welcome link
Then logout link is displayed

Scenario: verify quick launch toolbar is present

When click on dashboard link
Then quick launch toolbar is displayed
