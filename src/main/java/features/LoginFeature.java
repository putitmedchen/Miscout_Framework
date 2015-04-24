package features;

import org.openqa.selenium.security.UserAndPassword;

/**
 * Created by sgo on 02.01.2015.
 */
public interface LoginFeature {

    void loginToMiscout(UserAndPassword user);

    void loginAndSignOut(UserAndPassword user);
}
