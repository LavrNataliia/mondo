package share.pac.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import share.pac.construct.WaitTo;

public class Steps extends WaitTo {

    public Steps(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    public String getIdWindow() throws Exception {
        return driver.getWindowHandle();
    }

    public void returnMainWindow(String text) throws Exception {
        driver.switchTo().window(text);
    }

    public void closeWindow() throws Exception {
        driver.close();
    }

    private void runScript(String script) throws Exception {
        ((JavascriptExecutor) driver)
                .executeScript(script);
    }

    public void openPage(String url) throws Exception {
        driver.get(url);
//        waitURL(url);
    }

}
