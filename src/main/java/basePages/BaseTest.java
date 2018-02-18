package basePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    protected void setUp(){
        System.out.println("Method setUp");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_profile/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }
    @AfterMethod
    protected void tearDown(){
        System.out.println("Method tearDown");
        webDriver.quit();
    }
}
