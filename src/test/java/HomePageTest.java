import constants.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class HomePageTest extends BaseTest{


    @Test
    public void verifyPageElementsTest() {
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(driver);
        homePage.scrollToBookstoreCard();
        homePage.clickOnBookstoreCard();
        SoftAssert softAssert = new SoftAssert();
        //check if page title is present
        softAssert.assertTrue(homePage.isPageTitlePresent(), "Error 1");
        //check if bookstore subtitle is present
        softAssert.assertFalse(homePage.isSubTitlePresent(), "Error 2");
        softAssert.assertTrue(homePage.isSubTitlePresent(), "Error 3");
        softAssert.assertTrue(homePage.isSubTitlePresent(), "Error 4");
        softAssert.assertAll();
        System.out.println("Hello");

    }


}
