package by.org.ducks.store;

import by.org.ducks.authorization.LoginPage;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static by.org.ducks.testBase.Locators.getLocator;

public class StorePage {

    Logger LOG = Logger.getLogger(LoginPage.class);
    WebDriver driver;

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open store")
    public void openStore() throws Exception {
        LOG.info("Opening store page");
        driver.findElement(getLocator("storePage.checkoutButton")).click();
    }
}
