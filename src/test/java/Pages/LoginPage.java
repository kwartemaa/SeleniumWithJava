package Pages;
import Login.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;
import java.util.*;

public class LoginPage {
    static WebDriver driver;
    static WebElement element = null;
    static String email = "anita.twumasi-ankrah@amalitech.com";
    String password = "123456aA_";

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public static void fillEmailField(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='InputEmail']"));
        element.sendKeys(email);
    }

    public static void fillPasswordField(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='InputPassword1']"));
        element.sendKeys("123456aA_");
    }

    public static void clickSignInButton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@id='signin_button']"));
        element.click();
    }

}
