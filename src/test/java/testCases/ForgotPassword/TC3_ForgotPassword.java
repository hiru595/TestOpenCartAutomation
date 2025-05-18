package testCases.ForgotPassword;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.ForgotPasswordPage;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC3_ForgotPassword extends CommonToAllTests {

    @Test
    @Description //Invalid email id

    public void ForgotPasswordTC_3() throws InterruptedException {

        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);
        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        Thread.sleep(3000);
        userReg.clickMyAccountDropdown();

        logInPage.clickLogIn();
        Thread.sleep(2000);
        forgotPasswordPage.clickForgotPassword();
        Thread.sleep(2000);
        forgotPasswordPage.enterForgotPwEmail(propertiesReader.readKey("InValidEmail_Forgotpassword2"));
        Thread.sleep(2000);
        forgotPasswordPage.clickContinueBtn();

        String ForGotPW_ErrorMsg = forgotPasswordPage.GetErrorMsg();
        Assert.assertEquals((propertiesReader.readKey("ForgotPasswordErrorMessage")),ForGotPW_ErrorMsg);

        Thread.sleep(5000);
    }
}
