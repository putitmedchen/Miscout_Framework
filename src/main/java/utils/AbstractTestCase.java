package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import utils.drivers.DriverFactory;
import utils.drivers.PropertyManager;

import java.util.ResourceBundle;

/**
 * Created by sgo on 02.01.2015.
 */
public class AbstractTestCase {

    public WebDriver driver = DriverFactory.getDriver();
    public ResourceBundle bundle;

    @BeforeTest
    public void openBaseUrl() {
        driver.get(PropertyManager.baseUrl());
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeBrowser() {
        DriverFactory.closeQuietly();
    }
}
