package enums.reports;

/**
 * Created by sgo on 14.01.2015.
 */
public enum PowerDataSource {

    AUTO("Auto"),
    GRID_POWER_30_SEC("Grid Power (30 sec)"),
    GRID_ACTIVE_POWER("Grid Active Power"),
    GRID_POWER_1_SEC("Grid Power (1 sec)"),
    ACTIVE_POWER("Active Power"),
    GRID_ACTIVE_POWER_2("Grid Active Power 2"),
    GRID_ACTIVE_POWER_3("Grid Active Power 3");

    private final String value;

    private PowerDataSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
