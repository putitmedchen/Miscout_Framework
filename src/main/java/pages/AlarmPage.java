package pages;

import elements.Button;
import elements.TextContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.AbstractPageObject;

import java.util.List;

/**
 * Created by sgo on 4/7/2015.
 */
public class AlarmPage extends AbstractPageObject {
    public AlarmPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(css = "#jqgh_alarmsGrid_targetName")
    private TextContainer unitPlaceholder;
    
    @FindBy(css = "#jqgh_alarmsGrid_time")
    private TextContainer timePlaceholder;
    
    @FindBy(css = "#jqgh_alarmsGrid_code")
    private TextContainer codePlaceholder;

    @FindBy(css = "#jqgh_alarmsGrid_text")
    private TextContainer textPlaceholder;

    @FindBy(css = "#jqgh_alarmsGrid_acknowledged")
    private TextContainer acknowledgePlaceholder;

    @FindBy(css = "#jqgh_alarmsGrid_acknowledgedBy")
    private TextContainer ackByPlaceholder;

    @FindBy(css = "#jqgh_alarmsGrid_comment")
    private TextContainer commentPlaceholder;

    @FindBy(css = "#jqgh_alarmsGrid_count")
    private TextContainer countPlaceholder;
    
    @FindBy(css = "input .acknowledgeAlarm mitaButton mitaButton")
   // @FindBy(xpath = "//input[@class='acknowledgeAlarm mitaButton mitaButton']")
    private List<WebElement> acknowledgeButtons;

    @FindBy(css = "$td aria-describedby")
    private List<WebElement> unitNames;

    @FindBy(xpath = "//button[@id='confirm-yes-button']")
    private Button confirmAcknowledge;

    @FindBy(css="button #confirm-no-button")
    private Button cancelAcknowledge;

    public void checkAlarmColums(){
        
        pause(3000);
        Assert.assertTrue(unitPlaceholder.getText().equals("Unit"), "Element isn't visible " + unitPlaceholder.getText());
        Assert.assertTrue(timePlaceholder.getText().equals("Time"));
        Assert.assertTrue(codePlaceholder.getText().equals("Code"));
        Assert.assertTrue(textPlaceholder.getText().equals("Text"));
        Assert.assertTrue(acknowledgePlaceholder.isClickable(),  "Element isn't visible " + acknowledgePlaceholder );
        Assert.assertTrue(ackByPlaceholder.getText().equals("Ack. By"), "Element isn't visible " + ackByPlaceholder.getText());
        Assert.assertTrue(commentPlaceholder.getText().equals("Comment"));
        Assert.assertTrue(countPlaceholder.getText().equals("Count"));


    }
    
    public void acknowledgeAlarmByUnitName(String unitName){
        for(int i = 0; i < unitNames.size(); i++ ){
            if(unitNames.get(i).getAttribute("title").contains(unitName)){

            }
        }
    }

    public void acknowledgeAllAlarms(){

        if(!acknowledgeButtons.isEmpty()) {

            for (int i = 0; i < acknowledgeButtons.size(); i++) {
                acknowledgeButtons.get(i).click();
                // pause(3000);

                //DriverFactory.getDriver().findElement(By.xpath(".//*[@id='confirm-yes-button']")).click();
                confirmAcknowledge.click();
            }
        }
    }
}
