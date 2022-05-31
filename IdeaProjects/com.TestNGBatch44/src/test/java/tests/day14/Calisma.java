package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import javax.swing.*;
import java.time.Duration;

public class Calisma extends TestBase {

    @Test
    public void expilictlywait() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement itsGoneElementi=driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        Assert.assertTrue(itsGoneElementi.isDisplayed());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        WebElement itsBackElementi=driver.findElement(By.xpath("//p[text()=\"It's back!\"]"));
        Assert.assertTrue(itsBackElementi.isDisplayed());
        Thread.sleep(3000);




    }
    @Test
    public void impilicitlywait(){

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.)


    }



}
