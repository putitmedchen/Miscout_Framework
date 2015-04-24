package enums.reports;

/**
 * Created by sgo on 14.01.2015.
 */
public enum WindSpeedDataSource {
    
    AUTO("Auto"),
    WIND_SPEED_30_SEC("Wind Speed (30 sec)"),
    WIND_SPEED_1_30_SEC("Wind Speed 1 (30 sec)"),
    WIND_SPEED_2_30_SEC("Wind Speed 2 (30 sec)"),
    WIND_SPEED_3_30_SEC("Wind Speed 3 (30 sec)"),
    WIND_SPEED_4_30_SEC("Wind Speed 4 (30 sec)"),
    WIND_SPEED("Wind Speed"),
    WIND_SPEED_1("Wind Speed 1"),
    WIND_SPEED_2("Wind Speed 2"),
    AVERAGE_WIND_SPEED("Average Wind Speed"),
    WIND_SPEED_100_MS("Wind Speed (100 ms)"),
    ANALOG_DATALOG_WIND_SPEED_ACTIVE("ANALOG_DATALOG_WIND_SPEED_ACTIVE");

    private final String value;

    private WindSpeedDataSource(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;

    }
}
