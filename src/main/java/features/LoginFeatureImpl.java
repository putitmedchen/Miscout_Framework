package features;

import com.sun.jna.platform.win32.Netapi32Util;
import org.openqa.selenium.WebDriver;
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
    private User user;



    @Override
    public void loginToMiscout(User User) {
        user = User.generateUser();
        landingPage.loginToMiscout();
        loginPage.typeCredentials(user.getLogin(), user.getPassword());
    }
}
