package enums.reports;

/**
 * Created by sgo on 14.01.2015.
 */
public enum PowerMeasurementUnits {
    
    AUTO("Auto"),
    W("W"),
    KW("kW"),
    MW("MW");
    
    private final String value;
    
    private PowerMeasurementUnits(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
        
    }
}
