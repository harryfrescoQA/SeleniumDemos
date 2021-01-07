$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/DemoSite.feature");
formatter.feature({
  "line": 1,
  "name": "Finding riser and faller",
  "description": "",
  "id": "finding-riser-and-faller",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6060875700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.the_correct_web_address()"
});
formatter.result({
  "duration": 2355368300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Finding riser",
  "description": "",
  "id": "finding-riser-and-faller;finding-riser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I navigate to risers",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the top riser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_risers()"
});
formatter.result({
  "duration": 816764500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_can_see_the_top_riser()"
});
formatter.result({
  "duration": 145042600,
  "status": "passed"
});
formatter.after({
  "duration": 94591100,
  "status": "passed"
});
formatter.before({
  "duration": 5519895700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.the_correct_web_address()"
});
formatter.result({
  "duration": 2490050900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Finding Faller",
  "description": "",
  "id": "finding-riser-and-faller;finding-faller",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I navigate to fallers",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I can see the top faller",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_fallers()"
});
formatter.result({
  "duration": 809788600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_can_see_the_top_faller()"
});
formatter.result({
  "duration": 162265900,
  "status": "passed"
});
formatter.after({
  "duration": 139382300,
  "status": "passed"
});
});