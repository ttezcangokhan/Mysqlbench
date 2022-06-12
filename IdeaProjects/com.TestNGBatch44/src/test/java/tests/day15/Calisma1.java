package tests.day15;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class Calisma1 extends TestBase {

    WebElement aramaKutusu;
    @Test
    public void test01() throws IOException {

        Actions actions=new Actions(driver);
        driver.get("https://www.amazon.com");
        WebElement listElementi=driver.findElement(By.xpath("//span[text()='a-button-input']"));
        actions.click(listElementi).perform();
        aramaKutusu = driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Java" + Keys.ENTER);
        tumSayfaScreenshot();
    }

    @Test
    public void test02() throws IOException {
        aramaKutusu = driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        tumSayfaScreenshot();
    }

    @Test
    public void test03() throws IOException {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Elma" + Keys.ENTER);
        tumSayfaScreenshot();
    }
}