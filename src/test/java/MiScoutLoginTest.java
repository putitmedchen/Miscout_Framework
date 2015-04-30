import features.LoginFeature;
import features.LoginFeatureImpl;
import features.MenuFeature;
import features.MenuFeatureImpl;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.AbstractTestCase;

/**
 * Created by sgo on 12.12.2014.
 */
public class MiScoutLoginTest extends AbstractTestCase {

    private LoginFeature loginFeature = new LoginFeatureImpl();
    private MenuFeature menuFeature = new MenuFeatureImpl();
    private UserAndPassword user;

    @Test(dataProvider = "usersList", invocationCount = 4)
    @Parameters({"login", "password"})
    public void loginToMiScout(@Optional("login") String userName, @Optional("login") String password) {
        user = new UserAndPassword(userName, password);

        loginFeature.loginAndSignOut(user);
       // menuFeature.checkMenuItems();
        
        
    }

    @DataProvider(name = "usersList", parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                {"sgo", "sgo"},
                {"aaa", "aaa"},
                {"sgo1","sgo1"}
        };
    }
}
