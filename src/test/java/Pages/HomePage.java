package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        WebElement productCard = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='product-row']>div[id='product-card-div']:nth-child(4)>:nth-child(2)")));
        productCard.click();

    }

    public static void viewShoppingCart(WebDriver driver){
        WebElement cartIcon = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link icon mobile-cart-position']")));
        cartIcon.click();
        WebElement viewCart = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'View Cart')]")));
        viewCart.click();
    }

    public static void filterByCategory(WebDriver driver){
        WebElement categorySelector = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='filtersrow']>:first-child>:first-child>:first-child")));
        Select select = new Select(categorySelector);
        select.selectByVisibleText("Books and Office Supplies");
    }

}
