package tests.day14;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.util.Set;

public class calisma extends TestBase {

    @Test
    public void test01(){
      driver.get("https://google.com");
      driver.findElement(By.xpath("//div[text()='Ich stimme zu']")).click();
      TakesScreenshot tss= (TakesScreenshot) driver;
      File tumSayfaSS=new File("src\\tumSayfa.png");
      tumSayfaSS=tss.getScreenshotAs(OutputType.FILE);

            
        }



    }







