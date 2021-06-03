package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {
    public static WebDriver driver;

    public static void firefoxDriver (String url){
        driver = new FirefoxDriver();
        driver.get(url);
    }
}
