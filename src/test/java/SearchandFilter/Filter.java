package SearchandFilter;
import Pages.BusinessProfile;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import Pages.HomePage;

import java.time.Duration;

public class Filter extends  TestBase {
    @Test
    public void selectCategory () throws InterruptedException {
       HomePage.filterByCategory(driver);
    }



}
