package features;

import pages.MenuFragment;
import utils.DriverFactory;

/**
 * Created by sgo on 02.01.2015.
 */
public class MenuFeatureImpl implements MenuFeature {

    private MenuFragment menuFragment = new MenuFragment(DriverFactory.getDriver());

    @Override
    public void checkMenuItems() {
        menuFragment.checkMenuItems();
    }

    @Override
    public void getScatterPlot() {
        menuFragment.openScatterPlot();
    }
}
