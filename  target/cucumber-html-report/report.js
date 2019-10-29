$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/UserRegisteration.feature");
formatter.feature({
  "name": "User Registration",
  "description": "  I want to check that the user can register in our ECommerce website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered the user data",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.i_entered_the_user_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displays successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displays_successfully()"
});
formatter.result({
  "status": "passed"
});
});