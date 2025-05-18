package projectPageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressBookEntriesPage {
    WebDriver driver;

    public AddressBookEntriesPage(WebDriver driver){
        this.driver=driver;
    }

    By Link_AddressBook= By.xpath("//a[contains(text(),'Address Book')]");
    By Link_NewAddress=By.xpath("//a[contains(text(),'New Address')]");
    By LinkButton_Back=By.xpath("//a[contains(text(),'Back')]");

    public void clickAddressBookLink(){
        driver.findElement(Link_AddressBook).click();
    }

    public void clickNewAddressButton(){
        driver.findElement(Link_NewAddress).click();
    }

    public void clickBackButton(){
        driver.findElement(LinkButton_Back).click();
    }
}
