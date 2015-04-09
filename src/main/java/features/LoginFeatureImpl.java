package features;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utils.DriverFactory;
import utils.User;

/**
 * Created by sgo on 02.01.2015.
 */
public class LoginFeatureImpl implements LoginFeature {

    WebDriver driver = DriverFactory.getDriver();
    private LandingPage landingPage = new LandingPage(driver);
    private LoginPage loginPage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);
    private Boolean bool = true;

    @Override
    public void loginToMiscout(User user) {
        landingPage.loginToMiscout();
        loginPage.typeCredentials(user.getLogin(), user.getPassword());
        homePage.checkLoggedUser(user);
    }

    @Override
    public void loginAndSignOut(User user) {
        if(bool == true){
            landingPage.loginToMiscout();
            bool = false;
        }
        loginPage.typeCredentials(user.getLogin(), user.getPassword());
        homePage.checkLoggedUser(user);
        homePage.logout();
    }
    
//    @Override
//    public void open
}
