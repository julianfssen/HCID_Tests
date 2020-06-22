package interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Interactions {
    WebDriver driver;

    public void click(By element){
        WebElement e = driver.findElement(element);
        e.click();
    }

    public void input(By element, String input){
        WebElement e = driver.findElement(element);
        e.sendKeys(input);
    }
}
