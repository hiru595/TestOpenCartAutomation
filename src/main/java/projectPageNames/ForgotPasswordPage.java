package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    By Dropdown_MyAccount=By.xpath("//a[@class='dropdown-toggle show']");
    By Link_LogIn=By.linkText("Login");
    By Link_ForgotPassword=By.linkText("Forgotten Password");
    By ForgotPassword_Email=By.linkText("//input[@name='email' or @id='input-email']");
    By Button_Continue=By.xpath("//button[@type='submit' or class='btn btn-primary']");
    By Button_Back=By.linkText("Back");

    public void clickMyAccountDropdown(){
        driver.findElement(Dropdown_MyAccount).click();
    }

    public void clickLogIn(){
        driver.findElement(Link_LogIn).click();
    }

    public void clickForgotPassword(){
        driver.findElement(Link_ForgotPassword).click();
    }

    public void enterForgotPwEmail(String forgotPasswordpemail){
        driver.findElement(ForgotPassword_Email).sendKeys(forgotPasswordpemail);
    }

    public void clickContinueBtn(){
        driver.findElement(Button_Continue).click();
    }

    public void clickBackBtn(){
        driver.findElement(Button_Back).click();
    }

}
