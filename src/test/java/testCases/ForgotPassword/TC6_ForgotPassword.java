package testCases.ForgotPassword;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import projectPageNames.ForgotPasswordPage;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;

public class TC6_ForgotPassword extends CommonToAllTests {

    @Test
    @Description //Back button naviggation testing.
    public void ForgotPasswordTC_6() throws InterruptedException {

        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);
        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        userReg.clickMyAccountDropdown();
        logInPage.clickLogIn();
        Thread.sleep(2000);
        forgotPasswordPage.clickForgotPassword();
        Thread.sleep(2000);
        forgotPasswordPage.clickBackBtn();

    }

}
