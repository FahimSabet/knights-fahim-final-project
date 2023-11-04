package tek.bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage {




    public final static By BUTTON_IN_THE_RIGHT = By.xpath("/html/body/div[1]/div/div[1]/div/button");

    public final static By STATUS_ACTIVE = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span/span");

    public final static By USER_TYPE_CSR = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[2]");

    public final static By NAME_SUPERVISOR = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");

    public final static By USER_NAME_SUPERVISOR = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");

    public final static By AUTHORITIES_ADMIN = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");

    public final static By LOGOUT_BUTTON = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");

    public final static By MOON_LOGO = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[2]");

    public final static By HOME_PAGE_MESSAGE = By.xpath("/html/body/div[1]/div/div[2]/div/div/h2[1]");

}
