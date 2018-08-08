package share.pac.construct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public abstract class WaitTo extends MTConstructPage {

    private final static int IMPLICITLY_WAIT = 10;
    private final static int EXPLICITLY_WAIT = 15;

    public WaitTo(WebDriver driver) {
        super(driver);
    }

    private WebDriverWait getWait (int seconds) throws Exception{
        return new WebDriverWait(driver, seconds);
    }
//
//    public boolean waitURL(String url) throws Exception{
//        return getWait(EXPLICITLY_WAIT).until(ExpectedConditions.urlToBe(url));
//    }
///
//
//    protected WebElement waitElement(WebElement element) throws Exception{
//        return getWait(IMPLICITLY_WAIT).until(ExpectedConditions.visibilityOf(element));
//    }
//    public boolean waitContainUrl(String url) throws Exception{
//        return getWait(IMPLICITLY_WAIT).until(ExpectedConditions.urlContains(url));
//    }
//
//    protected boolean waitChangeText(WebElement element, String text) throws Exception{
//        return getWait(IMPLICITLY_WAIT).until(ExpectedConditions.textToBePresentInElement(element, text));
//    }

//    protected void waitElementForClick(WebElement element) throws Exception{
//        getWait(EXPLICITLY_WAIT).until(ExpectedConditions.elementToBeClickable(element)).click();
//    }
//
//    protected boolean isDisabledElement(WebElement element) throws Exception{
//        return element.getCssValue("disabled").equals(" ");
//    }
//
//    protected boolean isNotDisplayedElement(WebElement element) throws Exception{
//        WebDriverWait wait = new WebDriverWait(driver, 1);
//        return wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
//    }
//
//    protected boolean isCloseElement(String xpath) throws Exception{
//        return getWait(IMPLICITLY_WAIT).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
//    }

}
