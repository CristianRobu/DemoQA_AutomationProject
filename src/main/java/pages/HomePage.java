package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//*[@class='card-up'])[6]")
    WebElement bookStoreCard;

    public void scrollToBookstoreCard() {
        scrollToElement(bookStoreCard);
    }

    public void clickOnBookstoreCard() {
        clickElement(bookStoreCard);
    }
}
