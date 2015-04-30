package utils.drivers;

import org.apache.log4j.Logger;
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
import java.util.concurrent.TimeUnit;

import static utils.drivers.PropertyManager.*;

/**
 * Created by sgo on 02.01.2015.
 */
public class DriverFactory {

    private static Logger log = Logger.getLogger(DriverFactory.class);
    
    public static volatile WebDriver driver;
    static URL hostURL = null;
    static DesiredCapabilities capability;
    

    private DriverFactory() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (setBrowser()) {
                case FIREFOX:

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
                    FirefoxProfile profile = allProfiles.getProfile(firefoxProfile());
                    //  profile.setPreference("foo.bar", 23);
                    driver = new FirefoxDriver(profile);
                    break;

                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                    capability = DesiredCapabilities.chrome();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("test-type");
                    capability.setCapability("nativeEvents", true);
                    capability.setCapability(ChromeOptions.CAPABILITY, options);
                    driver = new ChromeDriver(capability);

                    break;
                case IE:
                    driver = new InternetExplorerDriver();
                    break;

                case REMOTE:
                    capability = DesiredCapabilities.firefox();
                    capability.setBrowserName("firefox");
                    try {
                        hostURL = new URL("http://172.21.4.149:4444/wd/hub");
                    } catch (MalformedURLException e) {
                        log.error("problem with instantiating remote web browser" + e);
                    }
                    driver = new RemoteWebDriver(hostURL, capability);
            }
            setTimeOuts();
        }
        return driver;
    }

    public static WebDriver setTimeOuts() {
        driver.manage().timeouts().implicitlyWait(implicitWait(), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(pageLoad(), TimeUnit.SECONDS);
        return driver;
    }

    public static void closeQuietly() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
