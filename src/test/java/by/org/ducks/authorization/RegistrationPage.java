package by.org.ducks.authorization;

import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static by.org.ducks.testBase.Locators.getLocator;

public class RegistrationPage {

    Logger LOG = Logger.getLogger(LoginPage.class);
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open registration page")
    public void openRegistrationPage() throws Exception {
        LOG.info(("Opening registration page"));
        driver.findElement(getLocator("loginPage.registrationButton")).click();
    }
}
