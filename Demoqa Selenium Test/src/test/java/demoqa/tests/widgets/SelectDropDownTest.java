package demoqa.tests.widgets;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class SelectDropDownTest extends BaseTest {
  @Test
  public void testMultiSelectDropDowns() {
    var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
    selectMenuPage.selectStandardMulti("Volvo");
    selectMenuPage.selectStandardMulti(1);

    selectMenuPage.selectStandardMulti("Audi");
    selectMenuPage.selectStandardMulti(2);

    selectMenuPage.deselectStandardMulti("saab");
    List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
    Assert.assertTrue(actualSelectedOptions.contains("Volvo"), "\n Volvo is not selected as an option\n");
    Assert.assertTrue(actualSelectedOptions.contains("Opel"), "\n Opel is not selected as an option\n");
    Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab is selected as an option\n");
    Assert.assertTrue(actualSelectedOptions.contains("Audi"), "\n Audi is not selected as an option\n");

  }
}
