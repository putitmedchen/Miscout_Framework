package features;

import utils.User;

/**
 * Created by sgo on 02.01.2015.
 */
public interface LoginFeature  {

    public void loginToMiscout(User user);

    void loginAndSignOut(User user);
}
