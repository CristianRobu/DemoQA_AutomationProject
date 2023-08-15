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

    @FindBy(xpath = "//div[@class='action-buttons']")
    List<WebElement> booksTitle;
    @FindBy(xpath = "//div[@class='rt-td']")
    List<WebElement> booksRows;


         public void printAllBooks() {
        for (WebElement element : booksList) {
            if (!element.getText().isBlank()) {
                System.out.println(element.getText());
                System.out.println("------------");
            }
        }
    }

    public void getAllBooksTitle() {
        for (WebElement element : booksTitle) {
            if (!element.getText().isBlank()) {
                System.out.println(element.getText());
                System.out.println("------------");
            }
        }
    }

    public void getBooksAuthors() {
        for (int i = 2; i<= booksRows.size() ; i+=4) {
            if (!booksRows.get(i).getText().isBlank()) {
                System.out.println(booksRows.get(i).getText());
                System.out.println("----------------");
            }
        }

    }   public void getBooksPublishers() {
        for (int i = 3; i<= booksRows.size() ; i+=4) {
            if (!booksRows.get(i).getText().isBlank()) {
                System.out.println(booksRows.get(i).getText());
                System.out.println("----------------");
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
