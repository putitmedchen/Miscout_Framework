package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

/**
 * Created by sgo on 02.01.2015.
 */
public class DriverFactory {

    public static WebDriver driver;
    private static String browserName;
    private static long implicitWait;
    private static ResourceBundle bundle;

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        bundle = ResourceBundle.getBundle("miscout");
        implicitWait = Long.parseLong(bundle.getString("implicit.wait"));
        browserName = bundle.getString("browser.name");
        
       
        if (driver == null) {
            
            switch(browserName) {
                case "firefox": driver = new FirefoxDriver();
                    break;
                case "chrome": driver = new ChromeDriver();
                    break;
                case "ie": driver = new InternetExplorerDriver();
                    break;
            }  
            driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        }
        
        return driver;
    }

}
