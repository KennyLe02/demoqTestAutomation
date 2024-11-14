package demoqa.tests.elements;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

  @Test
  public void testWebTable() {
    var webTablePage = homePage.goToElements().clickWebTables();
    webTablePage.clickEdit("alden@example.com");
    webTablePage.setAge("34");
    webTablePage.clickSubmitButton();

    String actualAge = webTablePage.getTableAge("alden@example.com");
    String expectedAge = "34";
    Assert.assertEquals(actualAge, expectedAge, "\n Actual and expected ages do not match\n");
  }
}
