$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/TeaTesting.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping on a website",
  "description": "As a person \r\nI want to browse items on a website \r\nSo that I can purchase the items I want",
  "id": "shopping-on-a-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6073516200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Browse the items available on the website",
  "description": "",
  "id": "shopping-on-a-website;browse-the-items-available-on-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the \u0027Menu\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I can browse a list of the available products.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_correct_web_address()"
});
formatter.result({
  "duration": 10818209600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_the_Menu_page()"
});
formatter.result({
  "duration": 631357300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_can_browse_a_list_of_the_available_products()"
});
formatter.result({
  "duration": 22551500,
  "status": "passed"
});
formatter.after({
  "duration": 83941800,
  "status": "passed"
});
formatter.before({
  "duration": 5287413200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add an item to the checkout",
  "description": "",
  "id": "shopping-on-a-website;add-an-item-to-the-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click the checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I am taken to the checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_correct_web_address()"
});
formatter.result({
  "duration": 352805100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_click_the_checkout_button()"
});
formatter.result({
  "duration": 10768759500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_am_taken_to_the_checkout_page()"
});
formatter.result({
  "duration": 6886300,
  "status": "passed"
});
formatter.after({
  "duration": 76403400,
  "status": "passed"
});
formatter.before({
  "duration": 5447256400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Fill in checkout form",
  "description": "",
  "id": "shopping-on-a-website;fill-in-checkout-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I fill in the form to checkout and submit",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I am taken back to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_correct_web_address()"
});
formatter.result({
  "duration": 456440900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_fill_in_the_form_to_checkout_and_submit()"
});
formatter.result({
  "duration": 21496766000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_am_taken_back_to_the_homepage()"
});
formatter.result({
  "duration": 5560500,
  "status": "passed"
});
formatter.after({
  "duration": 68194700,
  "status": "passed"
});
});