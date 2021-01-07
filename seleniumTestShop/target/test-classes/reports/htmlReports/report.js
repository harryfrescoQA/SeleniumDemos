$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/DemoSite.feature");
formatter.feature({
  "line": 1,
  "name": "Searching",
  "description": "",
  "id": "searching",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6040255600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Searching for blouse",
  "description": "",
  "id": "searching;searching-for-blouse",
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
  "name": "I search for blouse",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I can see the correct result",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_correct_web_address()"
});
formatter.result({
  "duration": 2689944800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_search_for_blouse()"
});
formatter.result({
  "duration": 119785000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_can_see_the_correct_result()"
});
formatter.result({
  "duration": 1126613400,
  "status": "passed"
});
formatter.after({
  "duration": 121933400,
  "status": "passed"
});
});