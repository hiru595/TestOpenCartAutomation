package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilityFiles.propertiesReader;

import java.time.Duration;

public class CommonToAllTests {
    public WebDriver driver;
    @BeforeMethod
    public void StartBrowser(){
        driver=new EdgeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(propertiesReader.readKey("url"));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
