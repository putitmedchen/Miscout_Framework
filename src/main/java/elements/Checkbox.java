package elements;

import elements.helpers.Element;
import org.openqa.selenium.WebElement;

/**
 * Created by sgo on 4/17/2015.
 */
public class Checkbox extends Element {
    public Checkbox(WebElement webElement) {
        super(webElement);
    }
    
    public boolean isChecked(){
        return webElement.isSelected();
    }
    
    public void setChecked(){
        if(webElement.isSelected()){
            return;
        } else {
            webElement.click();
        }
    }
}
