@Regression
Feature: User is navigating to Plans

  Background:
    When click on Login button
    Then enter username as "supervisor"
    Then enter password as "tek_supervisor"
    Then click on sign_in button
    Then click on Plans

  @US_9
  Scenario: Validate the user can navigate to the plans page and see 4 rows of data

    Then validate the 4 rows of data is visible


  @US_10
  Scenario: Validate the date created and date expired
#    When click on Login button
#    Then enter username as "supervisor"
#    Then enter password as "tek_supervisor"
#    Then click on sign_in button
#    Then click on Plans
    Then validate Date Created is today's date
    Then validate the Date Expire is tomorrow's date



