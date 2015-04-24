package models;


import enums.reports.DataSet;
import enums.reports.PowerDataSource;
import enums.reports.PowerMeasurementUnits;
import enums.reports.WindSpeedDataSource;

/**
 * Created by sgo on 15.01.2015.
 */
public class ProductionEfficiencyParameters implements Report {

    private PowerMeasurementUnits powerMeasurementUnits;
    private PowerDataSource powerDataSource;
    private WindSpeedDataSource windSpeedDataSource;
    private DataSet dataSet;

    private static ProductionEfficiencyParameters productionEfficiencyParameters;

    //Getters and Setters
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

    public static ProductionEfficiencyParameters generateParameters() {
        productionEfficiencyParameters = new ProductionEfficiencyParameters();

        productionEfficiencyParameters.setPowerMeasurementUnits(PowerMeasurementUnits.KW);
        productionEfficiencyParameters.setPowerDataSource(PowerDataSource.ACTIVE_POWER);
        productionEfficiencyParameters.setWindSpeedDataSource(WindSpeedDataSource.ANALOG_DATALOG_WIND_SPEED_ACTIVE);
        productionEfficiencyParameters.setDataSet(DataSet.SCADA_AVG_LOG);

        return productionEfficiencyParameters;

    }
}
