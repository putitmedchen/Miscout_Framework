package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

import java.util.List;

/**
 * Created by sgo on 4/7/2015.
 */
public class TargetsFragment extends AbstractPageObject {

    @FindBy(css = ".dynatree-title-sites")
    private List<WebElement> mainTarget;
    
    @FindBy(xpath = "//span[@class='dynatree-node-sites dynatree-folder-sites dynatree-expanded-sites dynatree-has-children-sites dynatree-lastsib-sites dynatree-exp-sites-el dynatree-ico-sites-ef dynatree-partsel-sites']")
    private WebElement isTargetChecked;

    @FindBy(xpath = "//span[contains(@class, 'dynatree-node-sites dynatree-folder-sites dynatree-expanded-sites dynatree-has-children-sites dynatree-lastsib-sites dynatree-exp-sites-el dynatree-ico-sites-ef dynatree-partsel-sites')]/a")
    private WebElement targetCheckbox;
    
    //$('ul[style=""] .dynatree-title-sites')


    public TargetsFragment(WebDriver driver) {
        super(driver);
    }

    public void selectMainTarget() {
        pause(6000);
        if(isTargetChecked.isDisplayed()){
            System.out.println("+++++++++++" + isTargetChecked.isDisplayed() + "+++++++++++++++++++++++++++" + isTargetChecked.isEnabled());
           targetCheckbox.click();

            targetCheckbox.click();
            targetCheckbox.click();
            mainTarget.get(1).click();
            mainTarget.get(1).click();
        }else{
        mainTarget.get(1).click();
        }
    }

    public void selectAllTargets() {
        for (int i = 0; i < mainTarget.size(); i++)
            mainTarget.get(i).click();
        // Assert.assertTrue(mainTarget.get(0).isSelected());
    }
    
    public void checkTargetByName(String name){
         for(int i = 0; i < mainTarget.size(); i++){
             if(mainTarget.get(i).getText().contains(name)){
                 mainTarget.get(i).click();
             }
         }
        
    }
}
