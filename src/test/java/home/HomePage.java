package home;

import org.openqa.selenium.WebDriver;

import static testBase.Locators.getLocator;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRubberDucksPage() throws Exception {
        driver.findElement(getLocator("homePage.rubberDucksButton")).click();
    }

    public void openHomePage() throws Exception {
        driver.findElement(getLocator("homePage.homePageButton")).click();
    }
}
