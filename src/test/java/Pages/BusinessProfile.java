package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusinessProfile {
    WebDriver driver;

    public BusinessProfile(WebDriver driver){
        this.driver = driver ;
    }
    public static void logoutBusinessUser(WebDriver driver){
        driver.findElement(By.xpath("//i[@class='fe fe-chevron-down']")).click();
        driver.findElement(By.xpath("//i[@class='dropdown-icon fe fe-power']")).click();

            }
}
