package com.demoqa.widgets;

import static utilities.JavaScriptUtility.*;

import java.util.List;

import static utilities.DropDownUtility.*;

import org.openqa.selenium.By;

public class SelectMenuPage extends WidgetsPage {
  private By standardMultiSelect = By.id("cars");

  public void selectStandardMulti(String text) {
    scrollToElementJS(standardMultiSelect);
    // selecting a dropdown contains a select tag name
    // Select select = new Select(find(standardMultiSelect)); //created a class in
    // another package, so this is no longer needed
    // select.selectByVisibleText(text); // most popular method for selecting from
    // drop down menu
    selectByVisibleText(standardMultiSelect, text);
  }

  // overload method
  public void selectStandardMulti(int index) {
    scrollToElementJS(standardMultiSelect);
    selectByIndex(standardMultiSelect, index);
  }

  public void deselectStandardMulti(String value) {
    scrollToElementJS(standardMultiSelect);
    deselectByValue(standardMultiSelect, value);
  }

  public List<String> getAllSelectedStandardMultiOptions() {
    return getAllSelectedOptions(standardMultiSelect);
  }
}
