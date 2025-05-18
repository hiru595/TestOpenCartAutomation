package testCases.AddAddress;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectPageNames.AddUserAddressPage;
import projectPageNames.AddressBookEntriesPage;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC2_AddAddress extends CommonToAllTests {

    @Test
    @Description //All fields are blank and user click on Continue button
    public void AddAddressTC2() throws InterruptedException {
        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);
        AddressBookEntriesPage addressBookEntriesPage=new AddressBookEntriesPage(driver);
        AddUserAddressPage addUserAddressPage=new AddUserAddressPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        userReg.clickMyAccountDropdown();
        Thread.sleep(1000);
        logInPage.clickLogIn();
        Thread.sleep(2000);
        logInPage.enterLogInEmail(propertiesReader.readKey("validLogInUserName"));
        logInPage.enterLogInPassword(propertiesReader.readKey("validLogInpassword"));
        logInPage.clickLogInBtn();
        Thread.sleep(2000);
        addressBookEntriesPage.clickAddressBookLink();
        Thread.sleep(2000);
        addressBookEntriesPage.clickNewAddressButton();
        Thread.sleep(3000);
        addUserAddressPage.Scroll();
        Thread.sleep(5000);
        addUserAddressPage.clickContinueBtn();
        Thread.sleep(5000);
        String AddressFirstNameBlankMessage= addUserAddressPage.getBlankFirstNameMessage();
        Assert.assertEquals(propertiesReader.readKey("AddAddressBlankFirestName"),AddressFirstNameBlankMessage);

        String AddressLastNameBlankMessage= addUserAddressPage.getBlankLastNameMessage();
        Assert.assertEquals(propertiesReader.readKey("AddAddressBlankLastName"),AddressLastNameBlankMessage);

        String Address1BlankMessage= addUserAddressPage.getBlankAddressLine1Message();
        Assert.assertEquals(propertiesReader.readKey("BlankAddressLine1"),Address1BlankMessage);

        String AddressCityBlankMessage= addUserAddressPage.getBlankCityMessage();
        Assert.assertEquals(propertiesReader.readKey("AddAddressBlankCity"),AddressCityBlankMessage);

        String AddressPostalCodeBlankMessage= addUserAddressPage.getBlankPostalCodeMessage();
        Assert.assertEquals(propertiesReader.readKey("AddAddressBlankPostalCode"),AddressPostalCodeBlankMessage);

        String AddressStateBlankMessage= addUserAddressPage.getBlankStateMessage();
        Assert.assertEquals(propertiesReader.readKey("AddAddressBlankState"),AddressStateBlankMessage);

        Thread.sleep(5000);

        addUserAddressPage.clickBackBtn();
        Thread.sleep(10000);
    }
}
