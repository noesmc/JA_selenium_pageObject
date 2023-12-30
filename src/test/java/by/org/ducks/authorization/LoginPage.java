package by.org.ducks.authorization;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static by.org.ducks.testBase.Locators.getLocator;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Entering credentials, clicking login button")
    public void login(String username, String password) throws Exception {
        driver.findElement(getLocator("loginPage.loginInput")).sendKeys(username);
        driver.findElement(getLocator("loginPage.passwordInput")).sendKeys(password);
        driver.findElement(getLocator("loginPage.loginButton")).click();
    }

    @Step("Getting web-element's text")
    public String getText(String locator) throws Exception {
        return driver.findElement(getLocator(locator)).getText();
    }
}
