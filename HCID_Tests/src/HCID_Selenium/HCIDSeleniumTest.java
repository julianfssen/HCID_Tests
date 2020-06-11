package HCID_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HCIDSeleniumTest {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://homecredit.iprice.co.id");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sG tc a2")));
        WebElement category = driver.findElementByCssSelector("div[class*='ee']>a[href*='ponsel']");
        category.click();

        WebElement sortByPrice = driver.findElementByCssSelector("a[data-vars-lb='Price'");
        sortByPrice.click();
        WebElement sortByPopularity = driver.findElementByCssSelector("a[data-vars-lb='Popularity'");
        sortByPopularity.click();
        WebElement offer = driver.findElementByCssSelector("a[data-vars-extras='position:1'");
        offer.click();
        driver.navigate().back();
        /*
        int counter = 0;
        while(counter < 2){
            sortByPrice.click();
            //wait.equals(2);
            counter++;
        }
         */
    }
}
