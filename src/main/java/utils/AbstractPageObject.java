package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by sgo on 17.12.2014.
 */
public abstract class AbstractPageObject {

    public AbstractPageObject(WebDriver driver) {

        PageFactory.initElements(driver, this);
        driver = DriverFactory.getDriver();

    }

    public void getUniqueElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.isEnabled());
    }
    
    public void pause(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
