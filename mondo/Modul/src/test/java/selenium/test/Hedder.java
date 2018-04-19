package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import share.pac.TestBase;

import org.testng.Assert;
import share.pac.pages.HedderPage;

import java.util.Iterator;
import java.util.Set;


public class Hedder extends TestBase {
    private HedderPage HedderPage;
    private  Actions action;

    @BeforeClass
    public void start() {
        HedderPage = new HedderPage(driver);
        action = new Actions(driver);

    }

    @Test
    public void test001() throws Exception {
        driver.get("http://www.mondotunes.com/");
        HedderPage.SellYourMusicBt().click();
        //System.out.printf(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div/h1")).getText());
        Assert.assertEquals("Sell Your Music Globally", driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div/h1")).getText());
    }

    @Test
    public void test002() throws Exception {
        HedderPage.PromoteMusicBt().click();
        Assert.assertEquals("Promote Your Music Worldwide", driver.findElement(By.xpath("/html/body/section/div[1]/div/h1")).getText());

    }
    @Test
    public void test003() throws Exception {
        HedderPage.PricingBt().click();
        Assert.assertEquals("MondoTunes Pricing & Services", driver.findElement(By.xpath("/html/body/section/div[1]/div/h1")).getText());

    }
    @Test
    public void test004() throws Exception {
        HedderPage.MasterBt().click();
        Assert.assertEquals("MondoTunes", driver.findElement(By.xpath("/html/body/section/div[1]/div/h1/span")).getText());

    }

    @Test
    public void test005() throws Exception {
        HedderPage.SuccessBt().click();
        Assert.assertEquals("MondoTunes Success", driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/h1")).getText());

    }

    @Test
    public void test006() throws Exception {
        HedderPage.BlogBt().click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String mainWindow = (String) it.next();
        String popUp = (String) it.next();
        driver.switchTo().window(popUp);
        Assert.assertEquals("All news", driver.findElement(By.xpath("//*[@id=\"menu-item-13\"]/a")).getText());
        driver.switchTo().window(mainWindow);



    }
}


//        System.out.printf(">>>>>>>>>>>>>>>" +HedderPage.getPerfil().toString());
//        action.sendKeys(Keys.ENTER).build().perform();
//        Thread.sleep(10);
//        System.out.printf(">>>>>>>>>>>>>>>>>>111");
//        action.sendKeys(Keys.TAB).build().perform();
//        action.sendKeys(Keys.ENTER).build().perform();
//        System.out.printf("\n>>>>>>>>>>>>>>>>>>>>>>222");
// Assert.assertEquals("Primer Nombre", "Primer Nombre");

