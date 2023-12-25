package goods;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

@Epic("Goods")

public class TestGoods extends TestBase {
    @Test
    @Description("Checking redirecting to the first good's page from popular row")
    public void openGood() throws Exception {
        GoodPage goodPage = new GoodPage(driver);
        String goodName = goodPage.getText("homePage.popularGoodElement");
        goodPage.openGoodPage();
        Assert.assertEquals(goodPage.getText("goodsPage.goodName"), goodName);
    }
}
