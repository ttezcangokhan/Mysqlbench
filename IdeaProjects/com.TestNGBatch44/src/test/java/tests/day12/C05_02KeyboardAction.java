package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_02KeyboardAction extends TestBase {
    @Test
    public void test(){
        driver.get("https://html.com/tags/iframe/");

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement iFrame=driver.findElement(By.className("lazy-loaded"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

    }
}
