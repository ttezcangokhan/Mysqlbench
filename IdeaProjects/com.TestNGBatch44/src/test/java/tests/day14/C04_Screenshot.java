package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C04_Screenshot extends TestBase {
    @Test
    public void screenTest(){
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[text()='Ich stimme zu']")).click();
        TakesScreenshot tss=(TakesScreenshot)driver;

        File tumSayfaSS=new File("src\\tumsayfa.png");
        tumSayfaSS=tss.getScreenshotAs(OutputType.FILE);
        WebElement logoElementi=driver.findElement(By.xpath("(//img[@alt='Google'])[1]"));

        File logoResmi=new File("src/logo.png");
        logoResmi=logoElementi.getScreenshotAs()



    }
}
