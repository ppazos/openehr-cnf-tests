Feature: ADL 1.4 OPT Provisioning for EHRSCAPE
  As a REST API client, I want to manage OPTs by using the I_DEFINITION_ADL14
  so those are available for other services and components

  Scenario: EHRSCAPE list opts
    When the client lists the templates from EHRSCAPE
    Then there are many templates in EHRSCAPE
