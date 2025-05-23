package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUserAddressPage{
    WebDriver driver;

    public AddUserAddressPage(WebDriver driver){
        this.driver=driver;
    }

    By Textbox_Fname=By.xpath("//input[@id='input-firstname']");
    By Textbox_Lname=By.xpath("//input[@id='input-lastname']");
    By Textbox_Company=By.xpath("//input[@id='input-company']");
    By Textbox_AddressLine1=By.xpath("//input[@id='input-address-1']");
    By Textbox_AddressLine2=By.xpath("//input[@id='input-address-2']");
    By Textbox_City=By.xpath("//input[@id='input-city']");
    By Textbox_PostCode=By.xpath("//input[@id='input-postcode']");
    By PickList_CountryName=By.xpath("//select[@id='input-country']");
    By PickList_RegionState=By.xpath("//select[@id='input-zone']");
    By Checkbox_DefaultAddress_Yes=By.xpath("//input[@id='input-default-yes']");
    By Checkbox_DefaultAddress_No=By.xpath("//input[@id='input-default-no']");
    By Continue_Button=By.xpath("//button[@type='submit' and @class='btn btn-primary']");
    By Back_Button=By.xpath("//a[@class='btn btn-light']");
    By Validation_BlankFirstName=By.xpath("//div[@id='error-firstname']");
    By Validation_BlankLastName=By.xpath("//div[@id='error-lastname']");
    By Validation_BlankAddressLine1=By.xpath("//div[@id='error-address-1']");
    By Validation_BlankCity=By.xpath("//div[@id='error-city']");
    By Validation_BlankPostalCode=By.xpath("//div[@id='error-postcode']");
    By Validation_BlankState=By.xpath("//div[@id='error-zone']");

    public void enterFname(String firstName){
        driver.findElement(Textbox_Fname).sendKeys(firstName);
    }

    public void enterLname(String lastName){
        driver.findElement(Textbox_Lname).sendKeys(lastName);
    }

    public void enterCompanyName(String company){
        driver.findElement(Textbox_Company).sendKeys(company);
    }

    public void enterAddressLine1(String address1){
        driver.findElement(Textbox_AddressLine1).sendKeys(address1);
    }

    public void enterAddressLine2(String address2){
        driver.findElement(Textbox_AddressLine2).sendKeys(address2);
    }

    public void enterCity(String cityname){
        driver.findElement(Textbox_City).sendKeys(cityname);
    }

    public void enterPostalCode(String postalCode){
        driver.findElement(Textbox_PostCode).sendKeys(postalCode);
    }

    public void selectCountryName(){
        Select se=new Select(driver.findElement(PickList_CountryName));
        se.selectByValue("99");
    }

    public void selectSateName(){
        Select se1=new Select(driver.findElement(PickList_RegionState));
        se1.selectByVisibleText("Karnataka");
    }

    public void checkboxDefaultAddressYes(){
        driver.findElement(Checkbox_DefaultAddress_Yes).click();
    }

    public void checkboxDefaultAddressNo(){
        driver.findElement(Checkbox_DefaultAddress_No).click();
    }

    public void clickContinueBtn(){
        driver.findElement(Continue_Button).click();
    }

    public void clickBackBtn(){
        driver.findElement(Back_Button).click();
    }

    public void Scroll(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000);");
    }

    public String getBlankFirstNameMessage(){
        return driver.findElement(Validation_BlankFirstName).getText();
    }

    public String getBlankLastNameMessage(){
        return driver.findElement(Validation_BlankLastName).getText();
    }

    public String getBlankAddressLine1Message(){
        return driver.findElement(Validation_BlankAddressLine1).getText();
    }

    public String getBlankCityMessage(){
        return driver.findElement(Validation_BlankCity).getText();
    }

    public String getBlankPostalCodeMessage(){
        return driver.findElement(Validation_BlankPostalCode).getText();
    }

    public String getBlankStateMessage(){
        return driver.findElement(Validation_BlankState).getText();
    }
}
