package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class c001 extends TestBase {
    @Test

    public void test01(){
        driver.get("https://html.com/tags/iframe/");

        Actions actions=new Actions(driver);
         actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        WebElement iframeElementi=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframeElementi);
        WebElement fullscreenButton=driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
        actions.click(fullscreenButton).perform();






        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();



    }

}
