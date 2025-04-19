package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegistrationPage {
    WebDriver driver;

    public UserRegistrationPage(WebDriver driver){
        this.driver=driver;
    }

    By Dropdown_MyAccount=By.xpath("//a[@class='dropdown-toggle show']");
    By Link_Register=By.linkText("Register");
    By Text_FirstName= By.id("input-firstname");
    By Text_LastName=By.id("input-lastname");
    By Text_EmailId=By.id("input-email");
    By Text_Password=By.id("input-password");
    By Checkbox_NewsLatter_Subscribe=By.id("input-newsletter");
    By CheckBox_AgreeTerms_Cond=By.xpath("//input[@name='agree' and @class='form-check-input']");
    By submitButton=By.xpath("//button[@type='submit']");

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

    public void NewsLatter_Subscribe(){
        driver.findElement(Checkbox_NewsLatter_Subscribe).click();
    }

    public void AgreeTermsnConditions(){
        driver.findElement(CheckBox_AgreeTerms_Cond).click();
    }

    public void clickSubmitBtn(){
        driver.findElement(submitButton).click();
    }
}
