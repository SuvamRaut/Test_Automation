$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UITest.feature");
formatter.feature({
  "line": 1,
  "name": "This is a UI application test Feature",
  "description": "",
  "id": "this-is-a-ui-application-test-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To test the login Functionality",
  "description": "",
  "id": "this-is-a-ui-application-test-feature;to-test-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@UItest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Navigates to applicationname \"\u003capplication\u003e\" application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should login with username and password in login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is navigated to home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "this-is-a-ui-application-test-feature;to-test-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "application"
      ],
      "line": 10,
      "id": "this-is-a-ui-application-test-feature;to-test-the-login-functionality;;1"
    },
    {
      "cells": [
        "google"
      ],
      "line": 11,
      "id": "this-is-a-ui-application-test-feature;to-test-the-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "To test the login Functionality",
  "description": "",
  "id": "this-is-a-ui-application-test-feature;to-test-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@UItest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Navigates to applicationname \"google\" application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should login with username and password in login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "google",
      "offset": 35
    }
  ],
  "location": "UITest.user_Navigates_to_applicationname_application(String)"
});
formatter.result({
  "duration": 17362692100,
  "status": "passed"
});
formatter.match({
  "location": "UITest.user_should_login_with_username_and_password_in_login_page()"
});
formatter.result({
  "duration": 91900,
  "status": "passed"
});
formatter.match({
  "location": "UITest.user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 87400,
  "status": "passed"
});
});