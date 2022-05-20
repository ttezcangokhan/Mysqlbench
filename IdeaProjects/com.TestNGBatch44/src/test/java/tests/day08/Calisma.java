package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Calisma {
    WebDriver driver;

  @BeforeMethod
  public void setup(){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

  }

    @Test
    public void dropdownTesti(){

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownElementi=driver.findElement(By.xpath("//select[@id='dropdown ']"));
        Select select=new Select(dropdownElementi);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> optionList=select.getOptions();
        for (WebElement each:optionList
             ) {
            System.out.println(each.getText());
        }

        int actualSize=optionList.size();
        int expectedSize=4;

        Assert.assertEquals(actualSize,expectedSize,"karsialamsyr");

    }
}
