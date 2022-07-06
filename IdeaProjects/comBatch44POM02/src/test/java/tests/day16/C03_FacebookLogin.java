package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get("https://www.facebook.com");
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookies.click();

        Faker faker=new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();

        Assert.assertTrue(facebookPage.girilmediYazisiElementi.isDisplayed());

        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
