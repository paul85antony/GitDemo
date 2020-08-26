package domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class ExpediaHomePage extends BasePage<ExpediaHomePage> {

    WebElement signInLInk;


    public static ExpediaHomePage open() {
        new ExpediaHomePage().get("https://www.expedia.com/");
        return PageFactory.initElements(driver, ExpediaHomePage.class);

    }

    public ExpediaHomePage selectSignInLink() {
        driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
        return PageFactory.initElements(driver,ExpediaHomePage.class);


    }
}
