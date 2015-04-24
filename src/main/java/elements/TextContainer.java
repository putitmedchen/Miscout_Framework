package elements;

import com.google.common.base.Function;
import elements.helpers.Element;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by sgo on 4/17/2015.
 */
public class TextContainer extends Element {
    public TextContainer(WebElement webElement) {
        super(webElement);
    }

    public static String dependableClick(WebDriver d, WebElement element) {
        final int MAXIMUM_WAIT_TIME = 10;
        final int MAX_STALE_ELEMENT_RETRIES = 5;
        String text;

        WebDriverWait wait = new WebDriverWait(d, MAXIMUM_WAIT_TIME);
        int retries = 0;
        while (true) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                text = element.getText();
                return text;
            } catch (StaleElementReferenceException e) {
                if (retries < MAX_STALE_ELEMENT_RETRIES) {
                    retries++;
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    public void click() {
        webElement.click();
    }

    public String getText() {
        // return webElement.getText();

        // return fluentWait();

        new WebDriverWait(DriverFactory.getDriver(), 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(webElement));

        return webElement.getText();
        // return dependableClick(DriverFactory.driver, webElement);
    }

    public boolean isClickable() {
        return (webElement != null && webElement.isDisplayed() && webElement.isEnabled());
    }

    public void mouseOver() {
        Actions actions = new Actions(DriverFactory.getDriver());
        actions.moveToElement(webElement).build().perform();
        // actions.clickAndHold(webElement).build().perform();
    }

    public String fluentWait() {

        FluentWait<WebElement> wait = new FluentWait<WebElement>(webElement).
                withTimeout(10, TimeUnit.SECONDS).
                pollingEvery(1, TimeUnit.SECONDS).
                ignoring(StaleElementReferenceException.class);

        String text = wait.until(new Function<WebElement, String>() {
            @Override
            public String apply(WebElement element) {
                return element.getText();
            }
        });
        return text;
    }
}
