package share.pac.construct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class MTConstructPage {
    protected WebDriver driver;

    public MTConstructPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
