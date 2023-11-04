package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {


    @When("click on Login button")
    public void clickLoginButton() {
        clickOnElement(LoginPage.LOGIN_BUTTON);




    }
    @Then("enter username as {string}")
    public void enterUsername(String username) {
        enterValue(LoginPage.USER_NAME, username);


    }
    @Then("enter password as {string}")
    public void enterPassword(String password) throws InterruptedException {
        enterValue(LoginPage.PASSWORD, password);
        Thread.sleep(2000);


    }
    @Then("click on sign_in button")
    public void clickOnSignInButton() throws InterruptedException {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);

        Thread.sleep(2000);


    }
    @Then("validate that {string} is visible")
    public void validateTitleIsVisible(String expectedPageTitle) {
        String actualPageTitle = getElementText(LoginPage.CUSTOMER_SERVICE_PORTAL_TITLE);
        Assert.assertEquals("Validate the title", expectedPageTitle, actualPageTitle);

    }


    @Then("validate the login error message as {string}")
    public void validateErrorMessage(String expectedErrorMessage) throws InterruptedException {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        Thread.sleep(2000);

        Assert.assertEquals("Validate the error message", expectedErrorMessage, actualErrorMessage);

    }
}
