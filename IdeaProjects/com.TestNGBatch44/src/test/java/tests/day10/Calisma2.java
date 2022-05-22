package tests.day10;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class Calisma2 {

    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void windowHandleTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement sayfadakiYaziElementi=driver.findElement(By.tagName("h3"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(sayfadakiYaziElementi.getText(),"Opening a new window","sayfadaki yazi gorulmedi");
        softAssert.assertEquals(driver.getTitle(),"The Internet","sayfa title i beklenenden farkli");
        String windowHandleDeegri1=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> handleDegerleriSeti=driver.getWindowHandles();
        String windowHandleDegeri2="";
        for (String each:handleDegerleriSeti
             ) {
            if (!each.equals(windowHandleDeegri1)){
                windowHandleDegeri2=each;

            }
            
        }

        driver.switchTo().window(windowHandleDegeri2);
        softAssert.assertEquals(driver.getTitle(),"New Window","yeni sayfa title i istenenden farkli");
        WebElement ikinciSayfadakiYaziElementi=driver.findElement(By.tagName("h3"));
        softAssert.assertEquals(ikinciSayfadakiYaziElementi.getText(),"New Window","ikinci sayfadaki yazi istneneden fakrli");

        driver.switchTo().window(windowHandleDeegri1);
        softAssert.assertEquals(driver.getTitle(),"The Internet","ilk sayfanin title i beklenen gibi degildir");







        softAssert.assertAll();


    }


    }


