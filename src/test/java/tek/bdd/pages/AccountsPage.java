package tek.bdd.pages;

import org.openqa.selenium.By;

public class AccountsPage {

    public final static By ACCOUNTS_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[1]");

    public final static By NUMBER_OF_ROWS_IN_THE_TABLE = By.xpath("//table/tbody/tr");

    public final static By SHOW_NUMBER_OF_ACCOUNTS_5 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[1]");

    public final static By SHOW_NUMBER_OF_ACCOUNTS_10 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[2]");

    public final static By SHOW_NUMBER_OF_ACCOUNTS_25 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[3]");

    public final static By SHOW_NUMBER_OF_ACCOUNTS_50 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[4]");


}
