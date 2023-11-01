package tek.bdd.steps;


import io.cucumber.java.Before;
import io.cucumber.java.After;
import tek.bdd.utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {
    @Before
    public void openBrowser() {
        openBrowser();
    }

    @After
    public void closeBrowser() {
        closeBrowser();
    }

}
