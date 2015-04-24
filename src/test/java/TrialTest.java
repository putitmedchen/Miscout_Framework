import features.ReportFeature;
import features.ReportFeatureImpl;
import models.PowerCurveParameters;
import org.testng.annotations.Test;
import utils.AbstractTestCase;

/**
 * Created by sgo on 4/24/2015.
 */
public class TrialTest extends AbstractTestCase {

    private ReportFeature reportFeature = new ReportFeatureImpl();

    @Test
    public void checkBuilders() {
        reportFeature.generatePowerCurveReport(new PowerCurveParameters.PowerCurveBuilder("5", "6", "7").build());
    }
}
