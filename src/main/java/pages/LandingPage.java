package pages;

import elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

/**
 * Created by sgo on 02.01.2015.
 */
public class LandingPage extends AbstractPageObject {

    @FindBy(xpath = "//label[@for='header3']")
    public Button loginButton;
    @FindBy(xpath = "//a[@href='webservice']")
    public Button runMiscoutWeb;
    @FindBy(xpath = "//label[@for='header1']")
    private Button welcomeButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void loginToMiscout() {
        loginButton.click();
        runMiscoutWeb.click();
    }
}
