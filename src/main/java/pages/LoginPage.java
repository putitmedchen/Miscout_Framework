package pages;

import elements.Button;
import elements.TextFiled;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;
import utils.DriverFactory;

/**
 * Created by sgo on 02.01.2015.
 */
public class LoginPage extends AbstractPageObject {

    private WebDriver driver = DriverFactory.getDriver();
    @FindBy(xpath = "//input[@id='UserName']")
    private TextFiled loginPlaceHolder;
    @FindBy(xpath = "//input[@id='Password']")
    private TextFiled passwordPlaceHolder;
    @FindBy(xpath = "//input[@id='login-button']")
    private Button loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeCredentials(String login, String password) {
        loginPlaceHolder.typeText(login);
        loginPlaceHolder.sendKeys(Keys.TAB);
        passwordPlaceHolder.typeText(password);
        loginButton.click();
        takeScreenshot();

    }
}
