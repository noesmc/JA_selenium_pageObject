package authorization;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;

public class TestLogin extends TestBase {

    @Test
    public void successfulLoginTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("nikita_sinyukovich@mail.ru", "1Qaz1Qaz");
        Assert.assertEquals(loginPage.getText("profilePage.editAccountButton"), "Edit Account");
    }
}
