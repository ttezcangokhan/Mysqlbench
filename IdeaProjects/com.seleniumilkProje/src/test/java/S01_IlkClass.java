import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01_IlkClass {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\41763\\IdeaProjects\\com.seleniumilkProje\\resorces\\drivers\\chromedriver.exe");
        WebDriver driver;

        driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("suanki url" + driver.getCurrentUrl());
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        System.out.println("suanki sayfa basligi " + driver.getTitle());

        driver.close();

    }
}
