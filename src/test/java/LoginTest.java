import constants.Constants;
import constants.ErrorMessages;
import constants.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void logInTest() {
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(driver);
        homePage.scrollToBookstoreCard();
        homePage.clickOnBookstoreCard();
        Utils.waitInSeconds(1);
        super.driver.findElement(By.cssSelector("#login")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fullLogin();
        Utils.waitInSeconds(1);
        String expectedMessage = Constants.EXPECTED_USERNAME_AFTER_LOG_IN;
        String actualMessage = super.driver.findElement(By.cssSelector("#userName-value")).getText();
        Assert.assertEquals(actualMessage, expectedMessage, ErrorMessages.USERNAME_NOT_PRESENT);
    }
}
