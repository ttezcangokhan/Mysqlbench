package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class asdgh extends TestBase {


    @Test
    public void test(){
        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotouchsearchtextbox"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
    }
}
