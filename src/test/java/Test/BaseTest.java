package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com/");

    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}