package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//*[@id='delete-record-undefined'])[1]")
    WebElement deleteButtonForFirstBook;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[6]")
    WebElement okDelete;
    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    WebElement profileLogOut;

    public void clickDeleteButtonForFirstBook() {
        clickElement(deleteButtonForFirstBook);
    }

    public void clickOkDelete() {
        clickElement(okDelete);
    }
    public void clickLogout() {
        clickElement(profileLogOut);
    }



}
