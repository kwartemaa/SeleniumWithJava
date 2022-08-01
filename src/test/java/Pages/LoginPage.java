package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    static WebDriver driver;
    static WebElement element = null;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public static void fillEmailField(WebDriver driver, String email){
        element = driver.findElement(By.xpath("//input[@id='InputEmail']"));
        element.sendKeys(email);
    }

    public static void fillPasswordField(WebDriver driver, String password){
        element = driver.findElement(By.xpath("//input[@id='InputPassword1']"));
        element.sendKeys(password);
    }

    public static void clickSignInButton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@id='signin_button']"));
        element.click();
    }
}
