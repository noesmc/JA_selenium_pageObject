package authorization;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

@Epic("Authorization")
@Feature("Registration")

public class TestRegistration extends TestBase {
    @Test
    @Description("Checking redirecting to registration page")
    public void openRegistrationPage() throws Exception {
        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.openRegistrationPage();
        Assert.assertEquals(driver.getTitle(), "Create Account | My Store");
    }
}

