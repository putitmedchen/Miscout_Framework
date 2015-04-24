package enums;

/**
 * Created by sgo on 14.01.2015.
 */
public enum ReportTypes {

    POWER_CURVE_REPORT("Power Curve Report"),
    PRODUCTION_EFFICIENCY_REPORT("Production Efficiency Report"),
    PRODUCTION_OVERVIEW_REPORT("Production Overview Report"),
    STATUS_CODE_STATISTIC_REPORT("Status Code Statistic Report"),
    STATUS_CODE_TREND_REPORT("Status Code Trend Report"),
    WIND_ROSE_REPORT("Wind Rose Report");

    private final String value;

    private ReportTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    

}
