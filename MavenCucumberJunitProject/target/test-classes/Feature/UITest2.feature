Feature: This is an UI application Test Feature using  selenium code would be checked in develop with 2nd functional flow


@UItest
Scenario Outline: To test the login Functionality 2nd functional flow

Given User Navigates to applicationname "<application>" application
When User should login with username and password in login page
Then User is navigated to home page

Examples:   
|application|
|google|

