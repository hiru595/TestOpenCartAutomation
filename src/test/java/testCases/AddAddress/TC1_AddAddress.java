package testCases.AddAddress;

import baseTest.CommonToAllTests;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import projectPageNames.AddUserAddressPage;
import projectPageNames.AddressBookEntriesPage;
import projectPageNames.LogInPage;
import projectPageNames.UserRegistrationPage;
import utilityFiles.propertiesReader;

public class TC1_AddAddress  extends CommonToAllTests {

    @Test
    @Description //Add Address of User
    public void AddAddressTC1() throws InterruptedException {

        UserRegistrationPage userReg=new UserRegistrationPage(driver);
        LogInPage logInPage=new LogInPage(driver);
        AddressBookEntriesPage addressBookEntriesPage=new AddressBookEntriesPage(driver);
        AddUserAddressPage addUserAddressPage=new AddUserAddressPage(driver);

        userReg.clickAdvancedButton();
        userReg.clickProceedLink();
        userReg.clickMyAccountDropdown();
        Thread.sleep(2000);
        logInPage.clickLogIn();
        Thread.sleep(1000);
        logInPage.enterLogInEmail(propertiesReader.readKey("validLogInUserName"));
        logInPage.enterLogInPassword(propertiesReader.readKey("validLogInpassword"));
        logInPage.clickLogInBtn();
        Thread.sleep(2000);
        addressBookEntriesPage.clickAddressBookLink();
        Thread.sleep(3000);
        addressBookEntriesPage.clickNewAddressButton();
        Thread.sleep(3000);
        addUserAddressPage.enterFname(propertiesReader.readKey("AddAddressFirstName"));
        Thread.sleep(1000);
        addUserAddressPage.enterLname(propertiesReader.readKey("AddAddressLastName"));
        Thread.sleep(1000);
        addUserAddressPage.enterCompanyName(propertiesReader.readKey("AddAddressCompany"));
        Thread.sleep(1000);
        addUserAddressPage.enterAddressLine1(propertiesReader.readKey("AddressLine1"));
        Thread.sleep(1000);
        addUserAddressPage.enterAddressLine2(propertiesReader.readKey("AddressLine2"));
        Thread.sleep(1000);
        addUserAddressPage.Scroll();
        Thread.sleep(3000);
        addUserAddressPage.enterCity(propertiesReader.readKey("AddAddressCity"));
        Thread.sleep(1000);
        addUserAddressPage.enterPostalCode(propertiesReader.readKey("AddAddressPostalCode"));
        Thread.sleep(1000);
        addUserAddressPage.selectCountryName();
        Thread.sleep(1000);
        addUserAddressPage.selectSateName();
        Thread.sleep(1000);
        addUserAddressPage.checkboxDefaultAddressYes();
        Thread.sleep(1000);
        addUserAddressPage.clickContinueBtn();
        Thread.sleep(4000);
    }
}
