package elements;

import elements.helpers.Element;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.drivers.DriverFactory;

import java.util.NoSuchElementException;

/**
 * Created by sgo on 4/17/2015.
 */
public class Button extends Element {
    public Button(WebElement webElement) {
        super(webElement);
    }
    
    public void click(){
        new WebDriverWait(DriverFactory.getDriver(), 10).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    
    //Элемент может быть скрытым посредством установки CSS «visibility» свойства в «hidden»,
    // или «display» свойства в «none» для самого элемента либо его родителей. 
    public String getTextByJavascript(final WebElement element) {
        String script = "var element = arguments[0];"
                + "return element.textContent;"
                ;
        return (String) ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(script, element);
    }

    //Если содержимое элемента нужно получать постоянно, то можно сделать его видимым с помощью javascript,
    // а затем получить доступ к тексту через Selenium getText().
    public void makeElementVisibleByJavascript(final WebElement element) {
        String script = "var element = arguments[0];"
                + "element.style.display='block';"
                ;
        ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(script, element);
    }
    
    //Что касается полей ввода, текст которых возвращается методом element.getAttribute("value"), 
    // то метод успешно возвращает текст как для видимых, так и для скрытых элементов.
}
