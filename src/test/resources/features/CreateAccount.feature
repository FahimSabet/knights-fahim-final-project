@Regression
Feature: Create Account

  Background:
    When click on Create Primary Account

@US_4
  Scenario: Validating clicking on create primary account form

    Then user should see the form title as "Create Primary Account Holder"


    @US_5
    Scenario Outline: Validating filling the form
#      When click on Create Primary Account
      Then enter Email Address as "<Email Address>"
      Then enter First Name as "<First Name>"
      Then enter Last Name as "<Last Name>"
      Then enter Gender as "Male"
      Then Marital Status as "Single"
      Then enter Employment Status as "Teacher"
      Then enter Date of Birth as "10/12/2000"
      Then enter titlePrefix as "Mr."
      Then click on Create Account
      Then validate user can see the email address as

      Examples:
      |Email Address | First Name |Last Name
      |james@gmail.com| James | Watt

@US_13
  Scenario Outline: Validating filling the form
#      When click on Create Primary Account
    Then enter Email Address as "<Email Address>"
    Then enter First Name as "<First Name>"
    Then enter Last Name as "<Last Name>"
    Then enter Gender as "Male"
    Then Marital Status as "Single"
    Then enter Employment Status as "Teacher"
    Then enter Date of Birth as "10/12/2000"
    Then enter titlePrefix as "Mr."
    Then click on Create Account
    Then in the form enter username as "supervisor"
    Then in the form enter password as "tek_supervisor"
    Then in the form enter confirmPassword as "tek_supervisor"
    Then click on submit

    Examples:
      |Email Address | First Name |Last Name
      |johny@gmail.com| James | Watt

      @US_6
      Scenario Outline: : Validating information with an existing email address
#        When click on Create Primary Account
        Then enter Email Address as "<Email Address>"
        Then enter First Name as "<First Name>"
        Then enter Last Name as "<Last Name>"
        Then enter Gender as "Male"
        Then Marital Status as "Married"
        Then enter Employment Status as "Student"
        Then enter Date of Birth as "10/12/1978"
        Then enter titlePrefix as "Mr."
        Then click on Create Account
        Then validate the error message as "ERROR"

        Examples:
          |Email Address | First Name |Last Name|
          |Sam.Perry@yahoo.com| Sale | Johns    |

