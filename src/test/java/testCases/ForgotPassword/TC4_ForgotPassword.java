package testCases.ForgotPassword;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.ForgotPasswordPage;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC4_ForgotPassword extends CommonToAllTests {

    @Test
    @Description //Invalid Emailid
    public void ForgotPasswordTC_4() throws InterruptedException {

        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);
        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        Thread.sleep(2000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(2000);
        logInPage.clickLogIn();
        Thread.sleep(2000);
        forgotPasswordPage.clickForgotPassword();
        Thread.sleep(2000);
        forgotPasswordPage.enterForgotPwEmail(propertiesReader.readKey("InValidEmail_Forgotpassword3"));
        forgotPasswordPage.clickContinueBtn();

        String ForGotPW_ErrorMsg = forgotPasswordPage.GetErrorMsg();
        Assert.assertEquals((propertiesReader.readKey("ForgotPasswordErrorMessage")),ForGotPW_ErrorMsg);

        Thread.sleep(5000);
    }
}
