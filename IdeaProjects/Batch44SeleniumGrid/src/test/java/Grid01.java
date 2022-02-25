import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid01 {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver= new RemoteWebDriver(new URL("https://www.google.com/webhp?hl=de&sa=X&ved=0ahUKEwiYhKjZjpT2AhXggP0HHeKhCjYQPAgI"),new ChromeOptions());

        driver.get("https://www.google.com/");

        System.out.println();
    }
}
