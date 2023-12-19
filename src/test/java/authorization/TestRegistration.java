package authorization;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestRegistration extends TestBase {
    @Test
    public void openRegistrationPage() throws Exception {
        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.openRegistrationPage();
        Assert.assertEquals(driver.getTitle(), "Create Account | My Store");
    }
}

