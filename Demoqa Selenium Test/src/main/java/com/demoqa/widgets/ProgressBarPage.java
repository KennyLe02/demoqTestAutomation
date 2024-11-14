package com.demoqa.widgets;

import static utilities.WaitUtility.fluentWaitUntilVisible;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;

public class ProgressBarPage extends WidgetsPage {
  private By startButton = By.id("startStopButton");
  private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

  public void clickStartButton() {
    click(startButton);
  }

  public String getProgressValue() {
    fluentWaitUntilVisible(30, progressValue);
    return getText(progressValue);
  }
}
