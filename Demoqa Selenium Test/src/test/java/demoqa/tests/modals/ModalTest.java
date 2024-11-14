package demoqa.tests.modals;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.base.BaseTest;

public class ModalTest extends BaseTest {
  @Test
  public void testModalDialog() {
    var awfPage = homePage.goToAlertsFramesWindowsCard();
    var modalDialogPage = awfPage.clickModalDialogs();
    modalDialogPage.clickSmallModalButton();
    String actualText = modalDialogPage.getSmallModalText();
    Assert.assertTrue(actualText.contains("Small Modal"), "\n The message does not contain small modal\n");

    modalDialogPage.clickCloseButton();
  }

}
