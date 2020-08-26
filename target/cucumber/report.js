$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("expediaHome.feature");
formatter.feature({
  "line": 1,
  "name": "Expedia header navigation",
  "description": "",
  "id": "expedia-header-navigation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "When a user navigates to Expedia homepage",
  "description": "",
  "id": "expedia-header-navigation;when-a-user-navigates-to-expedia-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The user is in expedia home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User select the login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User provide the username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be logged in to the site",
  "keyword": "Then "
});
formatter.match({
  "location": "UIStepDefinition.the_user_is_in_expedia_home_page()"
});
formatter.result({
  "duration": 5670506958,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDefinition.user_select_the_login_button()"
});
formatter.result({
  "duration": 107705728,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDefinition.user_provide_the_username_and_password()"
});
formatter.result({
  "duration": 91097,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDefinition.user_should_be_logged_in_to_the_site()"
});
formatter.result({
  "duration": 47625,
  "status": "passed"
});
});