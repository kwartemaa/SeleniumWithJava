package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;
public class HomePage {

    public static void navigateToLoginPage(WebDriver driver){
     WebElement element =  driver.findElement(By.xpath("//a[@id='landingpage_login_btn']"));
      element.click();
    }


}
