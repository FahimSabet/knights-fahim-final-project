@Regression
Feature: Home Page Title and Primary Account Button

  @US_3
  Scenario: Validate Home Page Title and Primary Account Button
    When Validate the Home Page Title is "Tek Insurance UI"
    Then Validate "Create Primary Account" exists

