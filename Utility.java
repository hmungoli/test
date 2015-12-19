import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by himanshum1 on 12/13/15.


 commit4
commit2
 branch from2
updated merged

 commit3
 branch from3rd
 */
public class Utility {

    WebDriver dr;
    public Utility(WebDriver driver) {

        dr=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean getPage(){

        return true;

    }
}
