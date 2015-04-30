package elements;

import elements.helpers.Element;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.drivers.DriverFactory;

/**
 * Created by sgo on 4/17/2015.
 */
public class TextFiled extends Element {
    public TextFiled(WebElement webElement) {
        super(webElement);
    }
    
    public void typeText(String str){
         new WebDriverWait(DriverFactory.getDriver(), 10).ignoring(InvalidElementStateException.class).until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.clear();
        webElement.sendKeys(str);
    }
    
    public void clearText(){
        webElement.clear();
    }
    
    public void sendKeys(Keys key){
        webElement.sendKeys(key);
        
    }
}
