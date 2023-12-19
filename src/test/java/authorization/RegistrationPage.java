package authorization;

import org.openqa.selenium.WebDriver;

import static testBase.Locators.getLocator;

public class RegistrationPage {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRegistrationPage() throws Exception {
        driver.findElement(getLocator("loginPage.registrationButton")).click();
    }
}
