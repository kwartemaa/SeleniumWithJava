package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginScenarios {
    public static String browser = "chrome";
    public static WebDriver driver;
    static String email = "anita.twumasi-ankrah@amalitech.com";
    static String password = "123456aA_";
    static String baseUrl ="https://ghmade.com/market";

    @BeforeMethod
    public void navigateToHomePage() throws InterruptedException {
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


    }

    @Test
    public void successfulLogin (){
        driver.findElement(By.xpath("//a[@id='landingpage_login_btn']")).click();
        driver.findElement(By.xpath("//input[@id='InputEmail']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='InputPassword1']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();


    }

}
