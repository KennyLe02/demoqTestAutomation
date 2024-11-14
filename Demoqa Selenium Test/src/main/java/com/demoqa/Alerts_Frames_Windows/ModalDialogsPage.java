package com.demoqa.Alerts_Frames_Windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage {
  private By smallModalButton = By.id("showSmallModal");
  private By smallModalText = By.xpath("//div[contains(text(),'Small Modal')]");
  private By smallCloseButton = By.id("closeSmallModal");

  /*
   * private By bigModalButton = By.id("showLargeModal");
   * private By bigModalText = By.xpath("//div[contains(text(),'Large Modal')]");
   * private By bigCloseButton = By.id("closeLargeModal");
   */
  public void clickSmallModalButton() {
    click(smallModalButton);
  }

  public String getSmallModalText() {
    return find(smallModalText).getText();
  }

  public void clickCloseButton() {
    click(smallCloseButton);
  }

}
