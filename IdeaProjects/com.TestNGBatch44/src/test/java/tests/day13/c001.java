package tests.day13;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class c001 extends TestBase {

    @Test

    public void test01(){
        String dosyaYolu=System.getProperty("user.home")+"\\downloads\\download.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));




    }

    @Test

    public void downloadTesti() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[.='download.png']")).click();
        Thread.sleep(5000);
    }

}
