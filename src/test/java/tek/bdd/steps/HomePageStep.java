package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageStep extends SeleniumUtility {

    @When("Validate the Home Page Title is {string}")
    public void validate_home_page_title(String expectedPageTitle) {
        String actualPageTitle = getElementText(HomePage.PAGE_TITLE);
        Assert.assertEquals("Validate Home Page Title", expectedPageTitle, actualPageTitle);


    }
    @Then("Validate {string} exists")
    public void validate_primary_account_button(String expectedButton) {

        String actualButton = getElementText(HomePage.PRIMARY_ACCOUNT_BUTTON);
        Assert.assertEquals("Validate the Primary Account Button", expectedButton, actualButton );


    }



}
