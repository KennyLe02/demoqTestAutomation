package com.demoqa.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage {
  private By visibleAfterButton = By.id("visibleAfter");

  public String getVisibleAfterButtonText() {
    // Selenium executes the test so wait that we need to have it wait
    // This allows us to test dynamic elements
    explicitWaitUntilVisible(5, visibleAfterButton);
    String visibleText = getText(visibleAfterButton);
    System.out.println("Button Text: " + visibleText);
    return visibleText;
  }
}
