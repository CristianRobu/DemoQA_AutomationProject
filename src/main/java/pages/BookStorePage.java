package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage extends BasePage{
    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    WebElement addToCollection;
    @FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
    WebElement backToBookStore;
    @FindBy(xpath = "//*[contains(text(),'Profile')]")
    WebElement profile;

    public void clickAddToCollection() {
        clickElement(addToCollection);
    }
    public void clickBackToBookStore() {
        clickElement(backToBookStore);
    }
    public void scrollToAddToCollection() {
        scrollToElement(addToCollection);
    }

    public void clickOnProfile() {
        clickElement(profile);
    }
}
