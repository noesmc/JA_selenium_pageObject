package authorization;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestLogin extends TestBase {

    @Test(groups = "negative")
    public void successfulLoginTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("nikita_sinyukovich@mail.ru", "1Qaz1Qaz");
        Assert.assertEquals(loginPage.getText("profilePage.editAccountButton"), "Edit Account");
    }
}