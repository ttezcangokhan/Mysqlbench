package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//2- Add Element butonuna basin
//3- Delete butonu’nun gorunur oldugunu test edin
//4- Delete tusuna basin
//5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\41763\\IdeaProjects\\com.seleniumilkProje\\resorces\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
       WebElement addYazisiElementi=driver.findElement(By.xpath("//h3"));
       WebElement addYazisiElementi2=driver.findElement(By.tagName("h3"));


    }
}
