package enums.reports;

/**
 * Created by sgo on 15.01.2015.
 */
public enum ReactiveProductionDataSource {
    
    DO_NOT_SHOW("Do not show"),
    AUTO("Auto"),
    GRID_REACTIVE_POWER_30_SEC("Grid Reactive Power (30 sec)"),
    GRID_REACTIVE_POWER_1_SEC("Grid Reactive Power (1 sec)"),
    INVERTER_REACTIVE_POWER("Inverter Reactive Power"),
    GRID_REACTIVE_POWER("Grid Reactive Power"),
    GRID_REACTIVE_POWER_2("Grid Reactive Power 2");

    private final String value;

    private ReactiveProductionDataSource(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;

    }
}

