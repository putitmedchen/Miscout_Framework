package models;


import enums.reports.AggregationType;

/**
 * Created by sgo on 15.01.2015.
 */
public class StatusCodeStatisticParameters implements Report{
    
    private AggregationType aggregationType;
    private Boolean showDetailsForTurbines;
    private int skipCodesWhichWereActiveLess;
    
    private static StatusCodeStatisticParameters statusCodeStatisticParameters;

    public AggregationType getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public Boolean getShowDetailsForTurbines() {
        return showDetailsForTurbines;
    }

    public void setShowDetailsForTurbines(Boolean showDetailsForTurbines) {
        this.showDetailsForTurbines = showDetailsForTurbines;
    }

    public int getSkipCodesWhichWereActiveLess() {
        return skipCodesWhichWereActiveLess;
    }

    public void setSkipCodesWhichWereActiveLess(int skipCodesWhichWereActiveLess) {
        this.skipCodesWhichWereActiveLess = skipCodesWhichWereActiveLess;
    }
    
    public static StatusCodeStatisticParameters generateParameters(){
        statusCodeStatisticParameters = new StatusCodeStatisticParameters();
        
        statusCodeStatisticParameters.setAggregationType(AggregationType.DAYS);
        statusCodeStatisticParameters.setShowDetailsForTurbines(true);
        statusCodeStatisticParameters.setSkipCodesWhichWereActiveLess(3);
        
        return statusCodeStatisticParameters;
    }
}
