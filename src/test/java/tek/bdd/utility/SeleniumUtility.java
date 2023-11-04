package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;
import tek.bdd.pages.CreateAccountPage;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class SeleniumUtility extends BaseSetup {
public static String today;
public static String tomorrow;

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }

    private WebElement waitUntilVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitUntilElementClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    private List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void clickOnElement(By locator) {
        waitUntilElementClickable(locator).click();
    }


    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
    }

    public boolean isElementEnabled(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isEnabled();
    }

    public void enterValue(By locator, String text) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        element.sendKeys(text);
    }

    public void selectFromDropDown(By locator1, By locator2) {
        clickOnElement(locator1);
        clickOnElement(locator2);
    }

    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElement(locator);
    }

    public byte[] takeScreenshot() {
        //Somehow attached screenshot of the failure
        //Step 1) Take Screenshot with Selenium
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        //for cucumber reports Output Type should Byte[]
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }

    public void selectFromDropDown(By locator, String option) {
        List<WebElement> itemPerPageOptions = getListOfElements(locator);

        for (WebElement element : itemPerPageOptions) {
            String text = element.getText();
            if (text.contains(option)) {
                element.click();
            }
        }
    }

        public static String currentDate() {
            LocalDate today1 = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            today = today1.format(formatter).trim();
            return today;


    }

    public static String tomorrowDate() {
        LocalDate today1 = LocalDate.now();
        LocalDate tomorrow1 = today1.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        tomorrow = tomorrow1.format(formatter).trim();
        return tomorrow;
    }
}


