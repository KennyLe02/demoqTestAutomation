package com.demoqa.elements;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBoxPage extends ElementsPage {
  private By fullNameField = By.id("userName");
  private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
  private By submitButton = By.id("submit");
  private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

  public String getCurrentAddress() {
    explicitWaitUntilVisible(5, currentAddressResult);
    return getText(currentAddressResult);
  }

  public void clickSubmitButton() {
    scrollToElementJS(submitButton);
    click(submitButton);
  }

  public void setCurrentAddress(String address) {
    find(currentAddressField).sendKeys(address + Keys.ENTER);
    // do not use set, because it will clear the information before sending the keys
  }

  public void setFullName(String name) {
    scrollToElementJS(fullNameField);
    sendKeys(find(fullNameField), Keys.chord(name));
  }

  public void setEmail(String email) {
    setFullName(Keys.chord(Keys.TAB, email));
  }

}
