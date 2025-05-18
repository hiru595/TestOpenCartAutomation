package testCases.ForgotPassword;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.ForgotPasswordPage;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC1_ForgotPassword extends CommonToAllTests {

    @Test
    @Description //Valid and registered email id.
    public void ForgotPasswordTC_1() throws InterruptedException {
        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);
        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage(driver);

        userReg.clickAdvancedButton();
        Thread.sleep(2000);
        userReg.clickProceedLink();
        Thread.sleep(2000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(2000);
        logInPage.clickLogIn();
        forgotPasswordPage.clickForgotPassword();
        forgotPasswordPage.enterForgotPwEmail(propertiesReader.readKey("ValidEmail_Forgotpassword"));
        Thread.sleep(2000);
        forgotPasswordPage.clickContinueBtn();
        Thread.sleep(5000);

        String ForGotPW_SuceessMsg = forgotPasswordPage.GetSuccessMsg();
        Assert.assertEquals((propertiesReader.readKey("ForgotPasswordSuccessMessage")),ForGotPW_SuceessMsg);

        Thread.sleep(5000);
    }
}
