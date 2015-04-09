package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.AbstractPageObject;
import utils.User;

/**
 * Created by sgo on 02.01.2015.
 */
public class HomePage extends AbstractPageObject {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(css= "#userNameText")
    private WebElement currentUserName;
    
    @FindBy(css="#logout-button")
    private WebElement logOut;
    
    public void logout(){
        currentUserName.click();
        logOut.click();
    }
    
    public void checkLoggedUser(User user){
        Assert.assertTrue(user.getLogin().contains(currentUserName.getText()));
    }
}
