package models;


import enums.reports.AggregationType;

/**
 * Created by sgo on 15.01.2015.
 */
public class StatusCodeTrendParameters implements Report {

    private final AggregationType aggregationType;
    private final Boolean showDetailsForTurbines;
    private final int skipCodesWhichWereActiveLess;
    
    private StatusCodeTrendParameters(StatusCodeBuilder builder){
        
        this.aggregationType = builder.aggregationType;
        this.showDetailsForTurbines = builder.showDetailsForTurbines;
        this.skipCodesWhichWereActiveLess = builder.skipCodesWhichWereActiveLess;
        
    }


    public AggregationType getAggregationType() {
        return aggregationType;
    }

    public Boolean getShowDetailsForTurbines() {
        return showDetailsForTurbines;
    }

    public int getSkipCodesWhichWereActiveLess() {
        return skipCodesWhichWereActiveLess;
    }

    public static class StatusCodeBuilder{
        private final AggregationType aggregationType;
        private final Boolean showDetailsForTurbines;
        private final int skipCodesWhichWereActiveLess;
     
        public StatusCodeBuilder(AggregationType aggregationType, Boolean showDetailsForTurbines, int skipCodesWhichWereActiveLess){
            this.aggregationType = aggregationType;
            this.showDetailsForTurbines = showDetailsForTurbines;
            this.skipCodesWhichWereActiveLess = skipCodesWhichWereActiveLess;
        }
        
        public StatusCodeTrendParameters build(){
            return new StatusCodeTrendParameters(this);
        }
    }

//    public static StatusCodeTrendParameters generateParameters() {
//        statusCodeTrendParameters = new StatusCodeTrendParameters();
//
//        statusCodeTrendParameters.setAggregationType(AggregationType.DAYS);
//        statusCodeTrendParameters.setShowDetailsForTurbines(true);
//        statusCodeTrendParameters.setSkipCodesWhichWereActiveLess(3);
//
//        return statusCodeTrendParameters;
//    }
}
