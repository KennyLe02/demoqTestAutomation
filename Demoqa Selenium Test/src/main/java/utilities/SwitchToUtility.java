package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility {
  private static WebDriver.TargetLocator switchTo() {
    return driver.switchTo();
  }

  public static String getAlertText() {
    return switchTo().alert().getText();
  }

  public static void acceptAlert() {
    switchTo().alert().accept(); // purpose of accept is to designed to automatically click the OK button
  }

  public static void dismissAlert() {
    switchTo().alert().dismiss();
  }

  // lets us enter words in the prompt

  public static void setAlertText(String text) {
    switchTo().alert().sendKeys(text);
  }

  // converts iframe, so we don't get an error in our test
  public static void switchToFrameString(String value) {
    switchTo().frame(value);
  }

  public static void switchToDefaultContent() {
    switchTo().defaultContent();
  }

  public static void switchToFrameIndex(int index) {
    switchTo().frame(index);
  }

  public static void switchToFrameElement(WebElement element) {
    switchTo().frame(element);
  }

  public static void switchToWindow(String handle) {
    switchTo().window(handle);
  }
}
