package features;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MenuFragment;
import utils.DriverFactory;

/**
 * Created by sgo on 02.01.2015.
 */
public class MenuFeatureImpl implements MenuFeature {


    private WebDriver driver = DriverFactory.getDriver();
    private MenuFragment menuFragment = new MenuFragment(driver);


    @Override
    public void checkMenuItems() {
        menuFragment.checkMenuItems();
    }
}
