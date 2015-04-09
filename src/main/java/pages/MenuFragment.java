package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.AbstractPageObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgo on 02.01.2015.
 */
public class MenuFragment extends AbstractPageObject {

    public MenuFragment(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-key='Map View']")
    private WebElement mapView;

    @FindBy(xpath = "//a[@data-key='Dashboard']")
    private WebElement dashBoard;

    @FindBy(xpath = "//a[@data-key='Online Logger']")
    private WebElement onlineLogger;

    @FindBy(xpath = "//a[@data-key='Average Log']")
    private WebElement averageLog;

    @FindBy(xpath = "//a[@data-key='Scatter Plot']")
    private WebElement scatterPlot;

    @FindBy(xpath = "//a[@data-key='Status Log']")
    private WebElement statusLog;

    @FindBy(xpath = "//a[@data-key='Reports']")
    private WebElement reports;

    @FindBy(xpath = "//a[@data-key='Alarms']")
    private WebElement alarms;

    private List<WebElement> menuItems = new ArrayList<>();

    public void checkMenuItems(){
        menuItems.add(mapView);
        menuItems.add(dashBoard);
        menuItems.add(onlineLogger);
        menuItems.add(averageLog);
        menuItems.add(scatterPlot);
        menuItems.add(statusLog);
        menuItems.add(reports);
        menuItems.add(alarms);


        for(WebElement el: menuItems){
            Assert.assertTrue(el.isEnabled(), el.getText() + el.getTagName() + " element is not enabled" );
            Assert.assertTrue(el.isDisplayed(), el.getText()  + el.getTagName()  + " unable to display this element");
        }
    }

    public void openMapView(){
        mapView.click();
    }

    public void openDashBoard(){
        dashBoard.click();
    }

    public void openOnlineLogger(){
        onlineLogger.click();
    }

    public void openAverageLogger(){
        averageLog.click();
    }

    public void openScatterPlot(){
        scatterPlot.click();
    }

    public void openStatusLog(){
        statusLog.click();
    }

    public void openReports(){
        reports.click();
    }

    public void openAlarms(){
        alarms.click();
    }
}
