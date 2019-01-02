$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OPT.feature");
formatter.feature({
  "line": 1,
  "name": "ADL 1.4 OPT Provisioning",
  "description": "As a REST API client, I want to manage OPTs by using the\nI_DEFINITION_ADL14 so those are available for other\nservices and components",
  "id": "adl-1.4-opt-provisioning",
  "keyword": "Feature"
});
formatter.before({
  "duration": 719541,
  "status": "passed"
});
formatter.before({
  "duration": 1287717,
  "status": "passed"
});
formatter.before({
  "duration": 7465460,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Upload an ADL 1.4-based OPT",
  "description": "",
  "id": "adl-1.4-opt-provisioning;upload-an-adl-1.4-based-opt",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "current count of OPTs is 0",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the client uploads an OPT to the I_DEFINITION_ADL14 with template_id \"encounter\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "current count of OPTs is 1",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 25
    }
  ],
  "location": "OPT_steps.groovy:162"
});
formatter.result({
  "duration": 941843451,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "encounter",
      "offset": 70
    }
  ],
  "location": "OPT_steps.groovy:167"
});
formatter.result({
  "duration": 81699629,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 25
    }
  ],
  "location": "OPT_steps.groovy:162"
});
formatter.result({
  "duration": 8936426,
  "status": "passed"
});
formatter.after({
  "duration": 28305170,
  "status": "passed"
});
formatter.after({
  "duration": 101125,
  "status": "passed"
});
formatter.after({
  "duration": 443820,
  "status": "passed"
});
formatter.before({
  "duration": 21677,
  "status": "passed"
});
formatter.before({
  "duration": 579418,
  "status": "passed"
});
formatter.before({
  "duration": 233146,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Get template by template_id",
  "description": "",
  "id": "adl-1.4-opt-provisioning;get-template-by-template-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "current count of OPTs is 0",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the client uploads an OPT to the I_DEFINITION_ADL14 with template_id \"encounter\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the OPT \"encounter\" is available from the I_DEFINITION_ADL14",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 25
    }
  ],
  "location": "OPT_steps.groovy:162"
});
formatter.result({
  "duration": 10494541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "encounter",
      "offset": 70
    }
  ],
  "location": "OPT_steps.groovy:167"
});
formatter.result({
  "duration": 9105034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "encounter",
      "offset": 9
    }
  ],
  "location": "OPT_steps.groovy:172"
});
formatter.result({
  "duration": 37606364,
  "status": "passed"
});
formatter.after({
  "duration": 18335631,
  "status": "passed"
});
formatter.after({
  "duration": 43905,
  "status": "passed"
});
formatter.after({
  "duration": 221903,
  "status": "passed"
});
formatter.before({
  "duration": 20717,
  "status": "passed"
});
formatter.before({
  "duration": 220365,
  "status": "passed"
});
formatter.before({
  "duration": 190068,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "List all available Operational Templates",
  "description": "",
  "id": "adl-1.4-opt-provisioning;list-all-available-operational-templates",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "current count of OPTs is 0",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the client uploads to the I_DEFINITION_ADL14 an OPT with template id in:",
  "rows": [
    {
      "cells": [
        "encounter"
      ],
      "line": 19
    },
    {
      "cells": [
        "triage"
      ],
      "line": 20
    },
    {
      "cells": [
        "lab_order"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "current count of OPTs is 3",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the OPT \"encounter\" is available from the I_DEFINITION_ADL14",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the OPT \"triage\" is available from the I_DEFINITION_ADL14",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "the OPT \"lab_order\" is available from the I_DEFINITION_ADL14",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 25
    }
  ],
  "location": "OPT_steps.groovy:162"
});
formatter.result({
  "duration": 12309808,
  "status": "passed"
});
formatter.match({
  "location": "OPT_steps.groovy:209"
});
formatter.result({
  "duration": 48070044,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "OPT_steps.groovy:162"
});
formatter.result({
  "duration": 4864375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "encounter",
      "offset": 9
    }
  ],
  "location": "OPT_steps.groovy:172"
});
formatter.result({
  "duration": 10416843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "triage",
      "offset": 9
    }
  ],
  "location": "OPT_steps.groovy:172"
});
formatter.result({
  "duration": 5423853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lab_order",
      "offset": 9
    }
  ],
  "location": "OPT_steps.groovy:172"
});
formatter.result({
  "duration": 6810483,
  "status": "passed"
});
formatter.after({
  "duration": 5219109,
  "status": "passed"
});
formatter.after({
  "duration": 18777,
  "status": "passed"
});
formatter.after({
  "duration": 171345,
  "status": "passed"
});
formatter.uri("OPT_ehr_scape.feature");
formatter.feature({
  "line": 1,
  "name": "ADL 1.4 OPT Provisioning for EHRSCAPE",
  "description": "As a REST API client, I want to manage OPTs by using the I_DEFINITION_ADL14\nso those are available for other services and components",
  "id": "adl-1.4-opt-provisioning-for-ehrscape",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26547,
  "status": "passed"
});
formatter.before({
  "duration": 227157,
  "status": "passed"
});
formatter.before({
  "duration": 151288,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "EHRSCAPE list opts",
  "description": "",
  "id": "adl-1.4-opt-provisioning-for-ehrscape;ehrscape-list-opts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the client lists the templates from EHRSCAPE",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "there are many templates in EHRSCAPE",
  "keyword": "Then "
});
formatter.match({
  "location": "OPT_ehr_scape_steps.groovy:118"
});
formatter.result({
  "duration": 3189065065,
  "status": "passed"
});
formatter.match({
  "location": "OPT_ehr_scape_steps.groovy:143"
});
formatter.result({
  "duration": 5501231,
  "status": "passed"
});
formatter.after({
  "duration": 5824554,
  "status": "passed"
});
formatter.after({
  "duration": 25210,
  "status": "passed"
});
formatter.after({
  "duration": 183808,
  "status": "passed"
});
});