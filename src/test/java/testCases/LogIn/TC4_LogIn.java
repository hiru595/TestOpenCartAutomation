package testCases.LogIn;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

import java.time.Duration;

public class TC4_LogIn extends CommonToAllTests {
        @Test
        @Description //Valid Username and Invalid Password
        public void LogInTC_4() throws InterruptedException {
            UserRegistrationPage userReg=new UserRegistrationPage(driver);
            LogInPage logInPage=new LogInPage(driver);

            userReg.clickAdvancedButton();
            userReg.clickProceedLink();
            Thread.sleep(3000);
            userReg.clickMyAccountDropdown();
            Thread.sleep(3000);
            logInPage.clickLogIn();
            Thread.sleep(3000);
            logInPage.enterLogInEmail(propertiesReader.readKey("invaildLogInUserName3"));
            logInPage.enterLogInPassword(propertiesReader.readKey("invalidLogInPassword3"));
            logInPage.clickLogInBtn();

            String LogInValidationError=logInPage.getLogInErrorMessage();
            Assert.assertEquals((propertiesReader.readKey("LogInErrorMesage")),LogInValidationError);
            Thread.sleep(5000);
        }

}
