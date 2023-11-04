package tek.bdd.pages;

import org.openqa.selenium.By;

public class PlansPage {

    public final static By PLANS_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]");

    public final static By TABLE_WITH_4_ROWS = By.xpath("//table/tbody/tr");

    public final static By DATE_CREATED = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]");

    public final static By DATE_EXPIRE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]");


}
