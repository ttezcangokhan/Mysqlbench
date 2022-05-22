package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class calisma {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Test
    public void authenticationTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        System.out.println("ilk sayfanin window handle degeri : " + driver.getWindowHandle());
        String windowHandleDegeri1=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        System.out.println( "2.sayfanin handle degeri : " + driver.getWindowHandle());
        String windowHandleDegeri2=driver.getWindowHandle();

        Set<String> handleDegerleriSet=driver.getWindowHandles();
        System.out.println(handleDegerleriSet);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");

        Thread.sleep(5000);


        driver.switchTo().window(windowHandleDegeri1);
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchbox']"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        Thread.sleep(3000);


        driver.switchTo().window(windowHandleDegeri2);
        Assert.assertTrue(driver.getTitle().contains("Best Buy"));

        handleDegerleriSet=driver.getWindowHandles();

        String windowHandleDegeri3="";
        for (String each: handleDegerleriSet
             ) {
            if (!each.equals(windowHandleDegeri1)||each.equals(windowHandleDegeri2)){
               windowHandleDegeri3=each;

            }

        }

        System.out.println(windowHandleDegeri3);
        System.out.println(handleDegerleriSet);

        driver.switchTo().window(windowHandleDegeri3);

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.faebook.com");

        Thread.sleep(5000);





    }
    @AfterClass
    public void teardown(){
        driver.close();
    }



}
