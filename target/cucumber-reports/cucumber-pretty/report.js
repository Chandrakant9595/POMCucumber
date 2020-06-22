$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/NewSavings.feature");
formatter.feature({
  "line": 1,
  "name": "Degital bank New Savings test",
  "description": "",
  "id": "degital-bank-new-savings-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9261418276,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the New Savings page URL",
  "description": "",
  "id": "degital-bank-new-savings-test;validate-the-new-savings-page-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Validate the New Savings page URL",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageDefination.validate_the_New_Savings_page_URL()"
});
formatter.result({
  "duration": 47231659033,
  "status": "passed"
});
formatter.after({
  "duration": 755132364,
  "status": "passed"
});
formatter.before({
  "duration": 17848537719,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate the New Savings page title",
  "description": "",
  "id": "degital-bank-new-savings-test;validate-the-new-savings-page-title",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Validate the New Savings page title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageDefination.validate_the_New_Savings_page_title()"
});
formatter.result({
  "duration": 28995828985,
  "status": "passed"
});
formatter.after({
  "duration": 1199232787,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Validate the Add New Savings Account functionality",
  "description": "",
  "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "Click on New savings link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Add \"\u003cAccount Name\u003e\" and \"\u003cInitial Amount\u003e\" and click on Save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality;",
  "rows": [
    {
      "cells": [
        "Account Name",
        "Initial Amount"
      ],
      "line": 15,
      "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality;;1"
    },
    {
      "cells": [
        "Arun",
        "3700"
      ],
      "line": 16,
      "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality;;2"
    },
    {
      "cells": [
        "ganesh",
        "4800"
      ],
      "line": 17,
      "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 27421621447,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate the Add New Savings Account functionality",
  "description": "",
  "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "Click on New savings link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Add \"Arun\" and \"3700\" and click on Save button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageDefination.click_on_New_savings_link()"
});
formatter.result({
  "duration": 32980743169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arun",
      "offset": 5
    },
    {
      "val": "3700",
      "offset": 16
    }
  ],
  "location": "LoginPageDefination.add_and_and_click_on_Save_button(String,String)"
});
formatter.result({
  "duration": 12892765125,
  "status": "passed"
});
formatter.after({
  "duration": 746583205,
  "status": "passed"
});
formatter.before({
  "duration": 13195198924,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate the Add New Savings Account functionality",
  "description": "",
  "id": "degital-bank-new-savings-test;validate-the-add-new-savings-account-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "Click on New savings link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Add \"ganesh\" and \"4800\" and click on Save button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageDefination.click_on_New_savings_link()"
});
formatter.result({
  "duration": 42763115185,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ganesh",
      "offset": 5
    },
    {
      "val": "4800",
      "offset": 18
    }
  ],
  "location": "LoginPageDefination.add_and_and_click_on_Save_button(String,String)"
});
formatter.result({
  "duration": 31440544727,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 30.000\n  (Session info: chrome\u003d83.0.4103.106)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VICKY-PC\u0027, ip: \u0027192.168.43.139\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\vicky\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62295}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2ffe84fa4f4f786f701125b0f94bb7a9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat com.qa.pages.NewSavingsPage.addSavingsAccount(NewSavingsPage.java:51)\r\n\tat com.qa.stepdefination.LoginPageDefination.add_and_and_click_on_Save_button(LoginPageDefination.java:147)\r\n\tat ✽.Then Add \"ganesh\" and \"4800\" and click on Save button(src/main/java/com/qa/features/NewSavings.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 773852714,
  "status": "passed"
});
});