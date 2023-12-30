package by.org.ducks.store;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import by.org.ducks.testBase.TestBase;

public class TestStore extends TestBase {

    @Test
    @Description("Checking redirection to the store page")
    public void openStorePage() throws Exception {
        StorePage storePage = new StorePage(driver);

        storePage.openStore();
        Assert.assertEquals(driver.getTitle(), "Checkout | My Store", "Checkout isn't open");
    }
}
