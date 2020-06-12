$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/DegitalBank.feature");
formatter.feature({
  "line": 1,
  "name": "Degital bank functioanl test",
  "description": "",
  "id": "degital-bank-functioanl-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the login functionality with correct username and password",
  "description": "",
  "id": "degital-bank-functioanl-test;validate-the-login-functionality-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User logs in to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageDefination.user_opened_the_browser()"
});
formatter.result({
  "duration": 12229485782,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefination.user_is_on_login_page()"
});
formatter.result({
  "duration": 8629316,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefination.user_logs_in_to_the_application()"
});
formatter.result({
  "duration": 4610006051,
  "status": "passed"
});
});