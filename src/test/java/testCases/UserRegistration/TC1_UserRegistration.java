package testCases.UserRegistration;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;


public class TC1_UserRegistration extends CommonToAllTests {

    @Test
    @Description //This is positive scenario of user registration.
    public void UserRegTC_1() throws InterruptedException {

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
        userReg.EmailId(propertiesReader.readKey("validEmail"));
        userReg.Password(propertiesReader.readKey("validPassword"));

        Thread.sleep(5000);
        userReg.Scroll();
        Thread.sleep(5000);
        userReg.NewsLatter_Subscribe();
        Thread.sleep(5000);
        userReg.AgreeTermsnConditions();
        Thread.sleep(5000);
        userReg.clickSubmitBtn();

        Thread.sleep(15000);
    }
}
