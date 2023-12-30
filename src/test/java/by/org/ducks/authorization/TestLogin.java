package by.org.ducks.authorization;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import by.org.ducks.testBase.TestBase;

@Epic("Authorization")
@Feature("Login")

public class TestLogin extends TestBase {

    @Test(groups = "smoke")
    @Description("Login with valid credentials")
    public void successfulLoginTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("nikita_sinyukovich@mail.ru", "1Qaz1Qaz");
        Assert.assertEquals(loginPage.getText("profilePage.editAccountButton"), "Edit Account");
    }

    @Test
    @Description("Login with invalid credentials") //added for getting screenshot in allure report
    public void unsuccessfulLoginTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("pikita_sinyukovich@mail.ru", "1Qaz1Qaz");
        Assert.assertEquals(loginPage.getText("profilePage.editAccountButton"), "Edit Account",
                "Error in credentials");
    }
}
