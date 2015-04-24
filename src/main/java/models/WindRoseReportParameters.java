package models;


import enums.reports.*;

/**
 * Created by sgo on 15.01.2015.
 */
public class WindRoseReportParameters implements Report {

    private Boolean showDetailsForTurbines;
    private Boolean normalizeData;

    private OutdoorTemperatureDataSource outdoorTemperatureDataSource;
    private PowerMeasurementUnits powerMeasurementUnits;
    private PowerDataSource powerDataSource;
    private WindSpeedDataSource windSpeedDataSource;
    private DataSet dataSet;

    private static WindRoseReportParameters windRoseReportParameters;

    //Getters and Setters
    public Boolean getShowDetailsForTurbines() {
        return showDetailsForTurbines;
    }

    public void setShowDetailsForTurbines(Boolean showDetailsForTurbines) {
        this.showDetailsForTurbines = showDetailsForTurbines;
    }

    public Boolean getNormalizeData() {
        return normalizeData;
    }

    public void setNormalizeData(Boolean normalizeData) {
        this.normalizeData = normalizeData;
    }

    public OutdoorTemperatureDataSource getOutdoorTemperatureDataSource() {
        return outdoorTemperatureDataSource;
    }

    public void setOutdoorTemperatureDataSource(OutdoorTemperatureDataSource outdoorTemperatureDataSource) {
        this.outdoorTemperatureDataSource = outdoorTemperatureDataSource;
    }

    public PowerMeasurementUnits getPowerMeasurementUnits() {
        return powerMeasurementUnits;
    }

    public void setPowerMeasurementUnits(PowerMeasurementUnits powerMeasurementUnits) {
        this.powerMeasurementUnits = powerMeasurementUnits;
    }

    public PowerDataSource getPowerDataSource() {
        return powerDataSource;
    }

    public void setPowerDataSource(PowerDataSource powerDataSource) {
        this.powerDataSource = powerDataSource;
    }

    public WindSpeedDataSource getWindSpeedDataSource() {
        return windSpeedDataSource;
    }

    public void setWindSpeedDataSource(WindSpeedDataSource windSpeedDataSource) {
        this.windSpeedDataSource = windSpeedDataSource;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }
// Setters and Getters


    public static WindRoseReportParameters generateParameters() {
        windRoseReportParameters = new WindRoseReportParameters();

        windRoseReportParameters.setShowDetailsForTurbines(true);
        windRoseReportParameters.setNormalizeData(true);

        windRoseReportParameters.setOutdoorTemperatureDataSource(OutdoorTemperatureDataSource.OUTDOOR_TEMPERATURE_1s);
        windRoseReportParameters.setPowerMeasurementUnits(PowerMeasurementUnits.KW);
        windRoseReportParameters.setPowerDataSource(PowerDataSource.ACTIVE_POWER);
        windRoseReportParameters.setWindSpeedDataSource(WindSpeedDataSource.ANALOG_DATALOG_WIND_SPEED_ACTIVE);
        windRoseReportParameters.setDataSet(DataSet.SCADA_AVG_LOG);

        return windRoseReportParameters;
    }
}
