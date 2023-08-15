import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setup() {
        this.driver = new EdgeDriver();
        this.driver.get(Constants.URL);
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeDriver() {
        this.driver.close();
    }

    @Test
    public void goToWebsiteTest() {
        this.driver.get(Constants.URL);
    }

}
