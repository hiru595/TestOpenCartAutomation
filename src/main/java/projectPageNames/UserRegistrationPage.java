package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UserRegistrationPage{
   WebDriver driver;

    public UserRegistrationPage(WebDriver driver){
         this.driver=driver;
   }

    //WebElements
    By Advanced_Button=By.id("details-button");
    By Proceed_Link=By.linkText("Proceed to localhost (unsafe)");
    By Dropdown_MyAccount=By.xpath("//span[contains(text(), 'My Account')]");
    By Link_Register=By.linkText("Register");
    By Text_FirstName= By.id("input-firstname");
    By Text_LastName=By.id("input-lastname");
    By Text_EmailId=By.id("input-email");
    By Text_Password=By.id("input-password");
    By Checkbox_NewsLatter_Subscribe=By.id("input-newsletter");
    By CheckBox_AgreeTerms_Cond=By.xpath("//input[@name='agree' and @class='form-check-input']");
    By submitButton=By.xpath("//button[@type='submit']");

    //Error Messages
    By FirstName_ErrorMsg=By.xpath("//div[@id='error-firstname']");
    By LastName_ErrorMsg=By.xpath("//div[@id='error-lastname']");
    By Email_ErrorMsg=By.xpath("//div[@id='error-email']");
    By Password_ErrorMsg=By.xpath("//div[@id='error-password']");
    By PrivacyPolicy_ErrorMessage=By.xpath("//dirv[@class='alert alert-danger alert-dismissible']");
    By EmailIdAlradyRegistred_ErrorMessage=By.xpath("//dirv[@class='alert alert-danger alert-dismissible']");



    public void clickAdvancedButton(){
        driver.findElement(Advanced_Button).click();
    }

    public void clickProceedLink(){
        driver.findElement(Proceed_Link).click();
    }


    public void clickMyAccountDropdown(){
        driver.findElement(Dropdown_MyAccount).click();
    }

    public void clickRegisterLink(){
        driver.findElement(Link_Register).click();
    }

    public void getFirstName(String fname){
        driver.findElement(Text_FirstName).sendKeys(fname);
    }

    public void getLastName(String lname){
        driver.findElement(Text_LastName).sendKeys(lname);
    }

    public void EmailId(String email){
        driver.findElement(Text_EmailId).sendKeys(email);
    }

    public void Password(String password){
        driver.findElement(Text_Password).sendKeys(password);
    }

    public void Scroll(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
    }

    public void Scroll1(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",submitButton);
    }

    public void NewsLatter_Subscribe(){
        driver.findElement(Checkbox_NewsLatter_Subscribe).click();
    }

    public void AgreeTermsnConditions(){
        driver.findElement(CheckBox_AgreeTerms_Cond).click();
    }

    public void clickSubmitBtn(){
        driver.findElement(submitButton).click();
    }

    public String getFirstNameErrorMessage(){
        return driver.findElement(FirstName_ErrorMsg).getText();
    }

    public String getLastNameErrorMessage(){
        return driver.findElement(LastName_ErrorMsg).getText();
    }

    public String getEmailErrorMessage(){
        return driver.findElement(Email_ErrorMsg).getText();
    }

    public String getPasswordErrorMessage(){
        return driver.findElement(Password_ErrorMsg).getText();
    }

    public String getPrivacyPolicyError(){
        return driver.findElement(PrivacyPolicy_ErrorMessage).getText();
    }

    public String getDuplicateEmailError(){
        return driver.findElement(EmailIdAlradyRegistred_ErrorMessage).getText();
    }
}
