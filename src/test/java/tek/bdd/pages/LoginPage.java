package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public final static By LOGIN_BUTTON = By.xpath("//a[@class='chakra-button css-ez23ye']");

    public final static By USER_NAME = By.xpath("//*[@id='username']");

    public final static By PASSWORD = By.xpath("//*[@id='password']");

    public final static By SIGN_IN_BUTTON = By.xpath("//button[@class='chakra-button css-jut409']");

    public final static By CUSTOMER_SERVICE_PORTAL_TITLE = By.xpath("/html/body/div[1]/div/div[1]/div/h2");

    public final static By ERROR_MESSAGE = By.xpath("//div[text()='ERROR']");

}
