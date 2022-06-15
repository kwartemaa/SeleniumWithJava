package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        WebElement productImage = driver.findElement(By.xpath("//img[@id='product-image'][1]"));
        productImage.click();
    }






}
