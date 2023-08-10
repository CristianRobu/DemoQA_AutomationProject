import constants.Utils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class BooksTest extends BaseTest {

    @Test
    public void verifyBooksListTest() {
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(driver);
        homePage.scrollToBookstoreCard();
        homePage.clickOnBookstoreCard();
        Utils.waitInSeconds(1);
        super.driver.findElement(By.cssSelector("#login")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fullLogin();
        Utils.waitInSeconds(1);
        homePage.printAllBooks();
    }
}

