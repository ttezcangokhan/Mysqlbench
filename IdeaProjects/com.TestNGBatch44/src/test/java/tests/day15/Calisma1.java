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
import java.nio.file.Files;
import java.nio.file.Paths;

public class Calisma1 extends TestBase {

    WebElement aramaKutusu;
    @Test
    public void test01() throws IOException {
        package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;


        public class C02_FileExists {
            @Test
            public void test01(){

                System.out.println(System.getProperty("user.home")); // C:\Users\Lenovo


                // masaustundeki Deneme klasorunun Path'ini istesem
                // "C:\Users\Lenovo\Desktop\Deneme\selenium.xlsx"

                // Yani dinamik olarak masaustumdeki Deneme klasorunun path'ini yazmak istersem

                String path= System.getProperty("user.home")+"\\Desktop\\Deneme\\selenium.xlsx";

                System.out.println(path);

                System.out.println("user.dir  : "+System.getProperty("user.dir"));

                // Masaustunde Deneme klasoru icerisinde selenium.xlsx isminde bir dosya oldugunu test edin
                // *********** masaustunde Deneme klasoru ve icinde selenium.xlsx olmazsa CALISMAZ********
                // 1- once bu dosyaya ulasmak icin gerekli dinamik path olusturalim

                String dosyaYolu= System.getProperty("user.home")+"\\Desktop\\Deneme\\selenium.xlsx";

                System.out.println(Files.exists(Paths.get(dosyaYolu)));

                // projemizde pom.xml oldugunu test edin
                //C:\Users\Lenovo\B44-QA-TR\06-Selenium\com.TestNGBatch44\pom.xml

                System.out.println(System.getProperty("user.dir")); // projemin yolunu verir
                //C:\Users\Lenovo\B44-QA-TR\06-Selenium\com.TestNGBatch44

                String pomPath=System.getProperty("user.dir") + "\\pom.xml";

                Assert.assertTrue(Files.exists(Paths.get(pomPath)));



            }
        }

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