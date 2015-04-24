package utils.ajax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;

import java.lang.reflect.Field;

/**
 * Created by sgo on 4/18/2015.
 */
public class CustomElementLocator extends AjaxElementLocator {

    public CustomElementLocator(WebDriver driver, Field field,
                                int timeOutInSeconds) {
        super(driver, field, timeOutInSeconds);
    }

    protected boolean isElementUsable(WebElement element) {
        return (element.isDisplayed()&&element.isEnabled());
    }
}
