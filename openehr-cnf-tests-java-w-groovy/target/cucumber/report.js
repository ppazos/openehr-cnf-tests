$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("org/openehr/sample.feature");
formatter.feature({
  "name": "Feature A",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "background",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "first step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "A good start",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "first step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "second step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:19"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat org.openehr.CucumberSteps.lambda$new$1(CucumberSteps.java:21)\n\tat ✽.second step(org/openehr/sample.feature:7)\n",
  "status": "pending"
});
formatter.step({
  "name": "third step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:24"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Followed by some examples",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u003cx\u003e step",
  "keyword": "When "
});
formatter.step({
  "name": "\u003cy\u003e step",
  "keyword": "Then "
});
formatter.examples({
  "name": "examples 1 name",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "x",
        "y"
      ]
    },
    {
      "cells": [
        "second2",
        "third2"
      ]
    },
    {
      "cells": [
        "second2",
        "third3"
      ]
    }
  ]
});
formatter.background({
  "name": "background",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "first step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Followed by some examples",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "second2 step",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberSteps.java:29"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat org.openehr.CucumberSteps.lambda$new$3(CucumberSteps.java:31)\n\tat ✽.second2 step(org/openehr/sample.feature:12)\n",
  "status": "pending"
});
formatter.step({
  "name": "third2 step",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.java:34"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "background",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "first step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Followed by some examples",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "second2 step",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberSteps.java:29"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat org.openehr.CucumberSteps.lambda$new$3(CucumberSteps.java:31)\n\tat ✽.second2 step(org/openehr/sample.feature:12)\n",
  "status": "pending"
});
formatter.step({
  "name": "third3 step",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.java:34"
});
formatter.result({
  "status": "skipped"
});
formatter.examples({
  "name": "examples 2 name",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "x",
        "y"
      ]
    },
    {
      "cells": [
        "second3",
        "third3"
      ]
    }
  ]
});
formatter.background({
  "name": "background",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "first step",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Followed by some examples",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "second3 step",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberSteps.java:29"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat org.openehr.CucumberSteps.lambda$new$3(CucumberSteps.java:31)\n\tat ✽.second3 step(org/openehr/sample.feature:12)\n",
  "status": "pending"
});
formatter.step({
  "name": "third3 step",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.java:34"
});
formatter.result({
  "status": "skipped"
});
});