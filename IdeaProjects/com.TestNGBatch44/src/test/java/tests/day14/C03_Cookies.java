package tests.day14;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {
    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        driver.manage().getCookies();
        Set<Cookie> cookieSet=driver.manage().getCookies();
        System.out.println(cookieSet);
        int sayac=1;
        for (Cookie each:cookieSet){
            System.out.println(sayac+".cookie: " + each);
            sayac++;
        }
        Assert.assertTrue(cookieSet.size()>5);
        Cookie cookiei18n=driver.manage().getCookieNamed("i18n-prefs");
        System.out.println("cookiei18n degeri:" +cookiei18n);
    }
}
