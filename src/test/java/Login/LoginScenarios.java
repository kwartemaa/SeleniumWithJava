package Login;
import Pages.BusinessProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;

import java.time.Duration;

public class LoginScenarios extends TestBase {
    static String validEmail = "anita.twumasi-ankrah@amalitech.com";
    static String validPassword = "123456aA_";
    static String invalidEmail = "anita.twumasi";
    static String invalidPassword = "11111111111";


    @Test
    public void successfulLogin () throws InterruptedException {
        HomePage.navigateToLoginPage(driver);
        LoginPage.fillEmailField(driver, validEmail);
        LoginPage.fillPasswordField(driver, validPassword);
        LoginPage.clickSignInButton(driver);
        WebElement editButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-primary btn-block editbtn']")));
        assert editButton.isDisplayed();
        BusinessProfile.logoutBusinessUser(driver);

    }

    @Test
    public void failedLogin () throws InterruptedException{
        HomePage.navigateToLoginPage(driver);
        LoginPage.fillEmailField(driver, invalidEmail);
        LoginPage.fillPasswordField(driver, invalidPassword);
        LoginPage.clickSignInButton(driver);
        WebElement failedLoginPrompt = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'No active account found with the given credentials')]")));
        assert failedLoginPrompt.isDisplayed();

    }
}

