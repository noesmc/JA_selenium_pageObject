package store;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static testBase.Locators.getLocator;

public class StorePage {
    WebDriver driver;

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open store")
    public void openStore() throws Exception {
        driver.findElement(getLocator("storePage.checkoutButton")).click();
    }
}
