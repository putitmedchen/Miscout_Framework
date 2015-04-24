package utils;


import elements.helpers.CustomFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ajax.CustomElementLocatorFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by sgo on 17.12.2014.
 */
public abstract class AbstractPageObject {

    public AbstractPageObject(WebDriver driver) {

        PageFactory.initElements(new CustomElementLocatorFactory(driver, 60), this);
        //driver = DriverFactory.getDriver();
        PageFactory.initElements(new CustomFieldDecorator(driver), this);
        driver = DriverFactory.getDriver();

    }

    protected void getUniqueElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.isEnabled());
    }
    
    protected void pause(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    
    protected void refreshPage(){
        DriverFactory.getDriver().navigate().refresh();
    }
    
    protected void forward(){
        DriverFactory.getDriver().navigate().forward();
    }

    protected void backward(){
        DriverFactory.getDriver().navigate().back();
    }
    
    protected void takeScreenshot(){
        File file = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("c:\\temp\\screenshot.png"));
        } catch (IOException e) {
            System.out.println("Exception during taking screenshots " + e.toString());
            e.printStackTrace();
        }
    }

    protected void openInNewWindow(String url) {
        ((JavascriptExecutor) DriverFactory.getDriver())
                .executeScript("window.open(arguments[0])", url);
    }
    
}
