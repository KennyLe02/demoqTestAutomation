package demoqa.tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
  @Test
  public void testRadioButton() {
    var formsPage = homePage.goToForms().clickPracticeForm();
    formsPage.clickFemaleRadioButton();
    boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
    Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female radio button is not selected \n");
  }
}
