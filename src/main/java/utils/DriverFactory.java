package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

/**
 * Created by sgo on 02.01.2015.
 */
public class DriverFactory {

    public static WebDriver driver;
    private static String browserName;
    private static long implicitWait;
    private static long pageloadTimeout;
    private static ResourceBundle bundle;
    private static String firefoxProfile;

    static URL hostURL = null;
    static DesiredCapabilities capability;

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        bundle = ResourceBundle.getBundle("miscout");
        implicitWait = Long.parseLong(bundle.getString("implicit.wait"));
        browserName = bundle.getString("browser.name");
        pageloadTimeout = Long.parseLong(bundle.getString("pageload.timeout"));
        firefoxProfile = bundle.getString("firefox.profile");
        
        if (driver == null) {
            
            switch(browserName) {
                case "firefox":
                    
                    //якщо профіль ще не зареєстрований - 
//                    File profileDir = new File("path/to/top/level/of/profile");
//                    final String firebugPath = "path/to/firebuf.xpi";
//                    FirefoxProfile profile = new FirefoxProfile(profileDir);
//                    try {
//                        profile.addExtension(new File(firebugPath));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }

//                  витягає існуючий профіль з папки
                    ProfilesIni allProfiles = new ProfilesIni();
                    FirefoxProfile profile = allProfiles.getProfile(firefoxProfile);
                  //  profile.setPreference("foo.bar", 23);
                    driver = new FirefoxDriver(profile);
                    break;

                case "chrome": 
                    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                    capability = DesiredCapabilities.chrome();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("test-type");
                    capability.setCapability("nativeEvents", true);
                    capability.setCapability(ChromeOptions.CAPABILITY, options);
                    driver = new ChromeDriver(capability);

                    break;
                case "ie": driver = new InternetExplorerDriver();
                    break;

                case "remote":
                    capability = DesiredCapabilities.firefox();
                    capability.setBrowserName("firefox" );
                    try {
                        hostURL = new URL("http://172.21.4.149:4444/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    
                    driver = new RemoteWebDriver(hostURL, capability);
            }  
            driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(pageloadTimeout, TimeUnit.SECONDS);
            System.out.println("----------------------------------------" + implicitWait);
        }
        return driver;
    }

}
