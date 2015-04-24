package features;

import pages.TargetsFragment;
import utils.DriverFactory;


/**
 * Created by sgo on 4/7/2015.
 */
public class TargetsFeatureImpl implements TargetsFeature {
    
    private TargetsFragment targetsFragment = new TargetsFragment(DriverFactory.getDriver());
    
    @Override
    public void selectMainTarget() {
        targetsFragment.selectMainTarget();
    }

    @Override
    public void checkTargetByName(String targetName) {
        targetsFragment.checkTargetByName(targetName);
    }
}
