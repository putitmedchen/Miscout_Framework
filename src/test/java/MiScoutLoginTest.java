import features.LoginFeature;
import features.LoginFeatureImpl;
import features.MenuFeature;
import features.MenuFeatureImpl;
import org.testng.annotations.Test;
import utils.AbstractTestCase;
import utils.User;

/**
 * Created by sgo on 12.12.2014.
 */
public class MiScoutLoginTest extends AbstractTestCase {

    private LoginFeature loginFeature = new LoginFeatureImpl();
    private MenuFeature menuFeature = new MenuFeatureImpl();

    @Test
    public void loginToMiScout() {
        loginFeature.loginToMiscout(User.generateUser());
        menuFeature.checkMenuItems();
    }

}
