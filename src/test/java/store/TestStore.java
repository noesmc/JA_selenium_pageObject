package store;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestStore extends TestBase {

    @Test
    public void openStorePage() throws Exception {
        StorePage storePage = new StorePage(driver);

        storePage.openStore();
        Assert.assertEquals(driver.getTitle(), "Checkout | My Store", "Checkout isn't open");
    }
}
