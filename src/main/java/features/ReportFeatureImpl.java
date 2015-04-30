package features;

import enums.reports.AggregationType;
import models.PowerCurveParameters;
import models.StatusCodeTrendParameters;
import pages.ReportParametersFragment;
import utils.drivers.DriverFactory;

/**
 * Created by sgo on 4/24/2015.
 */
public class ReportFeatureImpl implements ReportFeature {

    private ReportParametersFragment reportParametersFragment = new ReportParametersFragment(DriverFactory.getDriver());

    @Override
    public void generatePowerCurveReport(PowerCurveParameters powerCurveParameters) {
        reportParametersFragment.generatePowerCurve();

        new PowerCurveParameters.PowerCurveBuilder("", "", "").build();
        StatusCodeTrendParameters statusCodeTrendParameters = new StatusCodeTrendParameters.StatusCodeBuilder(AggregationType.DAYS, true, 3).build();
    }
}
