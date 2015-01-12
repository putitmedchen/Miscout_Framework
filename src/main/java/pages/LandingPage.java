package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;
import utils.DriverFactory;

/**
 * Created by sgo on 02.01.2015.
 */
public class LandingPage extends AbstractPageObject {

    private WebDriver driver = DriverFactory.getDriver();

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='header1']")
    private WebElement welcomeButton;

    @FindBy(xpath = "//label[@for='header3']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='webservice']")
    public WebElement runMiscoutWeb;




    public void loginToMiscout() {

        loginButton.click();
        runMiscoutWeb.click();
    }
}
