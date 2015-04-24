package elements;

import elements.helpers.Element;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by sgo on 4/17/2015.
 */
public class TextFiled extends Element {
    public TextFiled(WebElement webElement) {
        super(webElement);
    }
    
    public void typeText(String str){
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
