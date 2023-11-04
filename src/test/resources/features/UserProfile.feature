Feature: Valid Credentials and navigate to the customer service portal


  @US_7
  Scenario: Validating the user with valid credentials can see Customer Service Portal
    When click on Login button
    Then enter username as "supervisor"
    Then enter password as "tek_supervisor"
    Then click on sign_in button
    Then validate that "Customer Service Portal" is visible
    Then click on profile button in the top right of the page
    Then validate the User Type is "CSR"
    Then validate the Name is "Supervisor"
    Then validate the Username is "supervisor"
    Then validate the Authorities is "admin"
    Then validate the Logout button is visible
    Then validate the Moon button is visible

  @US_8
    Scenario: Validating the user can logout successfully
      When click on Login button
      Then enter username as "supervisor"
      Then enter password as "tek_supervisor"
      Then click on sign_in button
      Then validate that "Customer Service Portal" is visible
      Then click on profile button in the top right of the page
      Then click on Logout button
      Then validate the user navigates back to the homepage by seeing the home page message as "Lets get you started"



