package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class Calisma1 extends TestBase {

    WebElement aramaKutusu;
    WebElement tumSayfaScreenshot;
    @Test
    public void nutellaTest() throws IOException {

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Java" + Keys.ENTER);
        tumSayfaScreenshot();
    }
    @Test
            public void test02(){
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        tumSayfaScreenshot();
    }
    @Test
    public void test03(){
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Elma" + Keys.ENTER);
        tumSayfaScreenshot();

    }
}
