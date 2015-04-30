package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.UserAndPassword;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utils.drivers.DriverFactory;

import java.util.Set;

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
    public void loginToMiscout(UserAndPassword user) {
        landingPage.loginToMiscout();
        loginPage.typeCredentials(user.getUsername(), user.getPassword());
        homePage.checkLoggedUser(user);
    }

    @Override
    public void loginAndSignOut(UserAndPassword user) {
        if(bool == true){
            landingPage.loginToMiscout();
            bool = false;
        }
        loginPage.typeCredentials(user.getUsername(), user.getPassword());
        homePage.checkLoggedUser(user);
        homePage.logout();

        Set<String> oldWindowsSet = driver.getWindowHandles();

      //  for (int i = 0; i < oldWindowsSet.size(); i++) {
       //     driver.switchTo().window(oldWindowsSet.iterator().next().toString());
      //  }
        

    }
    
//    @Override
//    public void open
}
