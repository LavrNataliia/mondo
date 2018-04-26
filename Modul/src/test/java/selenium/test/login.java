package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import share.pac.TestBase;
import share.pac.pages.LoginUser;
import share.pac.utils.RandomGenerate;

import java.util.ArrayList;
import java.util.Random;

import java.sql.Array;
import java.util.List;

public class login extends TestBase {
    private share.pac.pages.LoginUser LoginUser;
    private Actions action;
    private RandomGenerate rand;


    @BeforeClass
    public void start() throws Exception {
        LoginUser = new LoginUser(driver);
        action = new Actions(driver);
        rand = new RandomGenerate();

        driver.get("http://www.mondotunes.com/");
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
    }


//    @Test
//    public void test001() throws Exception {
//        driver.get("http://www.mondotunes.com/");
//        LoginUser.SingUpBt().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
//    }


//    @Test
//    public void test002() throws Exception {
//        Integer usersCnt = 20;
//        List<String> mailDb = generateMailDb( 2 );
//        for(String mailAddress: mailDb)
//        {
//            test002_impl(mailAddress);
//        }
//    }
//    public List<String> generateMailDb(Integer usersCnt) {
//        List<String> mailDb = new ArrayList<String>();
//        for (Integer i = 0; i < usersCnt; ++i) {
//            mailDb.add(String.format("nataliia_%d_%d@mail.com", n, i));
//        }
//        return mailDb;
//    }



    @Test
    public void test002() throws Exception {

        LoginUser.FirstNameBt().sendKeys(rand.getRandomLetterGenerateStrict(4));
        LoginUser.LastNameBt().sendKeys(rand.getRandomLetterGenerateStrict(6));
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(4, 6,2, "ru"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());
    }
    @Test
    public void test003() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys(rand.getRandomLetterGenerateStrict(1));
        LoginUser.LastNameBt().sendKeys(rand.getRandomLetterGenerateStrict(6));
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(5,4,2, "ua"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

    }

    @Test
    public void test004() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys(rand.getRandomLetterGenerateStrict(255));
        LoginUser.LastNameBt().sendKeys(rand.getRandomLetterGenerateStrict(6));
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(5,4,2, "ua"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

    }

    @Test
    public void test005() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys(rand.getRandomLetterGenerateStrict(256));
        LoginUser.LastNameBt().sendKeys(rand.getRandomLetterGenerateStrict(6));
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(5,4,2, "ua"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

    }

    @Test
    public void test006() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys("   ");
        LoginUser.LastNameBt().sendKeys(rand.getRandomNumberGenerateStrict(6));
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailFree(7, "com"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

    }


    @Test
    public void test007() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys("!@#$%^&*()_+|{}[]");
        LoginUser.LastNameBt().sendKeys("tester");
        LoginUser.PhoneNumber().sendKeys("3838388382");
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(4,5,7,"com"));
        LoginUser.Password().sendKeys("123456");
        LoginUser.ConfPassword().sendKeys("123456");
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());
    }





    @Test
    public void test008() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.LastNameBt().sendKeys("tester");
        LoginUser.PhoneNumber().sendKeys("3838388382");
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(4,5,6,"com"));
        LoginUser.Password().sendKeys("123456");
        LoginUser.ConfPassword().sendKeys("123456");
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();

        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/a/img")).click();


    }


    //
