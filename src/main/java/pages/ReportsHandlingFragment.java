package pages;

import elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

import java.util.List;

/**
 * Created by sgo on 4/22/2015.
 */
public class ReportsHandlingFragment extends AbstractPageObject{

    public ReportsHandlingFragment(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "td [title='Production Efficiency Report']")
    private List<Button> productionEfficiencyList;
    
    @FindBy(css = "button[id^=btn-open]")
    private Button saveAs;
    
    @FindBy(css = "button[id^=btn-send]")
    private Button send;
    
    @FindBy(css = "button[id^=btn-remove]")
    private Button remove;
    
    
    
}
