package authorization;

import org.openqa.selenium.WebDriver;

import static testBase.Locators.getLocator;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) throws Exception {
        driver.findElement(getLocator("loginPage.loginInput")).sendKeys(username);
        driver.findElement(getLocator("loginPage.passwordInput")).sendKeys(password);
        driver.findElement(getLocator("loginPage.loginButton")).click();
    }

    public String getText(String locator) throws Exception {
        return driver.findElement(getLocator(locator)).getText();
    }
}
