package moneyGaming;

import moneyGaming.utils.Driver;
import moneyGaming.utils.MoneyGamingUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {


    @BeforeMethod
    public void getWebSite(){
        Driver.getDriver().get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }

    @Test
    public void testing(){

        MoneyGamingUtils.selectTitle();

        MoneyGamingUtils.enterNames();

        MoneyGamingUtils.checkTheCheckbox();

        MoneyGamingUtils.clickJoinNow();

        MoneyGamingUtils.assertMessage();
    }

    @AfterMethod
    public void closeDriver(){
        Driver.closeDriver();
    }

}
