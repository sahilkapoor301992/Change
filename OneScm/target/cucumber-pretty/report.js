$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "Description: Test Login",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with InValid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters incorrect UserName and incorrect Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Message displayed Login Denied",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});