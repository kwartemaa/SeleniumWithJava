package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    static WebDriver driver;
    static WebElement element = null;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public static void deleteProduct(WebDriver driver){
        WebElement deleteOneItem = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Delete']")));
        deleteOneItem.click();
    }

}
