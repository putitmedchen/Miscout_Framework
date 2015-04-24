package enums.reports;

/**
 * Created by sgo on 15.01.2015.
 */
public enum AggregationType { 
    
    MONTHS("Auto"),
    DAYS("Days"),
    YEARS("Years");

    private final String value;

    private AggregationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;

    }
}
