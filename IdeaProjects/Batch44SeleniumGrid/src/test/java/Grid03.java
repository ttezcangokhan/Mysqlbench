import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid03 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setPlatform(Platform.WINDOWS);
        cap.setBrowserName("chrome");
        cap.setVersion("192.168.1.61:4444");
        ChromeOptions options= new ChromeOptions();
        options.merge(cap);
        WebDriver driver=new RemoteWebDriver(new URL("192.168.1.61:4444"),options);
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());

    }
}
