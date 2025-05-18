package testCases.UserRegistration;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC4_UserRegistration extends CommonToAllTests {

    @Test
    @Description //Invalidformat of Email and Password
    public void UserRegTC_4() throws InterruptedException {
        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        Thread.sleep(5000);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();

        Thread.sleep(5000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(5000);
        userReg.clickRegisterLink();
        Thread.sleep(5000);

        userReg.getFirstName(propertiesReader.readKey("validFirstName"));
        userReg.getLastName(propertiesReader.readKey("validLastName"));
        userReg.EmailId(propertiesReader.readKey("invalidEmail1"));
        userReg.Password(propertiesReader.readKey("invalidPassword1"));

        Thread.sleep(5000);
        userReg.Scroll();
        Thread.sleep(5000);
        userReg.NewsLatter_Subscribe();
        Thread.sleep(5000);
        userReg.AgreeTermsnConditions();
        Thread.sleep(5000);
        userReg.clickSubmitBtn();
        Thread.sleep(5000);
        String EmailErrorMsg= userReg.getEmailErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("BlankEmailMessage"),EmailErrorMsg);

        String PasswordErrorMsg= userReg.getPasswordErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("BlankPasswordMessage"),PasswordErrorMsg);

        Thread.sleep(15000);
    }
}
