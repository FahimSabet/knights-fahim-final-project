
Feature: Login with valid credentials

  Background:
    When click on Login button

  @US_5
  Scenario: Validate login with valid username and password

    Then click on sign_in button
    Then enter username as "supervisor"
    Then enter password as "tek_supervisor"
    Then click on sign_in button
    Then validate that "Customer Service Portal" is visible


    @US_6
    Scenario: Validate login with invalid username and password
#      When click on Login button
      Then enter username as "face wash"
      Then enter password as "john cena"
      Then click on sign_in button
      Then validate the login error message as "ERROR"
