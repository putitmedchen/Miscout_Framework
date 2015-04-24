package utils.ajax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

/**
 * Created by sgo on 4/18/2015.
 */
public class CustomElementLocatorFactory implements ElementLocatorFactory {
    private final WebDriver driver;
    private final int timeOutInSeconds;

    public CustomElementLocatorFactory(WebDriver driver,
                                       int timeOutInSeconds) {
        this.driver = driver;
        this.timeOutInSeconds = timeOutInSeconds;
    }

    public ElementLocator createLocator(Field field) {
        return new CustomElementLocator(driver, field,
                timeOutInSeconds);
    }
    
}
