package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
public class HomePage {
    WebDriver driver;

    public  HomePage(WebDriver driver){
        this.driver=driver;

    }

    public static void navigateToLoginPage(WebDriver driver){
     WebElement element =  driver.findElement(By.xpath("//a[@id='landingpage_login_btn']"));
      element.click();
    }

    public static void addToCartFromHome(WebDriver driver){
        WebElement cartIcon = driver.findElement(By.xpath("//button[@id='cart-button'][1]"));
        cartIcon.click();
    }

    public static void navigateToProductPage(WebDriver driver){
        WebElement productImage = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='product-image'][1]")));
        productImage.click();
//        WebElement productImage = driver.findElement(By.xpath("//img[@id='product-image'][1]"));
//        productImage.click();
    }

    public static void deleteCartItem(WebDriver driver){
//        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='nav-link icon mobile-cart-position']"));
//        cartIcon.click();
        WebElement cartIcon = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link icon mobile-cart-position']")));
        cartIcon.click();
        WebElement viewCart = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'View Cart')]")));
        viewCart.click();
        WebElement deleteOneItem = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Delete']")));
        deleteOneItem.click();
        }
//        driver.findElement(By.xpath("//*[contains(text(), 'View Cart')]")).click();
//        driver.findElement(By.xpath("//div[@title='Delete']")).click();


//    The method below will be moved to some sort of global methods page
    public static void navigateToMarket(WebDriver driver){
        WebElement logo = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='logo']")));
        logo.click();
//        driver.findElement(By.xpath("//img[@alt='logo']")).click();

    }






}
