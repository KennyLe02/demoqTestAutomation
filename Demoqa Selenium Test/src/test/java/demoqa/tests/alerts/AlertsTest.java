package demoqa.tests.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import demoqa.base.BaseTest;
import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {
  @Test
  public void testInformationAlert() {
    String expectedAlertText = "You clicked a button";
    var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
    alertsPage.clickInformationAlertButton();
    Assert.assertEquals(getAlertText(), expectedAlertText, "Acutal & expected messages do not match");

    /*
     * if we want to perform an action after verifying this alert, we must have the
     * method below, otherwise it'll pop up an error since we did not close the OK
     * button
     */
    acceptAlert();
  }

  @Test
  public void testConfirmationAlert() {
    var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
    alertsPage.clickConfirmationAlertButton();
    dismissAlert();
    String actualConfirmationResult = alertsPage.getConfirmationResult();
    String expectedConfirmationResult = "You selected Cancel";
    Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
        "\n You Did Not Select Cancel \n");
  }

  @Test
  public void testPromptAlert() {
    String alertText = "Selenium With Java";
    String expectedResult = "You entered " + alertText;

    var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
    alertsPage.clickPromptAlertButton();
    setAlertText(alertText);
    acceptAlert();
    String actualResult = alertsPage.getPromptAlertResult();
    Assert.assertEquals(actualResult, expectedResult,
        "\n Actual & Expected Results Do Not Match \n");

  }
}
