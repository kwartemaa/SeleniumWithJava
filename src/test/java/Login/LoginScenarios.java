package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;

public class LoginScenarios extends TestBase {
    static String email = "anita.twumasi-ankrah@amalitech.com";
    static String password = "123456aA_";


    @Test
    public void successfulLogin () throws InterruptedException {
HomePage.navigateToLoginPage(driver);

//      driver.findElement(By.xpath("//a[@id='landingpage_login_btn']")).click();
//        driver.findElement(By.xpath("//input[@id='InputEmail']")).sendKeys(email);
//        driver.findElement(By.xpath("//input[@id='InputPassword1']")).sendKeys(password);
//        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
//        String businessLanding = driver.getCurrentUrl();
//        String expectedBusinessLanding = "https://ghmade.com/businessprofile";
//        Assert.assertEquals(businessLanding,expectedBusinessLanding);


    }

}
