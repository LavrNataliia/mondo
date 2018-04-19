package share.pac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUpTestBase() throws Exception {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,30);

    }

  //  @AfterClass
    //public void driverClose(){
                //driver.close();}
}