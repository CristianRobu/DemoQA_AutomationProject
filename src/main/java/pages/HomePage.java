package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//*[@class='card-up'])[6]")
    WebElement bookStoreCard;

    @FindBy(css = ".rt-tr-group")
    List<WebElement> booksList;

    public void printAllBooks() {
        for (WebElement element : booksList) {
            if (!element.getText().isBlank()) {
                System.out.println(element.getText());
                System.out.println("------------");
            }
        }
    }

    public void scrollToBookstoreCard() {
        scrollToElement(bookStoreCard);
    }

    public void clickOnBookstoreCard() {
        clickElement(bookStoreCard);
    }
}
