package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.UserProfilePage;
import tek.bdd.utility.SeleniumUtility;

public class UserProfileSteps extends SeleniumUtility {

    @Then("click on profile button in the top right of the page")
    public void clickOnButtonAtTheRight() {
        clickOnElement(UserProfilePage.BUTTON_IN_THE_RIGHT);


    }
    @Then("validate the User Type is {string}")
    public void validateUserType(String expectedUserType) {

        String actualUserType = getElementText(UserProfilePage.USER_TYPE_CSR);
        Assert.assertEquals("Validate UserType", expectedUserType, actualUserType);

    }
    @Then("validate the Name is {string}")
    public void validateName(String expectedName) {

        String actualName = getElementText(UserProfilePage.NAME_SUPERVISOR);
        Assert.assertEquals("Validate the name", expectedName, actualName);

    }
    @Then("validate the Username is {string}")
    public void validateUserName(String expectedUserName) {

        String actualUserName = getElementText(UserProfilePage.USER_NAME_SUPERVISOR);
        Assert.assertEquals("Validate UserName", expectedUserName, actualUserName);



    }
    @Then("validate the Authorities is {string}")
    public void validateAuthorities(String expectedAuthorities) {

        String actualAuthorities = getElementText(UserProfilePage.AUTHORITIES_ADMIN);
        Assert.assertEquals("Validate the Authorities", expectedAuthorities, actualAuthorities);

    }
    @Then("validate the Logout button is visible")
    public void validateLogoutButton() {
        boolean logoutButton = isElementEnabled(UserProfilePage.LOGOUT_BUTTON);
        Assert.assertTrue("Validate logout button", logoutButton);

    }
    @Then("validate the Moon button is visible")
    public void validateMoonButton() {
        boolean moonButton = isElementEnabled(UserProfilePage.MOON_LOGO);
        Assert.assertTrue("Validate the moon button", moonButton);

    }

    @Then("click on Logout button")
    public void clickOnLogoutButton() {
        clickOnElement(UserProfilePage.LOGOUT_BUTTON);


    }
    @Then("validate the user navigates back to the homepage by seeing the home page message as {string}")
    public void validateUserSeesTheHomePageMessage(String expectedHomePageMessage) {

        String actualHomePageMessage = getElementText(UserProfilePage.HOME_PAGE_MESSAGE);
        Assert.assertEquals("Validate the HomePageMessage", expectedHomePageMessage, actualHomePageMessage);





    }





}


