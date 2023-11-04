Feature: Accounts

  Background:
    When click on Login button
    Then enter username as "supervisor"
    Then enter password as "tek_supervisor"
    Then click on sign_in button

  @US_11
  Scenario: Validate the accounts
    Then navigate to accounts
    Then validate 5 rows are visible as default


  @US_12
    Scenario: Validate the number of accounts per page 5, 10, 25, 50
#      When click on Login button
#      Then enter username as "supervisor"
#      Then enter password as "tek_supervisor"
#      Then click on sign_in button
      Then navigate to accounts
      When change item per page to 10
#      When Wait 2 seconds
      Then Validate accounts table has ten 10 rows
      When change item per page to twenty five 25
##      When Wait 2 seconds
      Then Validate accounts table has twenty five 25 rows
      When change item per page to fifty 50
##      When Wait 2 seconds
      Then Validate accounts table have fifty 50 rows




