package models;


import enums.reports.*;

/**
 * Created by sgo on 14.01.2015.
 */
public class PowerCurveParameters implements Report{

    private final Boolean comparePowerCurve;
    private final Boolean showDetailsForTurbines;
    private final Boolean normalizePowerCurve;

    private final OutdoorTemperatureDataSource outdoorTemperatureDataSource;
    private final PowerMeasurementUnits powerMeasurementUnits;
    private final PowerDataSource powerDataSource;
    private WindSpeedDataSource windSpeedDataSource;
    private DataSet dataSet;

    private String binCount;
    private String binSpan;
    private String windSpeedOffset;


    private PowerCurveParameters(PowerCurveBuilder builder) {
        this.comparePowerCurve = builder.comparePowerCurve;
        this.showDetailsForTurbines = builder.showDetailsForTurbines;
        this.normalizePowerCurve = builder.normalizePowerCurve;
        this.outdoorTemperatureDataSource = builder.outdoorTemperatureDataSource;
        this.powerMeasurementUnits = builder.powerMeasurementUnits;
        this.powerDataSource = builder.powerDataSource;
        this.windSpeedDataSource = builder.windSpeedDataSource;
        this.dataSet = builder.dataSet;

        this.binCount = builder.binCount;
        this.binSpan = builder.binSpan;
        this.windSpeedOffset = builder.windSpeedOffset;

    }

    public static class PowerCurveBuilder {
        private final String binCount;
        private final String binSpan;
        private final String windSpeedOffset;
        private Boolean comparePowerCurve;
        private Boolean showDetailsForTurbines;
        private Boolean normalizePowerCurve;
        private OutdoorTemperatureDataSource outdoorTemperatureDataSource;
        private PowerMeasurementUnits powerMeasurementUnits;
        private PowerDataSource powerDataSource;
        private WindSpeedDataSource windSpeedDataSource;
        private DataSet dataSet;

        public PowerCurveBuilder(String binCount, String binSpan, String windSpeedOffset) {
            this.binCount = binCount;
            this.binSpan = binSpan;
            this.windSpeedOffset = windSpeedOffset;
        }

        public PowerCurveBuilder comparePowerCurve(Boolean comparePowerCurve) {
            this.comparePowerCurve = comparePowerCurve;
            return this;
        }

        public PowerCurveBuilder showDetailsForTurbines(Boolean showDetailsForTurbines) {
            this.showDetailsForTurbines = showDetailsForTurbines;
            return this;
        }

        public PowerCurveBuilder normalizePowerCurve(Boolean normalizePowerCurve) {
            this.normalizePowerCurve = normalizePowerCurve;
            return this;
        }

        public PowerCurveBuilder outdoorTemperatureDataSource(OutdoorTemperatureDataSource outdoorTemperatureDataSource) {
            this.outdoorTemperatureDataSource = outdoorTemperatureDataSource;
            return this;
        }

        public PowerCurveBuilder powerMeasurementUnits(PowerMeasurementUnits powerMeasurementUnits) {
            this.powerMeasurementUnits = powerMeasurementUnits;
            return this;
        }

        public PowerCurveBuilder powerDataSource(PowerDataSource powerDataSource) {
            this.powerDataSource = powerDataSource;
            return this;
        }

        public PowerCurveBuilder windSpeedDataSource(WindSpeedDataSource windSpeedDataSource) {
            this.windSpeedDataSource = windSpeedDataSource;
            return this;
        }

        public PowerCurveBuilder dataSet(DataSet dataSet) {
            this.dataSet = dataSet;
            return this;
        }

