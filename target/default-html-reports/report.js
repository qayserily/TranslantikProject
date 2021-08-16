$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/functions.feature");
formatter.feature({
  "name": "User can navigate to the \"General Infirmation\" page by clicking on the related car",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "\"User\" should be able to login with its \"Password\"",
  "keyword": "And "
});
formatter.step({
  "name": "User can navigate to the \"General Infirmation\" page by clicking on the \"eye\" sign under \u0027\u0027...\u0027\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "User should see \"edit\", \"delete\" and \"add event\" buttons on the General Information",
  "keyword": "And "
});
formatter.step({
  "name": "User can see created activities by click on the Activity module on the \u0027\u0027General Information\u0027\u0027 page",
  "keyword": "When "
});
formatter.step({
  "name": "All of the information between the \"General Information\" page and table should be matched",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MODEL NAME",
        "MAKE",
        "CAN BE REQUESTED",
        "CVVI",
        "CO2 FEE(/MONTH)",
        "COST (DEPRECIATED)",
        "TOTAL COST(DEPRECIATED)",
        "CO2 EMISSIONS",
        "FUEL TYPE",
        "VENDORS"
      ]
    },
    {
      "cells": [
        "Model S",
        "Tesla",
        "YES",
        "23",
        "23",
        "23",
        "32",
        "23",
        "Diesel",
        "23"
      ]
    },
    {
      "cells": [
        "Enzo",
        "Ferrari",
        "YES",
        "123",
        "23",
        "12,331",
        "12,332",
        "123",
        "Diesel",
        "213"
      ]
    },
    {
      "cells": [
        "Mazda",
        "Opel",
        "YES",
        "222",
        "21",
        "222",
        "222",
        "22",
        "Electric",
        "Michael\u0027s Car Shop"
      ]
    },
    {
      "cells": [
        "Rouge",
        "Nissan",
        "NO",
        "16,000",
        "2,100",
        "12,500",
        "15,000",
        "120",
        "Gasoline",
        "Eugino Dealer"
      ]
    },
    {
      "cells": [
        "FOCUS",
        "FORD",
        "YES",
        "5,000",
        "2.5",
        "0.02",
        "5,600",
        "0",
        "Electric",
        "MR VENDOR"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.translantik.step_definitions.GeneralInformationDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"User\" should be able to login with its \"Password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.translantik.step_definitions.GeneralInformationDefs.shouldBeAbleToLoginWithIts(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can navigate to the \"General Infirmation\" page by clicking on the \"eye\" sign under \u0027\u0027...\u0027\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.translantik.step_definitions.GeneralInformationDefs.user_can_navigate_to_the_page_by_clicking_on_the_sign_under()"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Step [User can navigate to the {string} page by clicking on the {string} sign under {string}...{string}] is defined with 0 parameters at \u0027com.translantik.step_definitions.GeneralInformationDefs.user_can_navigate_to_the_page_by_clicking_on_the_sign_under()