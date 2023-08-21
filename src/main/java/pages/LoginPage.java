package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#userName")
    WebElement usernameField;

    @FindBy(css = "#login")
    WebElement loginField;

    @FindBy(xpath = "//*[contains(text(), 'Git Pocket Guide')]")
    WebElement firstBook;
    @FindBy(xpath = "//*[contains(text(), 'Learning JavaScript Design Patterns')]")
    WebElement secondBook;
    @FindBy(xpath = "//*[contains(text(), 'Designing Evolvable Web APIs with ASP.NET')]")
    WebElement thirdBook;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fullLogin() {
        inputText(usernameField, Constants.USERNAME);
        super.driver.findElement(By.cssSelector("#password")).sendKeys(Constants.PASSWORD);
        super.driver.findElement(By.cssSelector("#login")).click();
    }


    public void clickOnFirstBook() {
        clickElement(firstBook);
    }

    public void clickOnSecondBook() {
        clickElement(secondBook);
    }

    public void clickOnThirdBook() {
        clickElement(thirdBook);
    }

}
