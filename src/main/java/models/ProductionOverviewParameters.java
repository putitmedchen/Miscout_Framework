package models;


import enums.reports.*;

/**
 * Created by sgo on 15.01.2015.
 */
public class ProductionOverviewParameters implements Report {


    private static ProductionOverviewParameters productionOverviewParameters;
    private ProductionDataSource productionDataSource;
    private PowerMeasurementUnits powerMeasurementUnits;
    private WindSpeedDataSource windSpeedDataSource;
    private ReactiveProductionDataSource reactiveProductionDataSource;
    private ReactiveProductionMeasurementUnits reactiveProductionMeasurementUnits;
    private DataSet dataSet;

    public static ProductionOverviewParameters getProductionOverviewParameters() {
        return productionOverviewParameters;
    }

    public static void setProductionOverviewParameters(ProductionOverviewParameters productionOverviewParameters) {
        ProductionOverviewParameters.productionOverviewParameters = productionOverviewParameters;
    }

    public static ProductionOverviewParameters generateParameters() {
        productionOverviewParameters = new ProductionOverviewParameters();

        productionOverviewParameters.setProductionDataSource(ProductionDataSource.GRID_ACTIVE_POWER);
        productionOverviewParameters.setPowerMeasurementUnits(PowerMeasurementUnits.KW);
        productionOverviewParameters.setWindSpeedDataSource(WindSpeedDataSource.ANALOG_DATALOG_WIND_SPEED_ACTIVE);
        productionOverviewParameters.setReactiveProductionDataSource(ReactiveProductionDataSource.GRID_REACTIVE_POWER);
        productionOverviewParameters.setReactiveProductionMeasurementUnits(ReactiveProductionMeasurementUnits.MVArh);
        productionOverviewParameters.setDataSet(DataSet.SCADA_AVG_LOG);

        return productionOverviewParameters;
    }

    //Getters and Setters
    public ProductionDataSource getProductionDataSource() {
        return productionDataSource;
    }

    public void setProductionDataSource(ProductionDataSource productionDataSource) {
        this.productionDataSource = productionDataSource;
    }

    public PowerMeasurementUnits getPowerMeasurementUnits() {
        return powerMeasurementUnits;
    }

    public void setPowerMeasurementUnits(PowerMeasurementUnits powerMeasurementUnits) {
        this.powerMeasurementUnits = powerMeasurementUnits;
    }

    public WindSpeedDataSource getWindSpeedDataSource() {
        return windSpeedDataSource;
    }

    public void setWindSpeedDataSource(WindSpeedDataSource windSpeedDataSource) {
        this.windSpeedDataSource = windSpeedDataSource;
    }

    public ReactiveProductionDataSource getReactiveProductionDataSource() {
        return reactiveProductionDataSource;
    }

    public void setReactiveProductionDataSource(ReactiveProductionDataSource reactiveProductionDataSource) {
        this.reactiveProductionDataSource = reactiveProductionDataSource;
    }

    public ReactiveProductionMeasurementUnits getReactiveProductionMeasurementUnits() {
        return reactiveProductionMeasurementUnits;
    }

    public void setReactiveProductionMeasurementUnits(ReactiveProductionMeasurementUnits reactiveProductionMeasurementUnits) {
        this.reactiveProductionMeasurementUnits = reactiveProductionMeasurementUnits;
    }

    public DataSet getDataSet() {
        return dataSet;
    }
// Setters and Getters

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }
}


