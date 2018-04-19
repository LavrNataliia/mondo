package share.pac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import share.pac.construct.WaitTo;

public class LoginUser extends WaitTo {

    public LoginUser(WebDriver driver) {    super(driver);   }

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div/div[1]/a[1]")
    WebElement SingUpBt;


    @FindBy(xpath = "//*[@id=\"form-signup\"]/fieldset[1]/input[1]")
    WebElement FirstNameBt;

    @FindBy(xpath = "//*[@id=\"form-signup\"]/fieldset[1]/input[2]")
    WebElement LastNameBt;

    @FindBy(xpath = "//*[@id=\"form-signup\"]/fieldset[2]/input")
    WebElement PhoneNumber;

    @FindBy(xpath = "//*[@id=\"form-signup\"]/fieldset[3]/input")
    WebElement Email;

    @FindBy(xpath = "//*[@id=\"form-signup\"]/fieldset[4]/input")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"form-signup\"]/fieldset[5]/input")
    WebElement ConfPassword;

    @FindBy(xpath = "//*[@id=\"js-iagree-styler\"]/div")
    WebElement Agree;

    @FindBy(xpath = " //*[@id=\"form-signup\"]/div/button")
    WebElement CreateAcc;

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div/div[3]")
    WebElement MyAcc;

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div/div[3]/ul/li[3]/a")
    WebElement LodOut;






    public WebElement  SingUpBt() throws Exception {
        return (SingUpBt);
    }
    public WebElement  FirstNameBt() throws Exception {
        return (FirstNameBt);
    }

    public WebElement  LastNameBt() throws Exception {
        return (LastNameBt);
    }
    public WebElement  PhoneNumber() throws Exception {
        return (PhoneNumber);
    }

    public WebElement  Email() throws Exception {
        return (Email);
    }
    public WebElement  Password() throws Exception {
        return (Password);
    }

    public WebElement  ConfPassword() throws Exception {
        return (ConfPassword);
    }

    public WebElement  Agree() throws Exception {
        return (Agree);
    }

    public WebElement  CreateAcc() throws Exception {
        return (CreateAcc);
    }

    public WebElement  MyAcc() throws Exception {
        return (MyAcc);
    }

    public WebElement  LogOut() throws Exception {
        return (LodOut);
    }

    /*public WebElement  PricingBt() throws Exception {
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
    }*/

}