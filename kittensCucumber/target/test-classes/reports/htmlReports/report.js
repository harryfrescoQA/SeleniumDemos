$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/kittens.feature");
formatter.feature({
  "line": 1,
  "name": "Google hamsters",
  "description": "",
  "id": "google-hamsters",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8393198900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Google hamsters",
  "description": "",
  "id": "google-hamsters;google-hamsters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Google is navigated to",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i search for hamsters",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see images of hamsters",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.google_is_navigated_to()"
});
formatter.result({
  "duration": 1410295900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_search_for_hamsters()"
});
formatter.result({
  "duration": 1703833300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_images_of_hamsters()"
});
formatter.result({
  "duration": 969528300,
  "status": "passed"
});
formatter.after({
  "duration": 101562200,
  "status": "passed"
});
});