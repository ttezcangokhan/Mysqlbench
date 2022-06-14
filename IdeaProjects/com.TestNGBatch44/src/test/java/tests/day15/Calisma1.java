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
    package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

    public class C02_HandleDropdown {
        WebDriver driver;

        @BeforeMethod
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @Test
        public void dropdownTesti() throws InterruptedException {
            // Dropdown'da var olan seceneklerden birini secmek icin
            // 1.adim : Dropdown webelemntini locate edip bir degiskene atiyoruz
            driver.get("https://www.amazon.com");
            WebElement dropdownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

            // 2.adim : Select class'indan bir obje olusturalim
            // ve parametre olarak locate ettigimiz Webelementi yazalim

            Select select=new Select(dropdownElementi);

            // 3.adim select objesini kullanarak, Select class'inda var olan 3 secim method'undan
            //  istedigimizi kullanarak dropdown'da var olan option'lardan birini sacebiliriz
            //  secim yapmamiza yardim eden bu 3 method void'dir dolayisiyla bize bir sey dondurmezler

            select.selectByIndex(3);

            // eger sectigimiz option degerini yazdirmak istersek
            System.out.println(select.getFirstSelectedOption().getText()); //Baby

            Thread.sleep(3000);

            select.selectByVisibleText("Deals");

            Thread.sleep(3000);

            select.selectByValue("search-alias=arts-crafts-intl-ship");

            List<WebElement> optionList = select.getOptions();

            for (WebElement each: optionList
            ) {
                System.out.println(each.getText());
            }


        }

        @AfterMethod
        public void teardown(){
            driver.close();
        }

    }
}