$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/DemoSite.feature");
formatter.feature({
  "line": 1,
  "name": "Create USER",
  "description": "",
  "id": "create-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6047184600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test User",
  "description": "",
  "id": "create-user;test-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I can log in with credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_correct_web_address()"
});
formatter.result({
  "duration": 2464156100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_create_a_user()"
});
formatter.result({
  "duration": 6519958500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_can_log_in_with_credentials()"
});
formatter.result({
  "duration": 18407435800,
  "status": "passed"
});
formatter.after({
  "duration": 112769100,
  "status": "passed"
});
});