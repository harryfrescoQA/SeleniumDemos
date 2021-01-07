$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/DemoSite.feature");
formatter.feature({
  "line": 1,
  "name": "Adding all to cart",
  "description": "",
  "id": "adding-all-to-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6813443700,
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
  "duration": 454248300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Log in",
  "description": "",
  "id": "adding-all-to-cart;log-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I enter the correct credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the inventory page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_enter_the_correct_credentials()"
});
formatter.result({
  "duration": 1046541100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_can_see_the_inventory_page()"
});
formatter.result({
  "duration": 8364700,
  "status": "passed"
});
formatter.after({
  "duration": 98501700,
  "status": "passed"
});
formatter.before({
  "duration": 5286260200,
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
  "duration": 187564200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add to cart",
  "description": "",
  "id": "adding-all-to-cart;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I log in and add all to cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can go to checkout and see all items",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_log_in_and_add_all_to_cart()"
});
formatter.result({
  "duration": 1649256400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_can_go_to_checkout_and_see_all_items()"
});
formatter.result({
  "duration": 413235400,
  "status": "passed"
});
formatter.after({
  "duration": 90621600,
  "status": "passed"
});
});