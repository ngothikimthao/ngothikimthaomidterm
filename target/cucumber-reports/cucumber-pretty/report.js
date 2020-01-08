$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Customer login",
  "description": "",
  "id": "customer-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.way2automation.com/angularjs-protractor/banking/#/customer",
      "offset": 13
    }
  ],
  "location": "CommonTest.openWebsite(String)"
});
formatter.result({
  "duration": 17477042400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Customer login",
  "description": "",
  "id": "customer-login;customer-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click username as Harry Potter",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify that login successfully with name as Harry Potter",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.clickUserName()"
});
formatter.result({
  "duration": 2150791100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clickSubmit()"
});
formatter.result({
  "duration": 2094209400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 46
    }
  ],
  "location": "LoginTest.verifyLoginSuccesfully(String)"
});
formatter.result({
  "duration": 240200,
  "status": "passed"
});
});