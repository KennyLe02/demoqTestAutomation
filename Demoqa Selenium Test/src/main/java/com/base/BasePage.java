package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
  // abstract prevents child classes from creating instances
  public static WebDriver driver;

  public void setDriver(WebDriver driver) {
    BasePage.driver = driver;
  }

  protected WebElement find(By locator) {
    return driver.findElement(locator);
  }

  protected void set(By locator, String text) {
    find(locator).clear(); // if there is data in the element, then we will clear it
    find(locator).sendKeys(text); // no data when we sendKeys. We have a void method because sendKeys is a void
                                  // method
  }

  protected void click(By locator) {
    find(locator).click(); // we're going to find an element and then click it
  }

  // delay method. only use for demo purposes and not on the job
  public static void delay(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException exc) {
      exc.printStackTrace();
    }
  }
}
