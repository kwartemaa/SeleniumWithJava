package AddToCart;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import Pages.HomePage;



public class TestBase {
    public static String browser = "chrome";
    public static WebDriver driver;
    static String baseUrl ="https://ghmade.com/market";

    //Runs before tests
    @BeforeTest
    public void navigateToHomePage(){
        switch (browser) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

//    @BeforeMethod
//    public void goToMarketPlace(){
////        HomePage.navigateToMarket(driver);
//        driver.get(baseUrl);
//    }

    @AfterTest
    public void quitTest(){
        driver.quit();
    }

    @AfterMethod
    public void navigateToMarket(){
        driver.get(baseUrl);
    }
}
