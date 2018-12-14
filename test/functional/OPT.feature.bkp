Feature: ADL 1.4 OPT Provisioning
  As a REST API client, I want to manage OPTs by using the
  I_DEFINITION_ADL14 so those are available for other
  services and components

  Scenario: Upload an ADL 1.4-based OPT
    Given current count of OPTs is 0
    When the client uploads an OPT to the I_DEFINITION_ADL14 with template_id "encounter"
    Then current count of OPTs is 1

  Scenario: Get template by template_id
    Given current count of OPTs is 0
    When the client uploads an OPT to the I_DEFINITION_ADL14 with template_id "encounter"
    Then the OPT "encounter" is available from the I_DEFINITION_ADL14

  Scenario: List all available Operational Templates
    Given current count of OPTs is 0
    When the client uploads to the I_DEFINITION_ADL14 an OPT with template id in:
      | encounter |
      | triage |
      | lab_order |
    Then current count of OPTs is 3
     And the OPT "encounter" is available from the I_DEFINITION_ADL14
     And the OPT "triage" is available from the I_DEFINITION_ADL14
     And the OPT "lab_order" is available from the I_DEFINITION_ADL14
