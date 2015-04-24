import features.*;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.Test;
import utils.AbstractTestCase;

/**
 * Created by sgo on 4/7/2015.
 */
public class CheckTargetsTest extends AbstractTestCase {
    
    private LoginFeature loginFeature = new LoginFeatureImpl();
    private TargetsFeature targetsFeature = new TargetsFeatureImpl();
    private MenuFeature menuFeature = new MenuFeatureImpl();
    UserAndPassword user = new UserAndPassword("sgo", "sgo");

    @Test
    public void login(){
        loginFeature.loginToMiscout(user);
    }
    
    @Test(dependsOnMethods = "login")
    public void checkTargets(){
        targetsFeature.selectMainTarget();
    }
    
    @Test(dependsOnMethods = "checkTargets")
    public void getScatterPlot(){
        menuFeature.getScatterPlot();
    }
    
    @Test(dependsOnMethods = "getScatterPlot")
    public void checkTargetByName(){
        targetsFeature.checkTargetByName("SGO 199");
    }
}
