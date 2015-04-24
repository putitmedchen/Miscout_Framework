package features;

import pages.AlarmPage;
import pages.MenuFragment;
import utils.DriverFactory;

/**
 * Created by sgo on 4/7/2015.
 */
public class AlarmFeatureImpl implements AlarmFeature {
    
    private AlarmPage alarmPage = new AlarmPage(DriverFactory.getDriver());
    private MenuFragment menuFragment = new MenuFragment(DriverFactory.getDriver());
    
    @Override
    public void checkAlarmColumns() {
        menuFragment.openAlarms();
        alarmPage.checkAlarmColums();
    }

    @Override
    public void acknowledgeAllAlarms() {
        alarmPage.acknowledgeAllAlarms();

    }
}
