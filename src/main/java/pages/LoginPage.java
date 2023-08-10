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

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fullLogin() {
        inputText(usernameField, Constants.USERNAME);
        super.driver.findElement(By.cssSelector("#password")).sendKeys(Constants.PASSWORD);
        super.driver.findElement(By.cssSelector("#login")).click();
    }
}
