package by.org.ducks.home;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import by.org.ducks.testBase.TestBase;

public class TestHomePage extends TestBase {

    @Test
    @Description("Checking redirecting to the homepage")
    public void openHomePage() throws Exception {
        HomePage homePage = new HomePage(driver);

        homePage.openRubberDucksPage();
        homePage.openHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store",
            "Redirection to the page did not occur");
    }

}
