package testCases.LogIn;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

import java.time.Duration;

public class TC1_LogIn extends CommonToAllTests {

    @Test
    @Description//Valid UserName and Password
    public void LogInTC_1() throws InterruptedException {
        LogInPage logInPage=new LogInPage(driver);
        UserRegistrationPage userReg=new UserRegistrationPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();

        Thread.sleep(5000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(5000);
        logInPage.clickLogIn();
        Thread.sleep(3000);
        logInPage.enterLogInEmail(propertiesReader.readKey("validLogInUserName"));
        Thread.sleep(2000);
        logInPage.enterLogInPassword(propertiesReader.readKey("validLogInpassword"));
        Thread.sleep(2000);
        logInPage.clickLogInBtn();
        Thread.sleep(10000);

    }
}
