package by.org.ducks.home;

import by.org.ducks.authorization.LoginPage;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static by.org.ducks.testBase.Locators.getLocator;

public class HomePage {

    Logger LOG = Logger.getLogger(LoginPage.class);
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open rubber ducks page")
    public void openRubberDucksPage() throws Exception {
        LOG.info(("Opening rubber ducks page"));
        driver.findElement(getLocator("homePage.rubberDucksButton")).click();
    }

    @Step("Open homepage")
    public void openHomePage() throws Exception {
        LOG.info(("Opening homepage"));
        driver.findElement(getLocator("homePage.homePageButton")).click();
    }
}
