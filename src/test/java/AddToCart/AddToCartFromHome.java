package AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.CartPage;

import java.time.Duration;

public class AddToCartFromHome extends TestBase{
    @Test
    public static void addToCartFromHomePage() throws InterruptedException{
        HomePage.addToCartFromHome(driver);
        WebElement cartQuantity = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='nav-unread badge badge-danger']")));
        Assert.assertTrue(cartQuantity.isDisplayed());
        HomePage.viewShoppingCart(driver);
        CartPage.deleteProduct(driver);
    }


    @Test
    public static void addToCartFromProductPage() throws InterruptedException{
        HomePage.navigateToProductPage(driver);
        ProductPage.addToCartFromProductPage(driver);
        WebElement okButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Okay']")));
        okButton.click();
        WebElement cartQuantity = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='nav-unread badge badge-danger']")));
        Assert.assertTrue(cartQuantity.isDisplayed());

    }



}
