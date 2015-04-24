package pages;

import elements.Button;
import elements.TextContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

/**
 * Created by sgo on 4/21/2015.
 */
public class ReportTypesFragment extends AbstractPageObject {

    public ReportTypesFragment(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "(//div[@id='report-templates-tree']//a)[1]")
    public TextContainer reports;
    
    @FindBy(xpath = "(//a[@class='dynatree-title-reports'])[2]")
    public Button powerCurve;

    @FindBy(xpath = "(//a[@class='dynatree-title-reports'])[3]")
    public Button productionEfficiency;
   
    @FindBy(xpath = "(//a[@class='dynatree-title-reports'])[4]")
    public Button productionOverview;
    
    @FindBy(xpath = "(//a[@class='dynatree-title-reports'])[5]")
    public Button statusCodeStatistic;
    @FindBy(xpath = "(//a[@class='dynatree-title-reports'])[6]")
    public Button statusCodeTrend;
    @FindBy(xpath = "(//a[@class='dynatree-title-reports'])[7]")
    public Button windRose;

}
