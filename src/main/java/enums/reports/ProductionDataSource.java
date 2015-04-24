package enums.reports;

/**
 * Created by sgo on 15.01.2015.
 */
public enum ProductionDataSource {

    AUTO("Auto"),
    GRID_POWER_30_SEC("Grid Power (30 sec)"),
    GRID_ACTIVE_POWER("Grid Active Power"),
    GRID_POWER_1_SEC("Grid Power (1 sec)");

    private final String value;

    private ProductionDataSource(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;

    }
}


