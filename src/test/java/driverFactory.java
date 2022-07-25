import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class driverFactory {

    public static WebDriverWait wait;
    public static WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\baris\\IdeaProjects\\HepsiBurada_TestCase1_WebAutomation\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);

        // Step 1: Web sitesi açılır.
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterTest
    public void closeWebDriver(){
        driver.quit();
    }

}
