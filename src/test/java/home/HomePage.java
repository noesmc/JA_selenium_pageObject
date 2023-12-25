package home;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static testBase.Locators.getLocator;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open rubber ducks page")
    public void openRubberDucksPage() throws Exception {
        driver.findElement(getLocator("homePage.rubberDucksButton")).click();
    }

    @Step("Open homepage")
    public void openHomePage() throws Exception {
        driver.findElement(getLocator("homePage.homePageButton")).click();
    }
}
