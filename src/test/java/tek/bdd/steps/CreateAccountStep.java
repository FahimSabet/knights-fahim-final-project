package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.CreateAccountPage;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountStep extends SeleniumUtility {


    @When("click on Create Primary Account")
    public void clickOnPrimaryAccountButton() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
//        String actualPrimaryButton = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
//        Assert.assertEquals("validating the primary account button", expectedButton, actualPrimaryButton);


    }
    @Then("user should see the form title as {string}")
    public void validate_form_title (String expectedFormTitle) {
        String actualFormTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER);
        Assert.assertEquals("validating the primary account holder form", expectedFormTitle, actualFormTitle);



    }


    @Then("enter Email Address as {string}")
    public void enterEmailAddress(String emailAdd) {
        enterValue(CreateAccountPage.EMAIL_ADDRESS, emailAdd);

    }
    @Then("enter First Name as {string}")
    public void enterFirstName(String firstName) {
        enterValue(CreateAccountPage.FIRST_NAME, firstName);



    }
    @Then("enter Last Name as {string}")
    public void enterLastName(String lastName) {
        enterValue(CreateAccountPage.LAST_NAME, lastName);


    }
    @Then("enter Gender as {string}")
    public void enterGender(String Male) {
        getDriver().findElement(CreateAccountPage.GENDER).sendKeys("Other");


//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select")).click();
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select/option[2]")).click();

//        clickOnElement(CreateAccountPage.GENDER);
//        clickOnElement(CreateAccountPage.GENDER_MALE);
//        selectfromDropDownByText(CreateAccountPage.GENDER_MALE, Male);


    }
    @Then("Marital Status as {string}")
    public void enterMaritalStatus(String maritalStatus) {
//        clickOnElement(CreateAccountPage.MARITAL_STATUS);
//        selectFromDropDown(CreateAccountPage.MARITAL_SINGLE, maritalStatus);

        selectFromDropDown(CreateAccountPage.MARITAL_STATUS, CreateAccountPage.MARITAL_SINGLE);


    }
    @Then("enter Employment Status as {string}")
    public void enterEmploymentStatus(String employmentStatus) {
        enterValue(CreateAccountPage.EMPLOYMENT_STATUS, employmentStatus);

    }
    @Then("enter Date of Birth as {string}")
    public void enterDateOfBirth(String dateOfBirth) {
        enterValue(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);

    }

    @Then("enter titlePrefix as {string}")
    public void enterTitle(String titlePrefix) {
        clickOnElement(CreateAccountPage.TITLE_PREFIX);
        selectFromDropDown(CreateAccountPage.MR_PREFIX, titlePrefix);

   }

    @Then("click on Create Account")
    public void clickOnCreateAccount() {
clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);


    }


    @Then("validate user can see the email address as")
    public void validateEmailAddressCanBeSeen() {
     getElementText(CreateAccountPage.SIGN_UP_AND_EMAIL_SEEN_IN_THE_ABOVE);
    }



    @Then("validate the error message as {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(CreateAccountPage.ERROR_MESSAGE);
        Assert.assertEquals("validating the error message", expectedErrorMessage, actualErrorMessage);

    }

}
