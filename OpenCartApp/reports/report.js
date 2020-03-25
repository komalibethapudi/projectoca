$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/OpenCart.feature");
formatter.feature({
  "name": "OpenCartApplication",
  "description": "  In order to create a webpage\n  As a e-commerce vendor\n  I want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "ValidRegisterCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027\u003cfirstname\u003e\u0027 and \u0027\u003clastname\u003e\u0027 and \u0027\u003cemail\u003e\u0027 and \u0027\u003ctelephone\u003e\u0027 and enter \u0027\u003caddress\u003e\u0027 and \u0027\u003ccity\u003e\u0027 and \u0027\u003cpostcode\u003e\u0027 and \u0027\u003ccountry\u003e\u0027 and \u0027\u003cregion\u003e\u0027 and enter \u0027\u003cpassword\u003e\u0027 and \u0027\u003cpasswordconfirm\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "my account has created",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "telephone",
        "address",
        "city",
        "postcode",
        "country",
        "region",
        "password",
        "passwordconfirm"
      ]
    },
    {
      "cells": [
        "lill",
        "chintabathina",
        "liilly222002@gmail.com",
        "7232548101",
        "sidharthanagar",
        "podalada",
        "530244",
        "India",
        "Andhra Pradesh",
        "komali1234",
        "komali1234"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ValidRegisterCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027lill\u0027 and \u0027chintabathina\u0027 and \u0027liilly222002@gmail.com\u0027 and \u00277232548101\u0027 and enter \u0027sidharthanagar\u0027 and \u0027podalada\u0027 and \u0027530244\u0027 and \u0027India\u0027 and \u0027Andhra Pradesh\u0027 and enter \u0027komali1234\u0027 and \u0027komali1234\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_and_and_and_enter_and_and_and_and_and_enter_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my account has created",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.my_account_has_created()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InValidRegisterCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter \u0027\u003cfirstname\u003e\u0027 and \u0027\u003clastname\u003e\u0027 and \u0027\u003cemail\u003e\u0027 and \u0027\u003ctelephone\u003e\u0027 and \u0027\u003caddress\u003e\u0027 and \u0027\u003ccity\u003e\u0027 and \u0027\u003cpostcode\u003e\u0027 and \u0027\u003ccountry\u003e\u0027 and \u0027\u003cregion\u003e\u0027 and \u0027\u003cpassword\u003e\u0027 and \u0027\u003cpasswordconfirm\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I get Invalid credentials",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "telephone",
        "address",
        "city",
        "postcode",
        "country",
        "region",
        "password",
        "passwordconfirm"
      ]
    },
    {
      "cells": [
        "lilly",
        "chintabathina",
        "s0nii12@gmail.com",
        "9052349765",
        "sidharthanagar",
        "podalada",
        "532243",
        "India",
        "Delhi",
        "komali1234",
        "komali1234"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "InValidRegisterCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter \u0027lilly\u0027 and \u0027chintabathina\u0027 and \u0027s0nii12@gmail.com\u0027 and \u00279052349765\u0027 and \u0027sidharthanagar\u0027 and \u0027podalada\u0027 and \u0027532243\u0027 and \u0027India\u0027 and \u0027Delhi\u0027 and \u0027komali1234\u0027 and \u0027komali1234\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.user_enter_and_and_and_and_and_and_and_and_and_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get Invalid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_get_Invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnSoftware",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on the product Software",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_click_on_the_product_Software()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_the_text()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "ClickOnWishList",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027\u003cusername\u003e\u0027 and \u0027\u003cpassword\u003e\u0027 and click on WishList",
  "keyword": "When "
});
formatter.step({
  "name": "I should get My WishList",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "anjanipriya123@gmail.com",
        "anju.555"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnWishList",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027anjanipriya123@gmail.com\u0027 and \u0027anju.555\u0027 and click on WishList",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_and_click_on_WishList(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get My WishList",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_My_WishList()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "ClickOnLogout",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027\u003cusername\u003e\u0027 and \u0027\u003cpassword\u003e\u0027 and click on logout",
  "keyword": "When "
});
formatter.step({
  "name": "I should logout from the page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "anjanipriya123@gmail.com",
        "anju.555"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnLogout",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027anjanipriya123@gmail.com\u0027 and \u0027anju.555\u0027 and click on logout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_and_click_on_logout(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should logout from the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_logout_from_the_page()"
});
formatter.result({
  "status": "passed"
});
});