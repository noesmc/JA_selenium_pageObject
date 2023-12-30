package by.org.ducks.goods;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static by.org.ducks.testBase.Locators.getLocator;

public class GoodPage {

    WebDriver driver;

    public GoodPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Getting web-element's text")
    public String getText(String locator) throws Exception {
        return driver.findElement(getLocator(locator)).getText();
    }

    @Step("Open good's page")
    public void openGoodPage() throws Exception {
        driver.findElement(getLocator("homePage.popularGoodElement")).click();
    }
}
