package enums.reports;

/**
 * Created by sgo on 14.01.2015.
 */
public enum OutdoorTemperatureDataSource {
    
    AUTO("Auto"), 
    TEMPERATURE_OUTSIDE("Temperature, Outside"),
    TEMPERATURE_OUTSIDE_AVG("Temperature, Outside (AVG)"),
    OUTDOOR_TEMPERATURE_1s_AVG("Outdoor temperature, 1s (Avg)"),
    OUTDOOR_TEMPERATURE_1s("Outdoor temperature, 1s");

    private final String value;
    
    private OutdoorTemperatureDataSource(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
