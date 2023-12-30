package by.org.ducks.goods;

import by.org.ducks.authorization.LoginPage;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static by.org.ducks.testBase.Locators.getLocator;

public class GoodPage {

    Logger LOG = Logger.getLogger(LoginPage.class);

    WebDriver driver;

    public GoodPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Getting web-element's text")
    public String getText(String locator) throws Exception {
        LOG.info("Get text of " + locator);
        return driver.findElement(getLocator(locator)).getText();
    }

    @Step("Open good's page")
    public void openGoodPage() throws Exception {
        LOG.info("Opening page \"Goods\"");
        driver.findElement(getLocator("homePage.popularGoodElement")).click();
    }
}
