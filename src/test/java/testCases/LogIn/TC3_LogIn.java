package testCases.LogIn;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC3_LogIn extends CommonToAllTests {
    @Test
    @Description //Invalid username and invalid password
    public void LogInTC_3() throws InterruptedException {
        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        Thread.sleep(3000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(3000);
        logInPage.clickLogIn();
        Thread.sleep(3000);
        logInPage.enterLogInEmail(propertiesReader.readKey("invaildLogInUserName2"));
        logInPage.enterLogInPassword(propertiesReader.readKey("invalidLogInPassword2"));
        logInPage.clickLogInBtn();
        Thread.sleep(5000);
        String LogInValidationError=logInPage.getLogInErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("LogInErrorMesage"),LogInValidationError);

        Thread.sleep(5000);
    }
}
