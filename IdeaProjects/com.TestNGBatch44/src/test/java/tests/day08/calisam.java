package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class calisam {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test(priority = 1)
    public void logoTest(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']")).click();
        WebElement logoElementi=driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logoElementi.isDisplayed());
    }
    @Test(dependsOnMethods = "logoTest")
    public void aramaTesti(){
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        String actualTitle=driver.getTitle();
        String arananKelime="Nutella";
        Assert.assertTrue(actualTitle.contains(arananKelime));
    }
    @Test
    public void fiyatTesti(){

    }

}
