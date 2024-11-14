package demoqa.tests.elements;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class LinksTest extends BaseTest {
  @Test
  public void testLinks() {
    var LinksPage = homePage.goToElements().clickLinks();
    LinksPage.clickBadRequestsLink();
    String actualResponse = LinksPage.getResponse();

    Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
        "\n Actual response does not contain '400' and 'Bad Request'\n");

  }
}
