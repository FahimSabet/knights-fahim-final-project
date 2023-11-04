package tek.bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {




    public final static By CREATE_PRIMARY_ACCOUNT_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/a");

    public final static By CREATE_PRIMARY_ACCOUNT_HOLDER = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2");


//    public final static By CREATE_PRIMARY_ACCOUNT_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2");


    public final static By EMAIL_ADDRESS = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[1]/input");

    public final static By FIRST_NAME = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[3]/input");

    public final static By LAST_NAME = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[4]/input");

    public final static By GENDER = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select");

    public final static By GENDER_MALE = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select/option[2]");

    public final static By EMPLOYMENT_STATUS = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[7]/input");

    public final static By MARITAL_STATUS = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[6]/div/select");

    public final static By MARITAL_SINGLE = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[6]/div/select/option[3]");

    public final static By DATE_OF_BIRTH = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[8]/input");

    public final static By TITLE_PREFIX = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[2]/div/select");

    public final static By MR_PREFIX = By.xpath("//div[2]/div/select/option[2]");

    public final static By CREATE_ACCOUNT_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");

    public final static By SIGN_UP_AND_EMAIL_SEEN_IN_THE_ABOVE = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[1]");

    public final static By ERROR_MESSAGE = By.xpath("//div[text()='ERROR']");
}

