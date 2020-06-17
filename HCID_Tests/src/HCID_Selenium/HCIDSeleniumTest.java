package HCID_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Random;

public class HCIDSeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://homecredit-id.iprice.mx");

        long start = System.nanoTime();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sG tc a2")));
        WebElement category = driver.findElementByCssSelector("div[class*='ee']>a[href*='ponsel']");
        category.click();

        WebElement sortByPrice = driver.findElementByCssSelector("a[data-vars-lb='Price'");
        sortByPrice.click();

        WebElement sortByPopularity = driver.findElementByCssSelector("a[data-vars-lb='Popularity'");
        sortByPopularity.click();

        WebElement pagination = driver.findElementById("pagination");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", pagination);

        WebElement nextPage = driver.findElementByLinkText("Selanjutnya");
        nextPage.click();

        WebElement goBack = driver.findElementByCssSelector("a[data-vars-lb='0']");
        goBack.click();

        Random rand = new Random();
        int position = rand.nextInt(6);

        WebElement brandCarousel = driver.findElementByCssSelector("a[data-vars-lb*='position:" + position + "']");
        brandCarousel.click();

        WebElement filter = driver.findElementByCssSelector("li[class*='filter-toggle']");
        filter.click();

        WebElement brandFilter = driver.findElementByCssSelector("a[data-vars-cgt*='filter']");
        //brandFilter.click();
        js.executeScript("arguments[0].click()", brandFilter);

        WebElement storeFilter = driver.findElementByCssSelector("label[for='toggle-filter']");
        //storeFilter.click();
        js.executeScript("arguments[0].click()", storeFilter);

        WebElement filter_next = driver.findElementByCssSelector("li[class*='filter-toggle']");
        filter_next.click();
/*        WebElement minPrice = driver.findElementById("price-min");
        minPrice.sendKeys("1");*/

        WebElement searchByPrice = driver.findElementByCssSelector("button[type='submit']");
        js.executeScript("arguments[0].click()", searchByPrice);

        WebElement showFilterResults = driver.findElementById("bottom-button");
        js.executeScript("arguments[0].click()", showFilterResults);

        WebElement offer = driver.findElementByCssSelector("a[data-vars-extras='position:1'");
        js.executeScript("arguments[0].click()", offer);

        WebElement recommendedCheckout = driver.findElementByCssSelector("a[data-vars-action='pc-recommended-checkout']");
        recommendedCheckout.click();
        driver.navigate().back();

        WebElement cheapestCheckout = driver.findElementByCssSelector("a[data-vars-action='pc-cheapest']");
        cheapestCheckout.click();
        driver.navigate().back();

        WebElement normalCheckout = driver.findElementByCssSelector("a[data-vars-action='pc']");
        normalCheckout.click();
        driver.navigate().back();

        WebElement moreOffers = driver.findElementByCssSelector("div[data-vars-cgt='click_store_more_offers']");
        moreOffers.click();

        WebElement productSpecs = driver.findElementById("section-related-product-section");
        productSpecs.click();

        WebElement relatedProducts = driver.findElementById("section-related-product-section");
        js.executeScript("arguments[0].scrollIntoView(true)", relatedProducts);

        WebElement relatedOfferCard = driver.findElementByCssSelector("a[data-vars-extras='position:1']");
        relatedOfferCard.click();

        WebElement offerShortcut = driver.findElementByCssSelector("a[data-vars-cgt='click_shortcut_harga']");
        offerShortcut.click();

        WebElement specsShortcut = driver.findElementByCssSelector("a[data-vars-cgt='click_shortcut_speks']");
        specsShortcut.click();

        WebElement relatedProductsShortcut = driver.findElementByCssSelector("a[data-vars-cgt='click_shortcut_produk_serupa']");
        relatedProductsShortcut.click();

        WebElement backToTop = driver.findElementByCssSelector("i[data-vars-lb='Go to top']");
        backToTop.click();

        driver.get("https://homecredit-id.iprice.mx/search/?term=playstation+4");

        WebElement sortByPriceVS = driver.findElementByCssSelector("a[data-vars-lb='Price'");
        sortByPriceVS.click();

        WebElement sortByPopularityVS = driver.findElementByCssSelector("a[data-vars-lb='Popularity'");
        sortByPopularityVS.click();

        WebElement sortByRelevanceVS = driver.findElementByCssSelector("a[data-vars-lb='Popularity'");
        sortByRelevanceVS.click();

        WebElement quickFilter = driver.findElementByCssSelector("a[data-vars-cgt*='quick_filter']");
        quickFilter.click();

        System.out.println("Test passed.");
        long finish = System.nanoTime();
        double testTimeInSeconds = (double)((finish - start) / 1_000_000_000.0);
        System.out.println("HCID Test finished in: " + testTimeInSeconds);
    }
}
