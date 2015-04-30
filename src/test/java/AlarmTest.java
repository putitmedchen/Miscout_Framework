import features.*;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.Test;
import utils.AbstractTestCase;

/**
 * Created by sgo on 4/7/2015.
 */

public class AlarmTest extends AbstractTestCase {
    
    private LoginFeature loginFeature = new LoginFeatureImpl();
    private TargetsFeature targetsFeature = new TargetsFeatureImpl();
    private AlarmFeature alarmFeature = new AlarmFeatureImpl();
    UserAndPassword userAndPassword = new UserAndPassword("sgo", "sgo");

    @Test()
    public void login(){
        loginFeature.loginToMiscout(userAndPassword);
    }
    
    @Test(dependsOnMethods = "login")
    public void openAlarms(){
       // targetsFeature.selectMainTarget();
        alarmFeature.checkAlarmColumns();
        alarmFeature.acknowledgeAllAlarms();
    }
}
