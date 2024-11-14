package demoqa.tests.windows;

import static utilities.GetUtility.getURL;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class WindowsTest extends BaseTest {
  @Test
  public void testNewWindowURL() {
    var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
    windowsPage.clickNewWindowButton();
    windowsPage.switchToNewWindow();
    String actualURL = getURL();
    String expectedURL = "https://demoqa.com/sample";
    Assert.assertEquals(actualURL, expectedURL, "\n Actual and expected URLs do not match\n");

  }
}
