Feature: This is a UI application test Feature
@UItest
Scenario Outline: To test the login Functionality

Given User Navigates to applicationname "<application>" application
When User should login with username and password in login page
Then User is navigated to home page

Examples:   
|application|
|google|

