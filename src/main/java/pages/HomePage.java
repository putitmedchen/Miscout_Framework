package pages;

import elements.Button;
import elements.TextContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.AbstractPageObject;

/**
 * Created by sgo on 02.01.2015.
 */
public class HomePage extends AbstractPageObject {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(css= "#userNameText")
    private TextContainer currentUserName;
    
    @FindBy(css="#logout-button")
    private Button logOut;

    public void checkLoggedUser(UserAndPassword user){
       // pause(3000);
        Assert.assertTrue(user.getUsername().contains(currentUserName.getText()));
    }
    
    public void logout(){

        Assert.assertTrue(currentUserName.isClickable(), currentUserName + "is not available on dom");
        currentUserName.click();
        logOut.click();
        Assert.assertFalse(currentUserName.isClickable(), currentUserName + "is visible, logout button wasn't pressed");
  
        this.refreshPage();
        
        this.openInNewWindow("http://uapc1212/");
    }

}
