package testCases.LogIn;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

import java.time.Duration;

public class TC5_LogIn extends CommonToAllTests {

    @Test
    @Description //Invalid Username and valid password
    public void LogInTC_5 () throws InterruptedException {
        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        Thread.sleep(3000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(2000);
        logInPage.clickLogIn();
        Thread.sleep(3000);
        logInPage.enterLogInEmail(propertiesReader.readKey("invaildLogInUserName4"));
        logInPage.enterLogInPassword(propertiesReader.readKey("invalidLogInPassword4"));
        logInPage.clickLogInBtn();

        String LogInValidationError=logInPage.getLogInErrorMessage();
        Assert.assertEquals((propertiesReader.readKey("LogInErrorMesage")),LogInValidationError);
        Thread.sleep(5000);
    }
}
