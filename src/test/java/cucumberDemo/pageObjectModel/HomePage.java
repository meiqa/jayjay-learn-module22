package cucumberDemo.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {

    WebDriver driver;

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateRedirectedToTheHomepage(){
        WebElement productTitleElement = driver.findElement(productTitle);
        assertTrue(productTitleElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productTitleElement.getText());
    }


}
