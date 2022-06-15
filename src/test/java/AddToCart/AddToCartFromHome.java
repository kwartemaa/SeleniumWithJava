package AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;

public class AddToCartFromHome extends TestBase{

    @Test
    public static void addToCartFromHomePage() throws InterruptedException{
        HomePage.addToCartFromHome(driver);
    }

    @Test
    public static void addToCartFromProductPage() throws InterruptedException{
        HomePage.navigateToProductPage(driver);

    }
}
