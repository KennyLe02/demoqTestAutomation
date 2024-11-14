package demoqa.tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {
  @Test
  public void testCheckBox() {
    var formsPage = homePage.goToForms().clickPracticeForm();
    formsPage.clickSportsHobbyCheckbox();
    formsPage.clickReadingHobbyCheckbox();
    formsPage.clickMusicHobbyCheckbox();

    formsPage.unclickReadingHobbyCheckbox();

    boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
    Assert.assertFalse(isReadingCheckboxSelected, "\nReading checkbox is selected\n");
  }
}