//    @Test
//    public void test009() throws Exception {
//        LoginUser.SingUpBt().click();
//        LoginUser.FirstNameBt().sendKeys("test");
//        LoginUser.LastNameBt().sendKeys("t");
//        LoginUser.PhoneNumber().sendKeys("3838388382");
//        LoginUser.Email().sendKeys(generateRandomMail());
//        LoginUser.Password().sendKeys("123456");
//        LoginUser.ConfPassword().sendKeys("123456");
//        LoginUser.Agree().click();
//        LoginUser.CreateAcc().click();
//        WebElement explicitWait = (new WebDriverWait(driver, 100))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
//        Assert.assertEquals("Welcome to the MondoTunes Team!",
//                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());
//
//        LoginUser.MyAcc().click();
//        LoginUser.LogOut().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());
//    }
//    @Test
//    public void test010() throws Exception {
//        LoginUser.SingUpBt().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
//        LoginUser.FirstNameBt().sendKeys("test");
//        LoginUser.LastNameBt().sendKeys("Oxford Dictionaries definitions. Looking for the meanings of words, " +
//                "phrases, and expressions? We provide hundreds of thousands of " +
//                "definitions, synonyms, antonyms, " +
//                "and pronunciations for English and other languages, " +
//                "derived from our language research and 1");
//        LoginUser.PhoneNumber().sendKeys("3838388382");
//        LoginUser.Email().sendKeys(generateRandomMail());
//        LoginUser.Password().sendKeys("123456");
//        LoginUser.ConfPassword().sendKeys("123456");
//        LoginUser.Agree().click();
//        LoginUser.CreateAcc().click();
//        WebElement explicitWait = (new WebDriverWait(driver, 100))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
//        Assert.assertEquals("Welcome to the MondoTunes Team!",
//                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());
//
//        LoginUser.MyAcc().click();
//        LoginUser.LogOut().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());
//
//    }
//
//    @Test
//    public void test011() throws Exception {
//        LoginUser.SingUpBt().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
//        LoginUser.FirstNameBt().sendKeys("test");
//        LoginUser.LastNameBt().sendKeys("Oxford Dictionaries definitions. " +
//                "Looking for the meanings of words, phrases, and expressions? We provide " +
//                "hundreds of thousands of definitions, synonyms, antonyms, " +
//                "and pronunciations for English and other languages, " +
//                "derived from our language research and 123");
//        LoginUser.PhoneNumber().sendKeys("3838388382");
//        LoginUser.Email().sendKeys(generateRandomMail());
//        LoginUser.Password().sendKeys("123456");
//        LoginUser.ConfPassword().sendKeys("123456");
//        LoginUser.Agree().click();
//        LoginUser.CreateAcc().click();
//        WebElement explicitWait = (new WebDriverWait(driver, 100))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
//        Assert.assertEquals("Welcome to the MondoTunes Team!",
//                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());
//
//        LoginUser.MyAcc().click();
//        LoginUser.LogOut().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());
//
//    }
//
//    @Test
//    public void test012() throws Exception {
//        LoginUser.SingUpBt().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
//        LoginUser.FirstNameBt().sendKeys("test");
//        LoginUser.LastNameBt().sendKeys("   ");
//        LoginUser.PhoneNumber().sendKeys("3838388382");
//        LoginUser.Email().sendKeys(generateRandomMail());
//        LoginUser.Password().sendKeys("123456");
//        LoginUser.ConfPassword().sendKeys("123456");
//        LoginUser.Agree().click();
//        LoginUser.CreateAcc().click();
//        WebElement explicitWait = (new WebDriverWait(driver, 100))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
//        Assert.assertEquals("Welcome to the MondoTunes Team!",
//                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());
//
//        LoginUser.MyAcc().click();
//        LoginUser.LogOut().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());
//
//    }

//

    @Test
    public void test013() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys(rand.generateRandomNum(3));
        LoginUser.LastNameBt().sendKeys("!@#$%^&*()_+|{}[]");
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailStrict(2,3,5,"com"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        WebElement explicitWait = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div/div[3]")));
        Assert.assertEquals("Welcome to the MondoTunes Team!",
                driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText());

        LoginUser.MyAcc().click();
        LoginUser.LogOut().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

    }
//
//
    @Test
    public void test014() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys(rand.getUnicodeRandomSymbolFree(4));
        LoginUser.PhoneNumber().sendKeys(rand.getRandomNumberGenerateStrict(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailFree(5,"com"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
//        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"form-signup\"]/fieldset[1]/input[2]"))
//                .getText().contains("ui left black large radius focus-bc-green error"));
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

        System.out.printf(driver.findElement(By.xpath("//*[@class='error-tooltip']")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]")).isDisplayed());

    }


    @Test
    public void test015() throws Exception {
        LoginUser.SingUpBt().click();
        Assert.assertEquals("Start Selling Your Music Worldwide",
                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div/div[2]/div/h2")).getText());
        LoginUser.FirstNameBt().sendKeys(rand.getRandomLetterGenerateStrict(25));
        LoginUser.LastNameBt().sendKeys(rand.getRandomLetterGenerateStrict(5));
        LoginUser.PhoneNumber().sendKeys(rand.generateRandomNum(10));
        LoginUser.Email().sendKeys(rand.getRandomEmailInv(3,2,"com"));
        String pass = rand.getRandomLetterGenerateStrict(6);
        LoginUser.Password().sendKeys(pass);
        LoginUser.ConfPassword().sendKeys(pass);
        LoginUser.Agree().click();
        LoginUser.CreateAcc().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/button")).isDisplayed());

//        Assert.assertEquals("Email Address: This value is not a valid email address.",
//                driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/text()")).getText());
//
//        LoginUser.MyAcc().click();
//        LoginUser.LogOut().click();
//        Assert.assertEquals("Start Selling Your Music Worldwide",
//                driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div/div[2]/div/h2")).getText());

             }
             }
