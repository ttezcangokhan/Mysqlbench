package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class c01DriverIlktest {

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");

        String actualTitle=Driver.getDriver().getTitle();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        Driver.getDriver().get("https://www.bestbuy.com");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}
