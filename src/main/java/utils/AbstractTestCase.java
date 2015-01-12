package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.ResourceBundle;

/**
 * Created by sgo on 02.01.2015.
 */
public class AbstractTestCase {

    public WebDriver driver = DriverFactory.getDriver();

    public String baseUrl;
    private ResourceBundle bundle;

    @BeforeTest
    public void openBaseUrl(){
        setBaseUrl();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

       public void setBaseUrl() {
        bundle = ResourceBundle.getBundle("miscout");
        baseUrl = bundle.getString("base.url");
    }

}