        public PowerCurveParameters build() {

            PowerCurveParameters powerCurveParameters = new PowerCurveParameters(this);
            if(powerCurveParameters.binSpan == null){
                throw new IllegalStateException("Bin span is null");
            }
            
            return powerCurveParameters;
        }
    }


//
//    private static PowerCurveParameters powerCurveParameters;
//
//    //Getters and Setters
//    public Boolean getComparePowerCurve() {
//        return comparePowerCurve;
//    }
//
//    public void setComparePowerCurve(Boolean comparePowerCurve) {
//        this.comparePowerCurve = comparePowerCurve;
//    }
//
//    public Boolean getShowDetailsForTurbines() {
//        return showDetailsForTurbines;
//    }
//
//    public void setShowDetailsForTurbines(Boolean showDetailsForTurbines) {
//        this.showDetailsForTurbines = showDetailsForTurbines;
//    }
//
//    public Boolean getNormalizePowerCurve() {
//        return normalizePowerCurve;
//    }
//
//    public void setNormalizePowerCurve(Boolean normalizePowerCurve) {
//        this.normalizePowerCurve = normalizePowerCurve;
//    }
//
//    public OutdoorTemperatureDataSource getOutdoorTemperatureDataSource() {
//        return outdoorTemperatureDataSource;
//    }
//
//    public void setOutdoorTemperatureDataSource(OutdoorTemperatureDataSource outdoorTemperatureDataSource) {
//        this.outdoorTemperatureDataSource = outdoorTemperatureDataSource;
//    }
//
//    public PowerMeasurementUnits getPowerMeasurementUnits() {
//        return powerMeasurementUnits;
//    }
//
//    public void setPowerMeasurementUnits(PowerMeasurementUnits powerMeasurementUnits) {
//        this.powerMeasurementUnits = powerMeasurementUnits;
//    }
//
//    public PowerDataSource getPowerDataSource() {
//        return powerDataSource;
//    }
//
//    public void setPowerDataSource(PowerDataSource powerDataSource) {
//        this.powerDataSource = powerDataSource;
//    }
//
//    public WindSpeedDataSource getWindSpeedDataSource() {
//        return windSpeedDataSource;
//    }
//
//    public void setWindSpeedDataSource(WindSpeedDataSource windSpeedDataSource) {
//        this.windSpeedDataSource = windSpeedDataSource;
//    }
//
//    public DataSet getDataSet() {
//        return dataSet;
//    }
//
//    public void setDataSet(DataSet dataSet) {
//        this.dataSet = dataSet;
//    }
//
//    public String getBinCount() {
//        return binCount;
//    }
//
//    public void setBinCount(String binCount) {
//        this.binCount = binCount;
//    }
//
//    public String getBinSpan() {
//        return binSpan;
//    }
//
//    public void setBinSpan(String binSpan) {
//        this.binSpan = binSpan;
//    }
//
//    public String getWindSpeedOffset() {
//        return windSpeedOffset;
//    }
//
//    public void setWindSpeedOffset(String windSpeedOffset) {
//        this.windSpeedOffset = windSpeedOffset;
//    }
//// Setters and Getters
//
//
//    public static PowerCurveParameters generateParameters() {
//        powerCurveParameters = new PowerCurveParameters();
//
//        powerCurveParameters.setComparePowerCurve(true);
//        powerCurveParameters.setShowDetailsForTurbines(true);
//        powerCurveParameters.setNormalizePowerCurve(true);
//
//        powerCurveParameters.setOutdoorTemperatureDataSource(OutdoorTemperatureDataSource.OUTDOOR_TEMPERATURE_1s);
//        powerCurveParameters.setPowerMeasurementUnits(PowerMeasurementUnits.KW);
//        powerCurveParameters.setPowerDataSource(PowerDataSource.ACTIVE_POWER);
//        powerCurveParameters.setWindSpeedDataSource(WindSpeedDataSource.ANALOG_DATALOG_WIND_SPEED_ACTIVE);
//        powerCurveParameters.setDataSet(DataSet.SCADA_AVG_LOG);
//
//        powerCurveParameters.setBinCount("80");
//        powerCurveParameters.setBinSpan("0.6PPDD");
//        powerCurveParameters.setWindSpeedOffset("0.2");
//
//        return powerCurveParameters;
//    }

}
