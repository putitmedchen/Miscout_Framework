package enums.reports;

/**
 * Created by sgo on 14.01.2015.
 */
public enum DataSet {

    AUTO("Auto"),
    MIN_LOG_5("5 min log"),
    SCADA_AVG_LOG("SCADA avg log");

    private final String value;

    private DataSet(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;

    }
}
