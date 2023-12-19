package home;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestHomePage extends TestBase {

    @Test
    public void openHomePage() throws Exception {
        HomePage homePage = new HomePage(driver);

        homePage.openRubberDucksPage();
        homePage.openHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store",
            "Redirection to the page did not occur");
    }

}
