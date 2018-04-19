package share.pac.pages;

import share.pac.construct.WaitTo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HedderPage extends WaitTo {

    public HedderPage(WebDriver driver) {    super(driver);   }

    @FindBy (xpath = "/html/body/header/div[2]/div/div/nav/ul/li[4]/a")
    WebElement SellYourMusicBt;

    @FindBy (xpath = "/html/body/header/div[2]/div/div/nav/ul/li[5]/a")
    WebElement PromoteMusicBt;

    @FindBy (xpath = "/html/body/header/div[2]/div/div/nav/ul/li[6]/a")
    WebElement PricingBt;

    @FindBy (xpath = "/html/body/header/div[2]/div/div/nav/ul/li[7]/a")
    WebElement MasterBt;

    @FindBy (xpath = "/html/body/header/div[2]/div/div/nav/ul/li[8]/a")
    WebElement SuccessBt;

    @FindBy (xpath = "/html/body/header/div[2]/div/div/nav/ul/li[9]/a")
    WebElement BlogBt;


    public WebElement  SellYourMusicBt() throws Exception {
        return (SellYourMusicBt);
    }
    public WebElement  PromoteMusicBt() throws Exception {
        return (PromoteMusicBt);
    }

    public WebElement  PricingBt() throws Exception {
        return (PricingBt);
    }

    public WebElement  MasterBt() throws Exception {
        return (MasterBt);
    }

    public WebElement  SuccessBt() throws Exception {
        return (SuccessBt);
    }

    public WebElement BlogBt() throws Exception {
        return  (BlogBt);
    }

}

