package pages;

import elements.TextContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.AbstractPageObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgo on 02.01.2015.
 */
public class MenuFragment extends AbstractPageObject {

    @FindBy(xpath = "//a[@data-key='Map View']")
    private TextContainer mapView;
    @FindBy(xpath = "//a[@data-key='Dashboard']")
    private TextContainer dashBoard;
    @FindBy(xpath = "//a[@data-key='Online Logger']")
    private TextContainer onlineLogger;
    @FindBy(xpath = "//a[@data-key='Average Log']")
    private TextContainer averageLog;
    @FindBy(xpath = "//a[@data-key='Scatter Plot']")
    private TextContainer scatterPlot;
    @FindBy(xpath = "//a[@data-key='Status Log']")
    private TextContainer statusLog;
    @FindBy(xpath = "//a[@data-key='Reports']")
    private TextContainer reports;
    @FindBy(xpath = "//a[@data-key='Alarms']")
    private TextContainer alarms;
    private List<TextContainer> menuItems = new ArrayList<>();

    public MenuFragment(WebDriver driver) {
        super(driver);
    }

    public void checkMenuItems() {
        menuItems.add(mapView);
        menuItems.add(dashBoard);
        menuItems.add(onlineLogger);
        menuItems.add(averageLog);
        menuItems.add(scatterPlot);
        menuItems.add(statusLog);
        menuItems.add(reports);
        menuItems.add(alarms);


        for (TextContainer el : menuItems) {
            Assert.assertTrue(el.isClickable(), el.getText() + " element is not enabled");
        }
    }

    public void openMapView() {
        mapView.click();
    }

    public void openDashBoard() {
        dashBoard.click();
    }

    public void openOnlineLogger() {
        onlineLogger.click();
    }

    public void openAverageLogger() {
        averageLog.click();
    }

    public void openScatterPlot() {
        scatterPlot.click();
    }

    public void openStatusLog() {
        statusLog.click();
    }

    public void openReports() {
        reports.click();
    }

    public void openAlarms() {
        alarms.click();
    }
}
