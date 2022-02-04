package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.awt.*;
import java.time.Duration;

public class C03_IFrame extends TestBase {

    WebDriver driver;
    private Label istenenYaziElementi;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void  iFrameTesti(){

        driver.get("https://the-internet.herokuapp.com/basic_auth");
        WebElement IstenilenYaziElementi=driver.findElement(By.tagName("h3"));
        SoftAssert sortAssert=new SoftAssert();
        sortAssert.assertTrue(IstenilenYaziElementi.isEnabled(),"");
        System.out.println(istenenYaziElementi.getText());
        WebElement iFrame=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);

        WebElement textBox=driver.findElement(By.tagName("p"));
        textBox.clear();
        textBox.sendKeys("Merhaba Dünya");
        driver.findElement(By.xpath("//a[text()='ElementalSelenium']")).click();
    }

}
