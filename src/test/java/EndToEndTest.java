import constants.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BookStorePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

import javax.swing.*;


public class EndToEndTest extends BaseTest {

    @Test
    public void endToEndTest() {
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(driver);
        homePage.scrollToBookstoreCard();
        homePage.clickOnBookstoreCard();
        Utils.waitInSeconds(1);
        super.driver.findElement(By.cssSelector("#login")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fullLogin();
        Utils.waitInSeconds(2);
        loginPage.clickOnFirstBook();
        Utils.waitInSeconds(2);
        BookStorePage bookStorePage = new BookStorePage(driver);
        bookStorePage.scrollToAddToCollection();
        bookStorePage.clickAddToCollection();
        Utils.waitInSeconds(2);
        Utils.acceptAlert(driver);
        bookStorePage.clickBackToBookStore();
        loginPage.clickOnSecondBook();
        bookStorePage.scrollToAddToCollection();
        bookStorePage.clickAddToCollection();
        Utils.waitInSeconds(2);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.RETURN).keyUp(Keys.RETURN).build().perform();
        Utils.acceptAlert(driver);
        bookStorePage.clickBackToBookStore();
        loginPage.clickOnThirdBook();
        bookStorePage.scrollToAddToCollection();
        bookStorePage.clickAddToCollection();
        Utils.waitInSeconds(2);
        Utils.acceptAlert(driver);
        Utils.waitInSeconds(2);
        bookStorePage.clickOnProfile();
        Utils.waitInSeconds(2);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickDeleteButtonForFirstBook();
        Utils.waitInSeconds(1);
        profilePage.clickOkDelete();
        Utils.waitInSeconds(1);
        Utils.acceptAlert(driver);
        Utils.waitInSeconds(1);
        profilePage.clickLogout();

    }


}
