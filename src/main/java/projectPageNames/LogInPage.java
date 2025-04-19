package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver=driver;
    }

    By Dropdown_MyAccount=By.xpath("//a[@class='dropdown-toggle show']");
    By Link_LogIn=By.linkText("Login");
    By Text_LogInEmail=By.xpath("//input[@name='email' or id='input-email']");
    By Text_LogInPassword=By.xpath("//input[@name='password' or id='input-password']");
    By Button_LogIn=By.xpath("//button[@type='submit']");

    public void clickMyAccountDropdown(){
        driver.findElement(Dropdown_MyAccount).click();
    }

    public void clickLogIn(){
        driver.findElement(Link_LogIn).click();
    }

    public void enterLogInEmail(String emailLogIn){
        driver.findElement(Text_LogInEmail).sendKeys(emailLogIn);
    }

    public void enterLogInPassword(String emailPassword){
        driver.findElement(Text_LogInPassword).sendKeys(emailPassword);
    }

    public void clickLogInBtn(){
        driver.findElement(Button_LogIn).click();
    }

}
