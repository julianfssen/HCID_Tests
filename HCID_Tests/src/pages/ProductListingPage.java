package pages;

import org.openqa.selenium.By;

public class ProductListingPage {
    //Sticky navigation
    By brandCarousel = By.cssSelector("a[data-vars-cgt*='brand_carousel']");
    By popularityButton = By.cssSelector("a[data-vars-lb='Popularity']");
    By priceButton = By.cssSelector("a[data-vars-lb='Price']");
    By filterButton = By.cssSelector("li[class*='filter-toggle']");

    //Quick filters
    By discountFilter = By.cssSelector("a[data-vars-cgt*='secondary_filter'][data-vars-lb='discount']");
    By ratingFilter = By.cssSelector("a[data-vars-cgt*='secondary_filter'][data-vars-lb='rating']");
    By localFilter = By.cssSelector("a[data-vars-cgt*='secondary_filter'][data-vars-lb='local']");
    By overseasFilter = By.cssSelector("a[data-vars-cgt*='secondary_filter'][data-vars-lb='overseas']");

    //Offer cards
    By comparableProduct = By.cssSelector("a[data-vars-cgt*='comparable_product']");
    By nonComparableProduct = By.cssSelector("a[data-vars-action='shop']");

    By nextPage = By.linkText("Selanjutnya");
    By previousPage = By.cssSelector("i[class*='left-arrow']");
}
