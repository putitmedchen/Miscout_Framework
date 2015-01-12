package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;
import utils.DriverFactory;

/**
 * Created by sgo on 02.01.2015.
 */
public class LoginPage extends AbstractPageObject{

    private WebDriver driver = DriverFactory.getDriver();

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='UserName']")
    private WebElement loginPlaceHolder;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordPlaceHolder;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public void typeCredentials(String login, String password){
        loginPlaceHolder.sendKeys(login);
        passwordPlaceHolder.sendKeys(password);
        loginButton.click();
    }

}
