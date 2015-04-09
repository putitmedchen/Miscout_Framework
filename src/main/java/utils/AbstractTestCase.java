package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

/**
 * Created by sgo on 02.01.2015.
 */
public class AbstractTestCase {

    public WebDriver driver = DriverFactory.getDriver();
    public ResourceBundle bundle;
    private String baseUrl;

    private long implicitWait;

    @BeforeTest
    public void openBaseUrl() {
        getMiScoutProperties();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public void getMiScoutProperties() {
        bundle = ResourceBundle.getBundle("miscout");
        baseUrl = bundle.getString("base.url");
        implicitWait = Long.parseLong(bundle.getString("implicit.wait"));

    }
}
