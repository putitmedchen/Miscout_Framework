package elements.helpers;

import org.openqa.selenium.WebElement;

/**
 * Created by sgo on 4/17/2015.
 */
public class Element {
    protected WebElement webElement;
    
    public Element(WebElement webElement){
        this.webElement = webElement;
    }
}
