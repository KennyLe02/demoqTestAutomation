package demoqa.tests.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {
  @Test
  public void testApplicationUsingKeyboard() {
    var textBoxPage = homePage.goToElements().clickTextBox();
    textBoxPage.setFullName("Kenny Le");
    textBoxPage.setEmail("kle104@wgu.edu");
    textBoxPage.setCurrentAddress("123 Selenium Avenue");
    textBoxPage.setCurrentAddress("Suite 3400");
    textBoxPage.setCurrentAddress("Dallas, Texas");
    textBoxPage.clickSubmitButton();
    String actualAddress = textBoxPage.getCurrentAddress();
    Assert.assertTrue(actualAddress.contains("Suite 3400"), "\nActual address does not contain Suite 3400\n");

  }

}
