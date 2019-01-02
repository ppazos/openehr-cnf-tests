Feature: Feature A
  Background: background
    Given first step

  Scenario: A good start
    Given first step
    Given second step
    Given third step


  Scenario Outline: Followed by some examples
    When <x> step
    Then <y> step
    Examples: examples 1 name
      |   x    |   y   |
      | second2 | third2 |
      | second2 | third3 |
    Examples: examples 2 name
      |   x    |   y   |
      | second3 | third3 |
