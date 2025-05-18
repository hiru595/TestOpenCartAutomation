package testCases.UserRegistration;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;



public class TC2_UserRegistration extends CommonToAllTests {

    @Test
    @Description //When all fields are blank.
    public void UserRegTC_2() throws InterruptedException {

        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        Thread.sleep(5000);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();

        Thread.sleep(5000);
        userReg.clickMyAccountDropdown();
        Thread.sleep(5000);
        userReg.clickRegisterLink();
        Thread.sleep(5000);

        userReg.Scroll();
        //userReg.Scroll1();
        Thread.sleep(5000);
        userReg.clickSubmitBtn();
        Thread.sleep(5000);

        String FirstNameErrorMsg= userReg.getFirstNameErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("BlankFirstNameMessage"),FirstNameErrorMsg);

        String LastNameErrorMsg= userReg.getLastNameErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("BlankLastNameMessage"),LastNameErrorMsg);

        String EmailErrorMsg= userReg.getEmailErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("BlankEmailMessage"),EmailErrorMsg);

        String PasswordErrorMsg= userReg.getPasswordErrorMessage();
        Assert.assertEquals(propertiesReader.readKey("BlankPasswordMessage"),PasswordErrorMsg);

        String PrivacyErrorMsg=userReg.getPrivacyPolicyError();
        Assert.assertEquals(propertiesReader.readKey("PricevacyPolicyMessage"),PrivacyErrorMsg);

        Thread.sleep(15000);
    }
}
