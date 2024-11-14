package com.demoqa.Alerts_Frames_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {
  private By newWindowButton = By.id("windowButton");

  public void clickNewWindowButton() {
    click(newWindowButton);

  }

  public void switchToNewWindow() {
    // step 1:Get current "Main" window handle
    String currentHandle = driver.getWindowHandle();
    System.out.println("Main Window ID: " + currentHandle + "\n");

    // Step 2: get all window handles
    Set<String> allHandles = driver.getWindowHandles();
    System.out.println("Number of open Windows: " + allHandles.size());

    for (String handle : allHandles) {
      if (currentHandle.equals(handle)) {
        System.out.println("1st Window ID: " + handle);
      } else {
        // driver.switchTo().window(handle); //made this into a method in the
        // SwitchToUtility
        switchToWindow(handle);
        System.out.println("2nd Window Id: " + handle);
      }
    }
    // step 3:switch to the new window using the window handle

  }
}
