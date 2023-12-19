import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumTest {

//    @Test
//    public void loginTest() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement loginInput = driver.findElement(By.cssSelector("[type='text'][name='email']"));
//            loginInput.sendKeys("nikita_sinyukovich@mail.ru");
//        WebElement passwordInput = driver.findElement(By.cssSelector("[type='password'][name='password']"));
//        passwordInput.sendKeys("1Qaz1Qaz");
//        WebElement loginButton = driver.findElement(By.cssSelector("td>span.button-set [type='submit'][name='login']"));
//        loginButton.click();
//        try {
//            WebElement editAccountButton = driver.findElement(By.cssSelector("#box-account .content .list-vertical>li:nth-child(3) a"));
//            Assert.assertEquals(editAccountButton.getText(), "Edit Account");
//            driver.quit();
//        } catch (NoSuchElementException e) {
//            Assert.assertEquals(driver.getTitle(), "Login | My Store");
//            driver.quit();
//        }
//    }


//    @Test
//    public void openCheckout() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement checkoutButton = driver.findElement(By.cssSelector("#cart a.link"));
//        checkoutButton.click();
//        Assert.assertEquals(driver.getTitle(), "Checkout | My Store", "Checkout isn't open");
//        driver.quit();
//    }

    @Test
    public void openPopularGood() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement goodsNameFromCatalog = driver.findElement(By.cssSelector("#box-most-popular>div>ul>li:first-child>a>.name"));
        String ducksName = goodsNameFromCatalog.getText();
        goodsNameFromCatalog.click();
        WebElement goodsName = driver.findElement(By.cssSelector("#box-product>div>.title"));
        Assert.assertEquals(ducksName, goodsName.getText());
    }

//    @Test
//    public void openRegistrationPage() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement registrationButton = driver.findElement(By.cssSelector(".content>form>table>tbody>tr:last-child>td"));
//        registrationButton.click();
//        Assert.assertEquals(driver.getTitle(), "Create Account | My Store");
//    }

//    @Test
//    public static void homePageRedirection() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement rubberDucksButton = driver.findElement
//            (By.xpath("//div[@id='site-menu-wrapper']//a[text()='Rubber Ducks']"));
//        rubberDucksButton.click();
//        WebElement homePageButton = driver.findElement
//            (By.xpath("//div[@id='site-menu-wrapper']//i[@title='Home']"));
//        homePageButton.click();
//        Assert.assertEquals(driver.getTitle(), "Online Store | My Store",
//            "Redirection to the page did not occur");
//        driver.quit();
//    }
}