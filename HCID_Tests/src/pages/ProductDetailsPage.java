package pages;

import org.openqa.selenium.By;

public class ProductDetailsPage {
    By showSpecs = By.linkText("Speks Lainnya");

    By stickyNavigationOffers = By.linkText("Bandingkan Harga");
    By stickyNavigationSpecs = By.linkText("Spesifikasi");
    By stickyNavigationRelatedProducts = By.linkText("Produk Serupa");

    By buyNow = By.linkText("Beli Sekarang");
    By goToMerchant = By.linkText("Kunjungi Toko");
    By showMoreOffers = By.cssSelector("[id$=showMore]");

    By relatedProducts = By.cssSelector("a[data-vars-extras='position:0']");
}
