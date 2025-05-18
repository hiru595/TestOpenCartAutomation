package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateAccountPage{

    WebDriver driver;

    UpdateAccountPage(WebDriver driver){
        this.driver=driver;
    }

    By Textbox_FirstName=By.xpath("//input[@id='input-firstname']");
    By Textbox_LatName=By.xpath("//input[@id='input-lastname']");
    By Textbox_Email=By.xpath("//input[@id='input-email']");
    By Continue_Btn=By.xpath("//button[@type='submit' and @class='btn btn-primary']");
    By Back_Btn=By.xpath("//a[@class='btn btn-light']");

}
