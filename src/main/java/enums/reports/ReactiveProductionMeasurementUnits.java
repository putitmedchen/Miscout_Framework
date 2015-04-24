package enums.reports;

/**
 * Created by sgo on 15.01.2015.
 */
public enum ReactiveProductionMeasurementUnits {

    AUTO("Auto"),
    VArh("VArh"),
    kVArh("kVArh"),
    MVArh("MVArh");

    private final String value;

    private ReactiveProductionMeasurementUnits(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;

    }
}
