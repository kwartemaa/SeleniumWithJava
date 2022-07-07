package AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.LoginPage;

import java.time.Duration;

public class AddToCartFromHome extends TestBase{

    @Test
    public static void addToCartFromHomePage() throws InterruptedException{
        HomePage.addToCartFromHome(driver);
        HomePage.deleteCartItem(driver);
    }

    @Test
    public static void addToCartFromProductPage() throws InterruptedException{
        driver.get(baseUrl);
        HomePage.navigateToProductPage(driver);
        ProductPage.addToCartFromProductPage(driver);
        WebElement okButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Okay']")));
        okButton.click();

    }


}
