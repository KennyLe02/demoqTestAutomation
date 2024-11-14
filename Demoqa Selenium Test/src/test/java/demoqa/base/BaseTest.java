package demoqa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.base.BasePage;
import com.demoqa.pages.HomePage;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {
  private WebDriver driver;
  protected BasePage basePage;
  protected HomePage homePage;

  private String demoUrl = "https://demoqa.com/";

  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize(); // to make window bigger
  }

  @BeforeMethod
  public void loadApplication() {
    driver.get(demoUrl);
    basePage = new BasePage();
    basePage.setDriver(driver);
    setUtilityDriver();
    // every test must go through the home page, so we need to create an instance
    homePage = new HomePage();
  }

  @AfterClass
  public void tearDown() {
    delay(3000); // delaying before quitting to see the process. on the job, we do not do this
    driver.quit();
  }

}
