package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;


public class Login {
    public static String browser = "chrome";
    public static WebDriver driver;
    static String email = "anita.twumasi-ankrah@amalitech.com";
    static String password = "123456aA_";
    public static void main(String[] args) throws InterruptedException {
        if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
        }
        driver.get("https://ghmade.com/market");
        driver.findElement(By.xpath("//a[@id='landingpage_login_btn']")).click();
        driver.findElement(By.xpath("//input[@id='InputEmail']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='InputPassword1']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        driver.wait();
        String businessLanding = driver.getCurrentUrl();
        String expectedBusinessLanding = "https://ghmade.com/businessprofile";
        Assert.assertEquals(businessLanding,expectedBusinessLanding);

    }
}