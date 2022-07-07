package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    static WebDriver driver;
    static WebElement element = null;

    public ProductPage (WebDriver driver){this.driver = driver;}
    public static void addToCartFromProductPage(WebDriver driver){
        WebElement addToCart= new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add to cart')]")));
        addToCart.click();
//        driver.findElement(By.xpath("//a[text()='Okay']")).click();
        }

            }

