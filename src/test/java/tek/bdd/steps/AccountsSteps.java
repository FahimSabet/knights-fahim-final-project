package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.AccountsPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class AccountsSteps extends SeleniumUtility {

    @Then("navigate to accounts")
    public void navigateToAccounts() {
        clickOnElement(AccountsPage.ACCOUNTS_BUTTON);


    }

    @Then("validate {int} rows are visible as default")
    public void validateRowsAreVisible(int expectedNumberOfRowsInTheAccountsTable) {
        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.NUMBER_OF_ROWS_IN_THE_TABLE);
        Assert.assertEquals("Validate the number of rows in the Accounts Table",
                expectedNumberOfRowsInTheAccountsTable, actualNumberOfRowsInTheAccountsTable.size());
//
    }

    //
    @When("change item per page to 10")
    public void changeItemsToTen() throws InterruptedException {
//        Thread.sleep(5000);
        clickOnElement(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_5);
        clickOnElement(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_10);
        Thread.sleep(5000);


    }

    @Then("Validate accounts table has ten {} rows")
    public void validatePageHasTenRows(int expectedTen) throws InterruptedException {
        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.NUMBER_OF_ROWS_IN_THE_TABLE);
        Assert.assertEquals("Validate the number of rows in the Accounts Table which should be 10 rows",
                expectedTen, actualNumberOfRowsInTheAccountsTable.size());
        Thread.sleep(4000);

    }


    @When("change item per page to twenty five 25")
    public void changeItemToTwentyFive() throws InterruptedException {
        clickOnElement(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_25);
        Thread.sleep(3000);

    }
    @Then("Validate accounts table has twenty five {} rows")
    public void validateTableHasTwentyFiveRows(int expectedTwentyFive) throws InterruptedException {
        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.NUMBER_OF_ROWS_IN_THE_TABLE);
        Assert.assertEquals("Validate the number of rows in the Accounts Table which should be 25 rows",
                expectedTwentyFive, actualNumberOfRowsInTheAccountsTable.size());
        Thread.sleep(3000);

    }
    @When("change item per page to fifty 50")
    public void changeItemToFifty() throws InterruptedException {
        clickOnElement(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_50);
        Thread.sleep(3000);


    }
    @Then("Validate accounts table have fifty {} rows")
    public void validateTableHasFiftyRows(int expectedFifty) throws InterruptedException {
        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.NUMBER_OF_ROWS_IN_THE_TABLE);
        Assert.assertEquals("Validate the number of rows in the Accounts Table which should be 25 rows",
                expectedFifty, actualNumberOfRowsInTheAccountsTable.size());
        Thread.sleep(1000);
    }
//    @When("change item per page to {int}")
//    public void changeItemPerPageTwentyFive() {
//       clickOnElement(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_25);
//
//    }

//    @Then("Validate accounts table has twenty five {int} rows")
//    public void validateAccountHasTwentyFive(int expectedTwentyFive) {
//        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.NUMBER_OF_ROWS_IN_THE_TABLE);
//        Assert.assertEquals("Validate the number of rows in the Accounts Table which should be 25 rows",
//                expectedTwentyFive, actualNumberOfRowsInTheAccountsTable.size());
//    }

//
//    @Then("Validate accounts table has {int} rows")
//    public void validateAccountsTableHasTenRowsNow(int expectedTenRows) {
//        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_10);
//        Assert.assertEquals("Validate the number of rows in the Accounts Table which should be 10",
//                expectedTenRows, actualNumberOfRowsInTheAccountsTable.size());
//
//
//
//
//
//    }
//    @When("change item per page to {int}")
//    public void changeItemsToTwentyFive(int expectedTwentyFive) {
//        clickOnElement(AccountsPage.SHOW_NUMBER_OF_ACCOUNTS_25);
//    }
//    @Then("Validate accounts table have {int} rows")
//    public void validateAccountsTableHasTwentyFive(int expectedTwentyFive) {
//        List<WebElement> actualNumberOfRowsInTheAccountsTable = getListOfElements(AccountsPage.NUMBER_OF_ROWS_IN_THE_TABLE);
//        Assert.assertEquals("Validate the number of rows in the Accounts Table which should be 25",
//                expectedTwentyFive, actualNumberOfRowsInTheAccountsTable.size());
//
//    }


    }
