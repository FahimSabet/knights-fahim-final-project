package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class PlansSteps extends SeleniumUtility {


    @Then("click on Plans")
    public void clickOnPlansButton() {
        clickOnElement(PlansPage.PLANS_BUTTON);


    }
    @Then("validate the {int} rows of data is visible")
    public void validateTheRowsInThePlansTable(int expectedRows) {
        List<WebElement> actualTableElements = getListOfElements(PlansPage.TABLE_WITH_4_ROWS);
        Assert.assertEquals("Validate the number of rows", expectedRows, actualTableElements.size());

    }
    @Then("validate Date Created is today's date as {string}")
    public void validateDateCreated(String expectedDateCreated) {

        String actualTodayDate = getElementText(PlansPage.DATE_CREATED);
        Assert.assertEquals("validate date created", expectedDateCreated, actualTodayDate);

//        String actualDateCreated = getElementText(PlansPage.DATE_CREATED);
//        Assert.assertEquals("Validate Date Created", currentDate(), actualDateCreated);

    }
    @Then("validate the Date Expire is tomorrow's date as {string}")
    public void validateDateExpired(String expectedDateExpired) {

        String actualDateExpired = getElementText(PlansPage.DATE_EXPIRE);
        Assert.assertEquals("validate date expired", expectedDateExpired, actualDateExpired);

//        String actualDateExpired = getElementText(PlansPage.DATE_EXPIRE);
//        Assert.assertEquals("Validate Date Expired", tomorrowDate(), actualDateExpired);


    }


}
